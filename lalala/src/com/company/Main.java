package com.company;
import java.util.*;
public class Main {
    public static int multiply(int n1, int n2) {
        int result = 0;
        boolean negative_num = (n1 < 0 && n2 >= 0) || (n2 < 0 && n1 >= 0);
        boolean positive_num = !negative_num;
        n1 = Math.abs(n1);
        for (int i = 0; i < n1; i++) {
            if (negative_num && n2 > 0 || positive_num && n2 < 0)
                result -= n2;
            else
                result += n2;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int n2 = in.nextInt();
        System.out.println("\nРезультат: " + multiply(n1,n2));
    }
}