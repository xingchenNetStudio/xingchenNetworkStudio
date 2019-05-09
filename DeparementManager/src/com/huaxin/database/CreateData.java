package com.huaxin.database;

import com.huaxin.entity.Department;
import com.huaxin.entity.Emp;

import java.util.Scanner;

/**
 * @Author: WuZhenglin
 * @Date: 2019/5/8 17:07
 * @Description: 代码的世界里没有未知事件
 */
public class CreateData {

    static Emp[] emps = new Emp[100];
    static Department[] departments = new Department[100];

    public static void createData() {
        //部门
        Department department_1 = new Department(1,"开发部");
        Department department_2 = new Department(2,"人事部");
        //开发部
        Emp emp_101 = new Emp(101,"Jack","后端开发",17000.00,89);
        Emp emp_102 = new Emp(102,"Sail","UI设计",15000.00,89);
        Emp emp_103 = new Emp(103,"Bob","后端开发",13000.00,89);
        Emp emp_104 = new Emp(104,"Sam","前端开发",16000.00,89);
        Emp emp_89 = new Emp(89,"Jame","部门经理",68000.00,null);
//        //人事部
//        Emp emp_111 = new Emp(111,"Qing","招聘",8000.00,87);
//        Emp emp_112 = new Emp(112,"Tom","面试",12000.00,87);
//        Emp emp_113 = new Emp(113,"Jane","管理",22000.00,87);
//        Emp emp_87 = new Emp(87,"Maria","经理",50000.00,87);
        departments[0] = department_1;
        departments[0].setEmp(new Emp[]{emp_101,emp_102,emp_103,emp_104,emp_89});

        emps[0] = emp_101;
        emps[1] = emp_102;
        emps[2] = emp_103;
        emps[3] = emp_104;
        emps[4] = emp_89;
        emps[0].setDepartment(department_1);
        emps[1].setDepartment(department_1);
        emps[2].setDepartment(department_1);
        emps[3].setDepartment(department_1);
        emps[4].setDepartment(department_1);
//        emps[4] = emp_111;
//        emps[5] = emp_112;
//        emps[6] = emp_113;
//        emps[7] = emp_87;


//        departments[1] = department_2;
//        departments[1].setEmp(new Emp[]{emp_111,emp_112,emp_113,emp_87});
    }

    public void printDepartment() {
        Emp[] emp = departments[0].getEmp();
        System.out.println("部门信息：");
        for (Department d:departments
             ) {
            if (d == null ){
                break;
            }
            System.out.println(d.toString());

        }
        System.out.println("该部门所属员工有：");
        for (Emp e : emp){
            if (e == null){
                break;
            }
            System.out.println(e);
            if (e.geteId().equals(89)){
                System.out.println("该部门领导者信息：");
                System.out.println(e);
            }
        }
    }

    public int printEmp() {
        System.out.println("开始查询员工号，输入'5'退出查询！！！");
        System.out.println("请输入员工号：");
        Scanner scanner = new Scanner(System.in);
        Integer eId = scanner.nextInt();

        if(eId.equals(5)){
            System.out.println("结束查询！！！");
            return 0;
        }else {
            for (Emp e:emps) {
                if (e == null) {
                    break;
                }
                if (e.geteId().equals(eId)) {
                    System.out.println(e);

                    selectManager(e);
                    break;
                }else {
                    System.out.println("无法找到您输入的员工号");
                    printEmp();
                }
            }
        }

        return 0;
    }
    public void selectManager(Emp emp){
        for (Emp emp1 : emps){
            if (emp1 == null ){
                break;
            }
            if (emp1.geteId().equals(emp.geteHeadId())){
                System.out.println("该员工所在部门经理信息：");
                System.out.println(emp1);
            }
        }
    }


}
