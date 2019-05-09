package com.huaxin.entity;

/**
 * @Author: WuZhenglin
 * @Date: 2019/5/8 16:54
 * @Description: 代码的世界里没有未知事件
 *
 * *******************员工类**************************
 */
public class Emp {
    private Integer eId;    //员工ID
    private String eName;   //员工姓名
    private String job;     //员工职位
    private Double sal;     //员工工资
    private Integer eHeadId;//部门领导ID
    private Department department;  //所在部门

    //构造函数
    public Emp(){}
    public Emp(Integer eId, String eName, String job, Double sal, Integer eHeadId) {
        this.eId = eId;
        this.eName = eName;
        this.job = job;
        this.sal = sal;
        this.eHeadId = eHeadId;
    }

    public Emp(Integer eId, String eName, String job, Double sal, Integer eHeadId, Department department) {
        this.eId = eId;
        this.eName = eName;
        this.job = job;
        this.sal = sal;
        this.eHeadId = eHeadId;
        this.department = department;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Integer geteHeadId() {
        return eHeadId;
    }

    public void seteHeadId(Integer eHeadId) {
        this.eHeadId = eHeadId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                ", eHeadId=" + eHeadId +
                ", department=" + department +
                '}';
    }
}
