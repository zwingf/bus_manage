package com.ics.bus_manage.web.userAccount;

import com.ics.bus_manage.biz.IUserAccountService;
import com.ics.bus_manage.dal.entity.UserAccountEntity;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by PC on 2017/8/3.
 */
@Controller
@RequestMapping("/userAccountWeb")
public class UserAccountWeb {

    @Autowired
    private IUserAccountService iUserAccountService;

    @RequestMapping("/selectFirstPageMassege")
    @ResponseBody
    public Map<String,Object> selectFirstPageMassege(Integer cityCode, Integer timeType, Date begin, Date end){
        return iUserAccountService.selectFirstPageMassege(cityCode, timeType, begin, end);
    }

    //所有注册用户查询
    @RequestMapping("/selectAllRegisterUser.do")
    @ResponseBody
    public List<UserAccountEntity> selectAllRegisterUser(){
        List<UserAccountEntity> allRegisterUserList = iUserAccountService.selectAllRegisterUser();
        return allRegisterUserList;
    }

    //根据注册地区和手机号查询注册用户
    @RequestMapping("/selectRegisterUserByCityCode.do")
    @ResponseBody
    public List<UserAccountEntity> selectRegisterUserByCityCode(HttpServletRequest request) {
        String citycode = request.getParameter("cityCode");
        String phone = request.getParameter("phone");
        List<UserAccountEntity> registerUserList = iUserAccountService.selectRegisterUserByCityCode(citycode,phone);
        return registerUserList;
    }

    //根据日期（周、月、年统计新增用户--<新增注册用户>和注册用户--<app注册>的数据）
    @RequestMapping("/selectCountByRegisterDate.do")
    @ResponseBody
    public Object selectCountByRegisterDate(Integer registerDate) {
        registerDate = 0;
        //查询注册用户
        Object obj = iUserAccountService.selectCountByRegisterDate(registerDate);
        return obj;
    }

    //导出注册用户报表
    @RequestMapping("/RegisterTableDownload.do")
    public void RegisterTableDownload(HttpServletResponse response) throws Exception {
        //创建一个webbook，对应一个excel文件
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        //在webbook中添加一个sheet，对应excel表中的sheet
        HSSFSheet sheet = hssfWorkbook.createSheet();
        //在sheet中添加表头第0行
        HSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("序号");
        row.createCell(1).setCellValue("注册日期");
        row.createCell(2).setCellValue("注册地区");
        row.createCell(3).setCellValue("手机号");
        row.createCell(4).setCellValue("姓名");
        row.createCell(5).setCellValue("身份证号");
        //写入实体数据
        List<UserAccountEntity> allRegisterUserList = iUserAccountService.selectAllRegisterUser();
        for (int i = 0; i < allRegisterUserList.size(); i++) {
            row = sheet.createRow(i + 1);
            UserAccountEntity userAccountEntity = allRegisterUserList.get(i);
            row.createCell(0).setCellValue(userAccountEntity.getUserId());
            row.createCell(1).setCellValue(userAccountEntity.getRegisterDate());
            row.createCell(2).setCellValue(userAccountEntity.getCityCode());
            row.createCell(3).setCellValue(userAccountEntity.getPhone());
            row.createCell(4).setCellValue(userAccountEntity.getName());
            row.createCell(5).setCellValue(userAccountEntity.getUserIdentity());
        }
        //浏览器端下载excel(可以另存到指定的目录，目前测试支持IE、谷歌，其他浏览器没有测试)
        OutputStream out = null;
        try {
            out = response.getOutputStream();
            String fileName = "注册用户报表.xls";// 文件名
            response.setContentType("application/x-msdownload");//告诉浏览器返回数据的格式
            response.setHeader("Content-Disposition", "attachment; filename="
                    + URLEncoder.encode(fileName, "UTF-8"));//告诉浏览器返回的数据打开的方法
            hssfWorkbook.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
