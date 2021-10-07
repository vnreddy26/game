package com.company;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter u r marks in order maths physics  chemistry English Telugu");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a4 = sc.nextInt();
        int a5 = sc.nextInt();
        float per=((a1+a2+a3+a4+a5)/500.0f)*100.0f;
        System.out.println(" marks percentage = "+per);
    }
}
