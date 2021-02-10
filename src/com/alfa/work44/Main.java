package com.alfa.work44;

public class Main {
    public static void main(String[] args) {
        int curNumber=0;
        int maxNumber=300;
        int cntNumber=0;
        while (curNumber++ < maxNumber){
            if (curNumber % 3 == 0 || curNumber % 4 == 0) {
                if(++cntNumber > 10) break;
                System.out.println(curNumber);
            }
        }
    }
}