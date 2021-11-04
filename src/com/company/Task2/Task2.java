package com.company.Task2;

public class Task2 {
    public static void main(String[] args) {
        String[] symbol = new String[]{"a", "b", "c", "c", "c"};
        int count = 0;
        char find = 'c';
        for (int i = 0; i < symbol.length; i++) {
            if (symbol[i].contains(String.valueOf(find))) {
                count++;
            }
        }
        System.out.println(count);
    }
}
