package com.huaxin.commodity;

/**
 * @Author: WuZhenglin
 * @Date: 2019/5/10 21:46
 * @Description: 代码的世界里没有未知事件
 */
public class Thing {
    private int water;
    private int pen;
    private int smoke;

    public Gift gift;

    public double total;

    public Thing(Integer water, Integer pen, Integer smoke) {
        super();
        this.water = water;
        this.pen = pen;
        this.smoke = smoke;
    }

    public Thing() {
    }

    public Integer getWater() {
        return water;
    }

    public void setWater(Integer water) {
        this.water = water;
    }

    public Integer getPen() {
        return pen;
    }

    public void setPen(Integer pen) {
        this.pen = pen;
    }

    public Integer getSmoke() {
        return smoke;
    }

    public void setSmoke(Integer smoke) {
        this.smoke = smoke;
    }
}
