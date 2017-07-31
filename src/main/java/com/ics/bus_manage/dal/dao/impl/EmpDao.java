package com.ics.bus_manage.dal.dao.impl;

import com.ics.bus_manage.dal.dao.IEmpDao;
import com.ics.bus_manage.dal.entity.EmpEntity;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;



/**
 * Created by wing on 2017/7/28.
 */
@Repository
public class EmpDao extends BaseDao<EmpEntity> implements IEmpDao {

    /**
     * 构建查询条件
     * @param emp
     * @return
     */
    public DetachedCriteria getDetachedCriteria(EmpEntity emp){
        DetachedCriteria dc=DetachedCriteria.forClass(EmpEntity.class);
        if(emp!=null){
            if(emp.getEname()!=null &&  emp.getEname().trim().length()>0)
            {
                dc.add(Restrictions.like("ename", emp.getEname(), MatchMode.ANYWHERE));
            }
            if(emp.getJob()!=null &&  emp.getJob().trim().length()>0)
            {
                dc.add(Restrictions.like("job", emp.getJob(), MatchMode.ANYWHERE));
            }

        }
        return dc;
    }
}
