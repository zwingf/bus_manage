package com.ics.bus_manage.web;

import com.ics.bus_manage.biz.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * Created by wing on 2017/7/31.
 *
 */
public class BaseWeb<T> {

    @Autowired
    private IBaseService<T> baseService;

    @RequestMapping("/getList")
    @ResponseBody
    public List<T> getList(T t) {
        return baseService.getList(t);
    }

    @RequestMapping("/add")
    @ResponseBody
    public void add(T t) {
        baseService.add(t);
    }

    @RequestMapping("/update")
    @ResponseBody
    public void update(T t) {
        baseService.update(t);
    }

    @RequestMapping("/delectById")
    @ResponseBody
    public void deleteById(Long id) {
        baseService.deleteById(id);
    }

    @RequestMapping("/selectById")
    @ResponseBody
    public T selectById(Long id) throws IOException {
        T t = baseService.selectById(id);
        return t;
    }
}
