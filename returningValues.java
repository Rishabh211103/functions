package datastructures.practice.functions;

import java.util.Scanner;

public class returningValues {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
