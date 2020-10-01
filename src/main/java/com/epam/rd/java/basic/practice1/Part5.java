package com.epam.rd.java.basic.practice1;

public class Part5 {

    public static void main(String[] args) {

        int[] Num = new int[1];
        int num;
        int sum = 0;
        
        int CountOfArgs = args.length;

        if (CountOfArgs != 1) {
            return;
        } else {
            try {
                Num[0] = Integer.parseInt(args[0]);
                num = Num[0];

            } catch (Exception exp) {
                System.out.print(exp);
                return;
            }
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
        }

        System.out.print(sum);
    }
}
