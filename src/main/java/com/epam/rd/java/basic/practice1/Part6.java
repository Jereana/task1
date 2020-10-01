package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {

        int step = 2;
        int count = 0;
        StringBuilder resStr;
        int number;
       
        if (args.length != 1) {
            return; 
        }

        if (args[0].equals("0")) {
            System.out.print("");
            return;
        }

        try {
            number = Integer.parseInt(args[0]);
        } catch (Exception exp1) {
            System.out.print(exp1);
            return;
        }
		int countNumbers  = (9*number - 1); 
        if (number == 1) {
            System.out.print("2");
            return;
        }

        int[] Array = new int[countNumbers]; 
        Array[0] = step;

        for (int i = 1; i < countNumbers; i++) { 
            Array[i] = Array[i - 1] + 1;
        }

        do {
            for (int i = (2 * step - 2); i < countNumbers; i += step) { 
                Array[i] = 0;
            }
            for (int j = 0; j < countNumbers; j++) {
                if ((Array[j] != 0) && (Array[j] > step)) {
                    step = Array[j];
                    break;
                }
            }
        } while (step * step < countNumbers);

        resStr = new StringBuilder("2");

        for (int z = 1; z < 9 * number; z++){
            if (Array[z] != 0) {
                resStr.append(" ").append(Array[z]);
                count++;
                if (count == number - 1) break;
            }
        }
        System.out.print(resStr.toString());
    }
}
