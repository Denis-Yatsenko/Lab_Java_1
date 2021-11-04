package com.company.Task3;

public class Task3 {
    public static void main(String[] args) {
        int[] numArr = new int[]{3, 1, 2, 4, 5};
        char[] symbolArr = new char[]{'f', '^', '&', '*', 's'};
        String stringArr = "";
        for (int i = 0; i < 10; i++) {
            if (i < numArr.length) {
                stringArr += Integer.toString(numArr[i]);
                stringArr += Character.toString(symbolArr[i]);
            }
        }
        System.out.println(stringArr);

    }
}
