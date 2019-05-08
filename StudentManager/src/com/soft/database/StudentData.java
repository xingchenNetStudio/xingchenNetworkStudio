package com.soft.database;


import com.soft.entity.Student;
import com.soft.entity.User;

import java.util.Scanner;

/**
 * @Author:wuhzhenglin
 * @Date: 2019/5/7 10:39
 */
public class StudentData {

    static Student[] students = new Student[100];
    static User[] users = new User[100];
    static Scanner scanner = new Scanner(System.in);

    public static void makeData() {
        //写入学生信息数据
        Student student = new Student(1701050, "李数数", "男", 28, 1);
        Student student1 = new Student(1701051, "刘庆然", "男", 30, 1);
        Student student2 = new Student(1701052, "徐文东", "男", 18, 1);
        Student student3 = new Student(1701053, "张苗苗", "女", 18, 1);
        Student student4 = new Student(1701054, "大宝剑", "男", 28, 2);
        //存入Student对象数组中
        students[0] = student;
        students[1] = student1;
        students[2] = student2;
        students[3] = student3;
        students[4] = student4;
        //写入用户信息数据
        User user = new User("aa", "123456");
        User user1 = new User("bb", "123456");
        //存入users对象数组中
        users[0] = user;
        users[1] = user1;
    }

    /**
     * isLogin() 审核用户名和密码
     */
    public boolean isLogin(User user) {
        String username = user.getUsername();
        String password = user.getPassword();

        for (int i = 0; i < users.length; i++) {

            if (users[i] == null) {
                break;
            } else {
                if ((username.equals(users[i].getUsername())) & (password.equals(users[i].getPassword()))) {
                    return true;
                } else {
                    return false;
                }
            }

        }
        return true;
    }

    /**
     * select() 查询函数
     */
    public void select() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            } else {
                System.out.println(students[i].getInfo());
            }

        }
    }

    /**
     * add() 增加函数
     */
    public void add() {
        System.out.println("请输入共添加？条学生信息");
        int infoNum = scanner.nextInt();
        int stuNum = 0;

        for (int i = 1; i <= infoNum; i++) {
            System.out.println("现在请输入第" + i + "条数据");

            System.out.println("请输入学号：");
            Integer sId = scanner.nextInt();
            System.out.println("请输入姓名：");
            String sName = scanner.next();
            System.out.println("请输入性别：");
            String sSex = scanner.next();
            System.out.println("请输入年龄：");
            Integer sAge = scanner.nextInt();
            System.out.println("请输入班级：");
            Integer sClass = scanner.nextInt();

            Student student = new Student(sId, sName, sSex, sAge, sClass);

            for (int j = 0; j < students.length; j++) {
                if (students[j] == null) {
                    stuNum = j;
                    break;
                }
            }
            students[stuNum] = student;
        }
    }

    /**
     * modify() 修改函数
     */
    public int modify() {
        select();
        int fieldNum;

        System.out.println("请输入需要修改学生的学号：");
        Integer id = scanner.nextInt();

        for (int j = 0; j < students.length; j++) {
            if (students[j] == null) {
                break;
            } else {
                if (id.equals(students[j].getsId())) {
                    while (true) {
                        System.out.println("请输入您需要修改的信息字段编号：1.学号 " +
                                "2.姓名 " +
                                "3.性别 4.年龄 5.班级 6.结束");
                        fieldNum = scanner.nextInt();
                        System.out.println("请输入您需要修改的信息：");
                        switch (fieldNum) {
                            case 1:
                                students[j].setsId(scanner.nextInt());
                                System.out.println("修改成功！！！");
                                break;
                            case 2:
                                students[j].setsName(scanner.next());
                                System.out.println("修改成功！！！");
                                break;
                            case 3:
                                students[j].setsSex(scanner.next());
                                System.out.println("修改成功！！！");
                                break;
                            case 4:
                                students[j].setsAge(scanner.nextInt());
                                System.out.println("修改成功！！！");
                                break;
                            case 5:
                                students[j].setsClass(scanner.nextInt());
                                System.out.println("修改成功！！！");
                                break;
                            case 6:
                                return 0;
                            default:
                                System.out.println("输入的编号有误请重新输入：");
                                break;
                        }

                    }
                }
            }
        }
        return 0;
    }

    /**
     * delete() 删除函数
     */
    public void delete() {
        select();

        System.out.println("请输入您想删除的学生信息的学号：");
        Integer sId = scanner.nextInt();
        int num=0;
        for (int j = 0; j < students.length; j++) {
            for (int i = j + 1; i < students.length; i++) {
                if (students[j] != null) {
                    if (students[j].getsId().equals(sId)) {
                        students[j] = students[i];
                        num = j;
                        break;
                    }
                    break;
                }
            }
            if (students[j] == null)
                break;
        }
        for (int j = num+1;j<students.length;j++){
            if (students[j] == null){
                break;
            }else {
                for (int k = j + 1; k <= students.length; k++) {
                    students[j] = students[k];
                    break;
                }
            }
        }
    }
}