package com.huaxin.commodity;

/**
 * @Author: WuZhenglin
 * @Date: 2019/5/10 22:05
 * @Description: 代码的世界里没有未知事件
 */
public class Smoke extends Thing {
    String smokeName;
    Double smokePrice;
    Integer smokeNum;
    public double total;

    public Smoke(String smokeName, Double smokePrice) {
        this.smokeName = smokeName;
        this.smokePrice = smokePrice;
    }

    public Smoke() {
    }

    @Override
    public String toString() {
        return "Smoke{" +
                "smokeName='" + smokeName + '\'' +
                ", smokePrice=" + smokePrice +
                '}';
    }

    public String getSmokeName() {
        return smokeName;
    }

    public void setSmokeName(String smokeName) {
        this.smokeName = smokeName;
    }

    public Double getSmokePrice() {
        return smokePrice;
    }

    public void setSmokePrice(Double smokePrice) {
        this.smokePrice = smokePrice;
    }

    public Integer getSmokeNum() {
        return super.getSmoke();
    }

    public void setSmokeNum(Integer smokeNum) {
        this.smokeNum = smokeNum;
    }
}
