package com.company;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int a = 0;
        int b = 0;
        System.out.println("Enter a number: ");
        i = sc.nextInt();
        System.out.println("Enter a second number: ");
        a = sc.nextInt();
        System.out.println("Enter a third number: ");
        b = sc.nextInt();
        if ((Math.abs(i)) < (Math.abs(b)) && (Math.abs(i)) < (Math.abs(a)) ) {
            System.out.println(i);
        }
        else if ((Math.abs(a)) < (Math.abs(i)) && (Math.abs(a)) < (Math.abs(b))) {
            System.out.println(a);

        }
        else {
            System.out.println(b);
        }


    }
}
