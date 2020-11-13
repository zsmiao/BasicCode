package com.itheima.day08;

import java.util.Scanner;
import java.util.Random;

/**
 * 在登录注册页面中，除了用户名和密码外，通常也会包含验证码。
 * 验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
 * 请查看Random、StringBuilder相关API，定义方法，获取一个包含4个字符的验证码，
 * 每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。例如：7Kt5
 */
public class Test08 {
    public static void main(String[] args) {
        String str = "0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
        String[] str2 = str.split(",");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            int index = 0;
            String randomStr = "";
            for (int i = 0; i < 4; i++) {
                index = random.nextInt(str2.length);
                randomStr += str2[index];
            }
            System.out.println("验证码：" + randomStr);
            System.out.print("请输入验证码>>>");
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase(randomStr)) {
                System.out.println("验证成功！");
                break;
            } else {
                System.out.println("验证失败，请重试！");
            }

        }
    }

}

