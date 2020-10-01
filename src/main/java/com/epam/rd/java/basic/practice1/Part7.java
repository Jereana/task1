package com.epam.rd.java.basic.practice1;

public class Part7 {

    public static void main(String[] args) {
        String[] Input = {"A","B","Z","AA","AZ","BA","ZZ","AAA"};
        String arrow = " ==> ";
        for (String s : Input) {
            int n = str2int(s);
            System.out.print(s + arrow + n + arrow + int2str(n) + "\n");
        }
    }

    public static int str2int(String str) {
        String s = str.replaceAll("\\s", "");
        int result = 0;
        for (char c : s.toCharArray()) {
            result = result * 26 + (c - 'A') + 1;
        }
        return result;
    }

    public static int linearSearch(String arr[], String elementToSearch) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(elementToSearch)) {
                index = i + 1;
                break;
            }
        }
        return index;
    }


    public static String int2str(int number) {
        StringBuilder resStr = new StringBuilder();

        while (number > 0) {
            number--;
            char ch = (char) (number % 26 + 'A');
            number /= 26;
            resStr.append(ch);
        }
        resStr.reverse();
        return resStr.toString();
    }

    public static String rightColumn(String number) {
        return int2str(str2int(number) +1);
    }
}
