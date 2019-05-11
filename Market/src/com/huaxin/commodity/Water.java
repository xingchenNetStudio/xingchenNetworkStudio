package com.huaxin.commodity;

/**
 * @Author: WuZhenglin
 * @Date: 2019/5/10 21:47
 * @Description: 代码的世界里没有未知事件
 */
public class Water extends Thing  {
    String name;
    Double price;
    Integer num;
    public double total;
    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Water(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Water() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNum() {
        return super.getWater();
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
