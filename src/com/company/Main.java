package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a [] = new int [n];
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        for (int j = 0; j < n; j++) {
            if (a[j] == x) {
                System.out.print(j + 1);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.print("NO");
        }
    }
}