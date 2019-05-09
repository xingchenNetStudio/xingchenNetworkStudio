package com.huaxin.test;

import com.huaxin.database.CreateData;
import com.huaxin.entity.Department;
import com.huaxin.entity.Emp;

/**
 * @Author: WuZhenglin
 * @Date: 2019/5/8 17:50
 * @Description: 代码的世界里没有未知事件
 */
public class Test01 {

    static Emp emp = new Emp();
    static Department department = new Department();

    public static void main(String[] args) {
        CreateData createData = new CreateData();
        CreateData.createData();

        createData.printDepartment();
        createData.printEmp();
        
    }
}
