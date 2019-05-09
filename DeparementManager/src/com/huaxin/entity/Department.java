package com.huaxin.entity;

import java.util.Arrays;

/**
 * @Author: WuZhenglin
 * @Date: 2019/5/8 16:53
 * @Description: 代码的世界里没有未知事件
 *
 * ********************部门类************************
 */
public class Department {

    private Integer dId;
    private String dName;
    private Emp[] emp;

    public Department(){}

    public Department(Integer dId,String dName,Emp[] emp){
        this.dId = dId;
        this.dName = dName;
        this.emp = emp;
    }

    public Department(Integer dId, String dName) {
        this.dId = dId;
        this.dName = dName;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public Emp[] getEmp() {
        return emp;
    }

    public void setEmp(Emp[] emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "{" +
                "dId=" + dId +
                ", dName='" + dName+"}";
    }
}
