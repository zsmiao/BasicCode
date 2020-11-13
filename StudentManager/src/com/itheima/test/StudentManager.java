package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> arrayList = new ArrayList<>();
        lo:
        while (true) {
            System.out.println("********学生信息管理系统********");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看学生");
            System.out.println("0 退出");
            System.out.print("请输入您的选择>>>");

            String choice = scanner.next();

            switch (choice) {
                case "1":
                    System.out.println("请录入学生的信息");
                    addStudent(arrayList);
                    break;
                case "2":
                    //System.out.println("*删除学生*");
                    deleteStudent(arrayList);
                    break;
                case "3":
                    System.out.println("*修改学生*");
                    updateStudent(arrayList);
                    break;
                case "4":
                    System.out.println("----学生基本信息表----");
                    queryStudent(arrayList);
                    break;
                case "0":
                    System.out.println("感谢您的使用！");
                    break lo;
                default:
                    System.out.println("您的输入有误，请您重新输入！");
                    break;
            }
        }
    }

    private static void updateStudent(ArrayList<Student> arrayList) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入要修改的学生学号>>>");
        String str = scanner.next();
        int index = getIndex(arrayList, str);
        if(index==-1){
            System.out.println("查无信息，请重新输入！");
        }else {
            System.out.print("请输入新的学生姓名>>>");
            String name = scanner.next();
            System.out.print("请输入新的学生年龄>>>");
            String age = scanner.next();
            System.out.print("请输入新的学生生日>>>");
            String birthday = scanner.next();
        }
    }

    public static void deleteStudent(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要删除的学生学号>>>");
        String str = scanner.next();
        int index = getIndex(arrayList, str);
        if (index == -1) {
            System.out.println("查无信息，请重新输入！");
        } else {
            arrayList.remove(index);
            System.out.println("删除成功！");
        }

    }

    public static void queryStudent(ArrayList<Student> arrayList) {
        if (arrayList.size() == 0) {
            System.out.println("无学生信息，请添加后重新查看!");
            return;
        }
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t生日");
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getSid() + "\t" + student.getName() + "\t\t" + student.getAge() + "岁" + "\t" + student.getBirthday());
        }
    }

    public static void addStudent(ArrayList<Student> arrayList) {
        Scanner scanner = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.print("请输入学号>>>");
            sid = scanner.next();
            int index = getIndex(arrayList, sid);
            if (index == -1) {
                break;
            }else {
                System.out.println("输入的学号已存在,请重新输入！");
            }
        }
        System.out.print("请输入姓名>>>");
        String name = scanner.next();
        System.out.print("请输入年龄>>>");
        int age = scanner.nextInt();
        System.out.print("请输入生日>>>");
        String birthday = scanner.next();

        Student student = new Student(sid, name, age, birthday);

        arrayList.add(student);
        System.out.println("添加成功");
    }

    public static int getIndex(ArrayList<Student> arrayList, String sid) {
        //假设传入的学号，在集合中不存在
        int index = -1;
        //遍历集合，获取每一个学生对象，准备进行查找
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            //获取每一个学生对象的学号
            String sid1 = student.getSid();
            //使用获取出的学生学号，和传入的学号进行比对
            if (sid1.equals(sid)) {
                index = i;
                break;
            }
        }
        return index;
    }
}