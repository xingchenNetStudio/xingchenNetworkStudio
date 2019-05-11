package com.huaxin.commodity;

/**
 * @Author: WuZhenglin
 * @Date: 2019/5/10 22:03
 * @Description: 代码的世界里没有未知事件
 */
public class Pen extends Thing{
    private String penName;
    private Double penPrice;
    private String penColor;
    private Integer penNum;
    public double total;

    public Pen(String penName, Double penPrice, String penColor) {
        this.penName = penName;
        this.penPrice = penPrice;
        this.penColor = penColor;
    }

    public Pen() {
    }

    @Override
    public String toString() {
        return "Pen{" +
                "penName='" + penName + '\'' +
                ", penPrice=" + penPrice +
                ", penColor='" + penColor + '\'' +
                '}';
    }

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public Double getPenPrice() {
        return penPrice;
    }

    public void setPenPrice(Double penPrice) {
        this.penPrice = penPrice;
    }

    public String getPenColor() {
        return penColor;
    }

    public void setPenColor(String penColor) {
        this.penColor = penColor;
    }

    public Integer getPenNum() {
        return super.getPen();
    }

    public void setPenNum(Integer penNum) {
        this.penNum = penNum;
    }
}
