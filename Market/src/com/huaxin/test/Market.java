package com.huaxin.test;

import com.huaxin.commodity.*;
import com.huaxin.database.DataBase;
import com.huaxin.gift.Book;
import com.huaxin.gift.Candy;
import com.huaxin.gift.Oil;
import java.util.Scanner;

/**
 * @Author: WuZhenglin
 * @Date: 2019/5/10 21:44
 * @Description: 代码的世界里没有未知事件
 */
public class Market {
    static Thing thing = new Thing();
    static Scanner s = new Scanner(System.in);
    static DataBase dataBase = new DataBase();
    static Water[] waters = dataBase.waters;
    static Pen[] pens = dataBase.pens;
    static Smoke[] smokes = dataBase.smokes;
    static double waterTotalPrice = 0.00;
    static double penTotalPrice = 0.00;
    static double smokeTotalPrice = 0.00;

    /**
     * @param args
     */
    public static void main(String[] args) {
        //添加数据
        boolean value = true;
        dataBase.makeData();

        System.out.println("************欢迎光临鑫达鑫超市******************");
        while (value) {
            System.out.println("1.购买 2.结账  3.退出系统");
            int choose = s.nextInt();
            switch (choose) {
                case 1:
                    Buy();
                    break;
                case 2:
                    Pay();
                    value = false;
                    System.out.println("欢迎下次光临");
                case 3:
                    value = false;
                    //System.out.println("欢迎下次光临");
                default:
                    break;
            }
        }
    }

    private static void Buy() {
        boolean value = true;
        while (value) {
            System.out.println("您可以购买的商品：1.矿泉水  2.钢笔    3.烟     4.购买结束");
            System.out.println("请输入购买的商品编号：");
            int choose = s.nextInt();
            switch (choose) {
                case 1:
                    water();
                    break;
                case 2:
                    pen();
                    break;
                case 3:
                    smoke();
                    break;
                case 4:
                    System.out.println("购买结束");
                    value = false;
                    break;
                default:
                    System.out.println("您输入的商品有误，请重新输入");
                    break;
            }
        }
    }

    private static void smoke() {
        int i = 1;
        int num;
        for (Smoke s : smokes) {

            if (s == null) {
                break;
            }
            System.out.println(i + " " + s.toString());
            i++;
        }
        System.out.println(i + " 结束购买");
        System.out.println("请输入购买的商品编号：");
        num = s.nextInt();
        switch (num) {
            case 1:
                System.out.println("请输入购买数量：");
                Integer quantity = s.nextInt();
                smokes[num - 1].setSmoke(quantity);
                smokes[num - 1].total = quantity * smokes[num - 1].getSmokePrice();
                smoke();
                break;
            case 2:
                System.out.println("请输入购买数量：");
                Integer quantity1 = s.nextInt();
                smokes[num - 1].setSmoke(quantity1);
                smokes[num - 1].total = quantity1 * smokes[num - 1].getSmokePrice();
                smoke();
                break;
            case 3:
                System.out.println("请输入购买数量：");
                Integer quantity2 = s.nextInt();
                smokes[num - 1].setSmoke(quantity2);
                smokes[num - 1].total = quantity2 * smokes[num - 1].getSmokePrice();
                smoke();
                break;
            case 4:
                System.out.println("购买结束");
                break;
        }
    }

    private static void pen() {
        int i = 1;
        int num;
        for (Pen p : pens) {

            if (p == null) {
                break;
            }
            System.out.println(i + " " + p.toString());
            i++;
        }
        System.out.println(i + " 结束购买");
        System.out.println("请输入购买的商品编号：");
        num = s.nextInt();
        switch (num) {
            case 1:
                System.out.println("请输入购买数量：");
                int quantity = s.nextInt();
                pens[num - 1].setPen(quantity);
                pens[num - 1].total = quantity * pens[num - 1].getPenPrice();
                pen();
                break;
            case 2:
                System.out.println("请输入购买数量：");
                int quantity1 = s.nextInt();
                pens[num - 1].setPen(quantity1);
                pens[num - 1].total = quantity1 * pens[num - 1].getPenPrice();
                pen();
                break;
            case 3:
                System.out.println("请输入购买数量：");
                int quantity2 = s.nextInt();
                pens[num - 1].setPen(quantity2);
                pens[num - 1].total = quantity2 * pens[num - 1].getPenPrice();
                pen();
                break;
            case 4:
                System.out.println("购买结束");
                break;
        }
    }


    private static void water() {
        //water  购买方法
        int i = 1;
        int num;
        for (Water w : waters) {

            if (w == null) {
                break;
            }
            System.out.println(i + " " + w.toString());
            i++;
        }
        System.out.println(i + " 结束购买");
        System.out.println("请输入购买的商品编号：");
        num = s.nextInt();
        switch (num) {
            case 1:
                System.out.println("请输入购买数量：");
                Integer quantity = s.nextInt();
                waters[num - 1].setWater(quantity);
                waters[num - 1].total = quantity * waters[num - 1].getPrice();
                water();
                break;
            case 2:
                System.out.println("请输入购买数量：");
                Integer quantity1 = s.nextInt();
                waters[num - 1].setWater(quantity1);
                waters[num - 1].total = quantity1 * waters[num - 1].getPrice();
                water();
                break;
            case 3:
                System.out.println("请输入购买数量：");
                Integer quantity2 = s.nextInt();
                waters[num - 1].setWater(quantity2);
                waters[num - 1].total = quantity2 * waters[num - 1].getPrice();
                water();
                break;
            case 4:
                System.out.println("购买结束");
                break;
        }
    }

    private static void Pay() {
        // 结账
        System.out.println("请问您要哪样赠品  1.书 2.糖果 3.油");
        Integer next = s.nextInt();
        Gift gift = null;
        double sum;
        switch (next) {
            case 1:
                gift = new Book();
                break;
            case 2:
                gift = new Candy();
                break;
            case 3:
                gift = new Oil();
            default:
                break;
        }

        thing.gift = gift;
        //
        for (Water w : waters
        ) {
            if (w == null) {
                break;
            }
            waterTotalPrice = waterTotalPrice + w.total;

            if (w.getWater() != 0) {
                System.out.println("您购买的物品信息：" + w.toString() + "数量为：" + w.getWater());
                //System.out.println("总价为："+waterTotalPrice);
            }
        }

        //
        for (Pen p : pens) {
            if (p == null) {
                break;
            }
            penTotalPrice += p.total;
            if (p.getPen() != 0) {
                System.out.println("您购买的物品信息：" + p.toString() + "数量为：" + p.getPen());
                //System.out.println("总价为："+penTotalPrice);
            }

        }
        for (Smoke s : smokes) {
            if (s == null) {
                break;
            }
            smokeTotalPrice += s.total;
            if (s.getSmoke() != 0) {
                System.out.println("您购买的物品信息：" + s.toString() + "数量为：" + s.getSmoke());
                //System.out.println("总价为："+smokeTotalPrice);
            }
        }
        sum = waterTotalPrice + penTotalPrice + smokeTotalPrice;
        System.out.println("总价为：" + sum);
    }

}
