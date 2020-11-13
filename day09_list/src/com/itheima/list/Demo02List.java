package com.itheima.list;

import java.util.ArrayList;

public class Demo02List {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add("赵六");
        arrayList.remove(3);
        System.out.println(arrayList);
        arrayList.set(1,"王八");
        System.out.println(arrayList);
        arrayList.add(2,"杨幂");
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
        boolean empty = arrayList.isEmpty();
        System.out.println("empty = " + empty);
        int size = arrayList.size();
        System.out.println("size = " + size);
        System.out.println();
    }
}
