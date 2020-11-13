package com.itheima.oop;

/**
 * @author Administrator
 */
class Student {
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Demo{
    public static void main(String [] args){
        Student s = new Student();
        s.setName("小丽");
        s.setAge(16);
        System.out.println(s.getName() + "---" + s.getAge());
    }
}