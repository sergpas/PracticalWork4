package com.alfa.work43;

public class Main {
    public static void main(String[] args) {
        int curNumber=0;
        int maxNumber=0;
        while (++maxNumber < 9){
            curNumber=maxNumber;
            System.out.println("");
            System.out.print(curNumber);
            while (--curNumber > 0){
                System.out.print(" "+curNumber);
            }
        }
    }
}