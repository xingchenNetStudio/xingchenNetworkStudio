package com.huaxin.database;

import com.huaxin.commodity.Pen;
import com.huaxin.commodity.Smoke;
import com.huaxin.commodity.Water;

/**
 * @Author: WuZhenglin
 * @Date: 2019/5/10 22:00
 * @Description: 代码的世界里没有未知事件
 */
public class DataBase {
    public Water[] waters = new Water[10];
    public Smoke[] smokes = new  Smoke[10];
    public Pen[] pens = new  Pen[10];

    public void makeData(){
        //water date
        Water water = new Water("农夫山泉",2.0);
        Water water1 = new Water("康师傅",1.0);
        Water water2 = new Water("怡宝",2.0);
        //smoke data
        Smoke smoke = new Smoke("红旗渠",11.0);
        Smoke smoke1 = new Smoke("小目标",14.0);
        Smoke smoke2 = new Smoke("黄鹤楼1916",500.0);
        //pen data
        Pen pen = new Pen("英雄：97",5.0,"墨绿色");
        Pen pen1 = new Pen("英雄：101",25.0,"银色");
        Pen pen2 = new Pen("烂笔头",15.0,"黑色");

        //添加数据
        waters[0] = water;
        waters[1] = water1;
        waters[2] = water2;

        smokes[0] = smoke;
        smokes[1] = smoke1;
        smokes[2] = smoke2;

        pens[0] = pen;
        pens[1] = pen1;
        pens[2] = pen2;

    }
}
