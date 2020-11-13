package com.itheima.list;

import java.util.ArrayList;

public class Demo04List {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("test");
        arrayList.add("why");
        arrayList.add("because");
        arrayList.add("test");
        arrayList.add("test");
        for (int i = arrayList.size() - 1; i <= 0; i--) {
            String s = arrayList.get(i);
            if ("test".equals(s)) {
                arrayList.remove(i);
            }
        }
        /*
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if("test".equals(s)){
                arrayList.remove(i);
                i--;
            }
        }
        */
        System.out.println(arrayList);
    }
}
