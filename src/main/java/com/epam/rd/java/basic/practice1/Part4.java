package com.epam.rd.java.basic.practice1;

public class Part4 {

    public static void main(String[] args) {
        
        int CountOfArgs = args.length;
        int num1;
        int num2;
        int tmp;
        
        if (CountOfArgs != 2) {
            return;
        }

        try {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
        }
        catch (Exception exp){
            System.out.print(exp);
            return;
        }

        while (num2 != 0) {
            tmp = num1%num2;
            num1 = num2;
            num2 = tmp;
        }
        System.out.print(num1);
    }
}
