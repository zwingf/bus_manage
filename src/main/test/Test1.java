import com.ics.bus_manage.biz.ICardTransactService;
import com.ics.bus_manage.dal.dao.ICardTransactDao;
import com.ics.bus_manage.dal.entity.EmpEntity;
import com.ics.bus_manage.dal.entity.UserApplyRecordsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.SessionHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by wing on 2017/7/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test1 {

    @Autowired
    private ICardTransactService service;

    @Autowired
    private SessionFactory sessionFactory;

    public void setUp() throws Exception {
        Session s = sessionFactory.openSession();
        TransactionSynchronizationManager.bindResource(sessionFactory, new SessionHolder(s));
    }

    public void tearDown() throws Exception {
        SessionHolder holder = (SessionHolder) TransactionSynchronizationManager.getResource(sessionFactory);
        Session s = holder.getSession();
        s.flush();
        TransactionSynchronizationManager.unbindResource(sessionFactory);
    }

    @Test
    public void demo1() throws SQLException, ParseException {
//        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String startDate = new String("2017-05-04 09:57:16");
        String endDate = new String("2017-08-07 10:30:00");
    /*    Date parse = format.parse(s);
        Time time = new Time(parse.getTime());
        UserApplyRecordsEntity entity = new UserApplyRecordsEntity();
        entity.setApplyId(78);
        entity.setApplyTime(time);*/
//        service.add(entity);
        HashMap map = new HashMap();
        map.put("cityCode", "2154");
        map.put("startDate", startDate);
        map.put("endDate", endDate);
        map.put("cardType", "1");
        List list = service.getList(map);

        System.out.println(list);
    }
}
