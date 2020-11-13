package com.itheima.day07.opp02;

/**
 * 2、【编号：702】 请定义教师类（Teacher），属性包括姓名和工号。要求分别使用空参和有参构造方法创建对象，
 * 空参创建的对象通过setXxx赋值，有参创建的对象直接赋值。定义教课（teach）方法，输出“工号为xxx的xxx老师
 * 正在讲课”。
 */
public class Test02 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("王强");
        teacher.setJob(2020190809);
        teacher.teach();
        Teacher teacher1 = new Teacher("李强", 2020190808);
        teacher1.teach();

    }
}

class Teacher {
    private String name;
    private int job;

    public Teacher() {

    }

    public Teacher(String name, int job) {
        this.name = name;
        this.job = job;
    }

    public String getName(String 程辉) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJob() {
        return job;
    }

    public void setJob(int job) {
        this.job = job;
    }

    public void teach() {
        System.out.println("工号为：" + job + "的" + name + "老师正在讲课");
    }
}