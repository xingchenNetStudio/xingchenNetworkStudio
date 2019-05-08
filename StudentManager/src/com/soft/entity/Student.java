package com.soft.entity;

/**
 * @Author:wuzhenglin
 * @Date: 2019/5/7 10:30
 */
public class Student {
    private Integer sId;
    private String sName;
    private String sSex;
    private Integer sAge;
    private Integer sClass;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public Integer getsAge() {
        return sAge;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public Integer getsClass() {
        return sClass;
    }

    public void setsClass(Integer sClass) {
        this.sClass = sClass;
    }

    public Student() {
    }

    public Student(Integer sId, String sName, String sSex, Integer sAge, Integer sClass) {
        this.sId = sId;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sClass = sClass;
    }
    public String getInfo(){
        //Student[sId = ,sName = ,sSex = ,s]
        return "Student[sId = "+ sId +
                    ",sName = "+ sName+
                    ",sSex = " + sSex+
                    ",sAge = " + sAge+
                    ",sClass = "+ sClass;
    }
}
