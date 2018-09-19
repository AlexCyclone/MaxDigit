package icu.cyclone.alex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            System.out.print("Type " + (i > 0 ? "next " : "") + "digit: ");
            int current = sc.nextInt();
            max = current > max ? current : max;
        }
        System.out.println("Max value: " + max);
    }
}
