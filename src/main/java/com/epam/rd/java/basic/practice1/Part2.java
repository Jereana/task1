package com.epam.rd.java.basic.practice1;

public class  Part2 {

    public static void main(String[] args) {
        
        int SumResult = 0;
        int CountOfArgs = args.length;

        if (CountOfArgs == 0) {
            return;
        }
        else {
            for (int i = 0; i < CountOfArgs; i++){  
                try {
                    SumResult = SumResult + Integer.parseInt(args[i]);
                }
                catch (Exception e){
                    System.out.print(e);
                    return;
                }
            }
        }
            System.out.print(SumResult);
    }
}
