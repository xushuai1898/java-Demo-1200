package com.vm321.d076;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符：");
        String inputStr = scan.next();

        System.out.println("输出：" + inputStr.replace("l", "L"));
    }
}
