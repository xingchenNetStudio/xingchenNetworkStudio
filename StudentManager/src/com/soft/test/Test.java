package com.soft.test;

import com.soft.database.StudentData;
import com.soft.entity.User;

import java.util.Scanner;

/**
 * @Author:wuzhenglin
 * @Date: 2019/5/7 10:37
 */
public class Test {

    static Scanner scanner = new Scanner(System.in);
    static StudentData studentData = new StudentData();
    static User user = new User();

    public static void main(String[] args) {

        StudentData.makeData();

        System.out.println("***欢迎来到软件一班学生管理系统***");
        System.out.println("请选择登陆方式 1.用户登录 2.管理员登陆");

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                userLogin();
                break;
            case 2:
                break;
            default:
                System.out.println("不好意思，您输入错误，请重新输入");
                break;
        }
    }

    private static void userLogin() {

        System.out.println("请输入用户名：");
        String username = scanner.next();

        System.out.println("请输入密码:");
        String password = scanner.next();

        user = new User(username,password);

        boolean login = studentData.isLogin(user);

        if(login){
            System.out.println("登陆成功");
            crud();
        }else {
            System.out.println("登陆失败");
            userLogin();
        }
    }

    private static void crud() {
        boolean value = true;
        while(value) {
            System.out.println("1.查询学生 2.增加学生 3.修改学生 4.劝退学生 5.退出登陆");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentData.select();
                    break;
                case 2:
                    studentData.add();
                    break;
                case 3:
                    studentData.modify();
                    break;
                case 4:
                    studentData.delete();
                    System.out.println("删除学生信息成功！！！");
                    break;
                case 5:
                    System.out.println("退出系统成功！！！");
                    value = false;
                    break;

            }
        }
    }
}
