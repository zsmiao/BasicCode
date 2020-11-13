package com.itheima.string;

import java.util.Scanner;
/**
已知用户名和密码，请用程序实现模拟用户登录。
总共给三次机会，是否登录成功，给出相应的提示。反馈该题作答
 */
public class UserLogin {
    public static void main(String[] args) {
        String username = "root";
        String password = "toor";
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <=3; i++) {
            System.out.print("请输入用户名：>>>");
            String sc_username = scanner.nextLine();
            System.out.print("请输入密码：>>>");
            String sc_password = scanner.nextLine();
            if (username.equals(sc_username) && password.equals(sc_password)) {
                System.out.println("登录成功");
                break;
            } else {
                if (i == 3) {
                    System.out.println("请明天再试");
                    break;
                } else {
                    System.out.println("登录失败");
                    System.out.println("您还剩余" + (3 - i) + "次机会");
                }
            }

        }

    }
}
