
package com.epam.rd.java.basic.practice1;

public class Part3 {
    public static void main(String[] args) {

        int CountOfArgs = args.length;
        StringBuilder str;

        if (CountOfArgs == 0) {
            System.out.print("");
            return;
        }
        else {
            str = new StringBuilder(args[0]);
            for (int i = 1; i < CountOfArgs; i++) {
            str.append(" ");
            str.append(args[i]);
            }
            System.out.print(str.toString());
        }
    }
}
