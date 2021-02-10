package com.alfa.work41;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Value 1: ");
        int inValue1 = scan.nextInt();
        System.out.println("Enter Value 2: ");
        int inValue2 = scan.nextInt();
        System.out.println("Enter Value 3: ");
        int inValue3 = scan.nextInt();
        int maxValue=inValue1;
        if (inValue2>maxValue) maxValue=inValue2;
        if (inValue3>maxValue) maxValue=inValue3;
        System.out.println("\nMax value of: "+inValue1+","+inValue2+","+inValue3+"\nIs: "+maxValue);
    }
}
