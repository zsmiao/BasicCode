package com.itheima.day07.opp05;

/**
 * 定义项目经理类Manager。属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
 * 定义程序员类Coder。属性：姓名name，工号id，工资salary。行为：工作work()
 * 要求： 1.按照以上要求定义Manager类和Coder类,属性要私有,生成空参、有参构造，set和get方法​
 * 2.定义测试类,在main方法中创建该类的对象并给属性赋值(set方法或有参构造方法)​
 * 3.调用成员方法,打印格式如下:
 * 工号为123基本工资为15000奖金为6000的项目经理正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
 * 工号为135基本工资为10000的程序员正在努力的写着代码......
 */
public class Test05 {
    public static void main(String[] args) {
        Manager manager = new Manager("项目经理", 123, 15000, 6000);
        manager.work();
        Coder coder = new Coder("程序员", 135, 10000);
        coder.work();
    }
}

class Manager {
    private String name;
    private int id;
    private int salary;
    private int bonus;

    public Manager() {

    }

    public Manager(String name, int id, int salary, int bonus) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "奖金为" + bonus + "的" + name + "正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....");
    }
}

class Coder {
    private String name;
    private int id;
    private int salary;

    public Coder() {

    }

    public Coder(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("工号为" + id + "基本工资为" + salary + "的" + name + "正在努力的写着代码.....");
    }
}