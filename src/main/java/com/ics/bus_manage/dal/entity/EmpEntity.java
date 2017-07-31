package com.ics.bus_manage.dal.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

/**
 * Created by wing on 2017/7/28.
 */
@Entity
@Table(name = "EMP", schema = "SCOTT", catalog = "")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer" })
public class EmpEntity implements Serializable {
    private long empno;
    private String ename;
    private String job;
    private Long mgr;
    private Time hiredate;
    private Long sal;
    private Long comm;

    @Override
    public String toString() {
        return "EmpEntity{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + comm +
                '}';
    }

    @Id
    @Column(name = "EMPNO")
    public long getEmpno() {
        return empno;
    }

    public void setEmpno(long empno) {
        this.empno = empno;
    }

    @Basic
    @Column(name = "ENAME")
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Basic
    @Column(name = "JOB")
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Basic
    @Column(name = "MGR")
    public Long getMgr() {
        return mgr;
    }

    public void setMgr(Long mgr) {
        this.mgr = mgr;
    }

    @Basic
    @Column(name = "HIREDATE")
    @JsonFormat(pattern="yyyy-MM-dd")
    public Time getHiredate() {
        return hiredate;
    }

    public void setHiredate(Time hiredate) {
        this.hiredate = hiredate;
    }

    @Basic
    @Column(name = "SAL")
    public Long getSal() {
        return sal;
    }

    public void setSal(Long sal) {
        this.sal = sal;
    }

    @Basic
    @Column(name = "COMM")
    public Long getComm() {
        return comm;
    }

    public void setComm(Long comm) {
        this.comm = comm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpEntity empEntity = (EmpEntity) o;

        if (empno != empEntity.empno) return false;
        if (ename != null ? !ename.equals(empEntity.ename) : empEntity.ename != null) return false;
        if (job != null ? !job.equals(empEntity.job) : empEntity.job != null) return false;
        if (mgr != null ? !mgr.equals(empEntity.mgr) : empEntity.mgr != null) return false;
        if (hiredate != null ? !hiredate.equals(empEntity.hiredate) : empEntity.hiredate != null) return false;
        if (sal != null ? !sal.equals(empEntity.sal) : empEntity.sal != null) return false;
        if (comm != null ? !comm.equals(empEntity.comm) : empEntity.comm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (empno ^ (empno >>> 32));
        result = 31 * result + (ename != null ? ename.hashCode() : 0);
        result = 31 * result + (job != null ? job.hashCode() : 0);
        result = 31 * result + (mgr != null ? mgr.hashCode() : 0);
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        result = 31 * result + (sal != null ? sal.hashCode() : 0);
        result = 31 * result + (comm != null ? comm.hashCode() : 0);
        return result;
    }
}
