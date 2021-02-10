package com.alfa.work42;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Value 1: ");
        int inValue = scan.nextInt();
        String outValue="Другое";
        if (inValue == 1) outValue = "Один";
        else if (inValue == 2) outValue = "Два";
        else if (inValue == 3) outValue = "Три";
        else if (inValue == 4) outValue = "Четыре";
        else if (inValue == 5) outValue = "Пять";
        else if (inValue == 6) outValue = "Шесть";
        else if (inValue == 7) outValue = "Семь";
        else if (inValue == 8) outValue = "Восемь";
        else if (inValue == 9) outValue = "Девять";
        System.out.println("\nInput Value (if): "+outValue);

        switch (inValue){
            case 1: outValue = "Один";
                break;
            case 2: outValue = "Два";
                break;
            case 3: outValue = "Три";
                break;
            case 4: outValue = "Четыре";
                break;
            case 5: outValue = "Пять";
                break;
            case 6: outValue = "Шесть";
                break;
            case 7: outValue = "Семь";
                break;
            case 8: outValue = "Восемь";
                break;
            case 9: outValue = "Девять";
                break;
            default: outValue = "Другое";
        }
        System.out.println("\nInput Value (case): "+outValue);
    }
}
