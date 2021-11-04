package com.company.Task1;

public class Task1 {
    public static void main(String[] args) {
        String[] row = new String[]{"Short1324234234", "Short1234534", "Short123", "Short1234"};
        String help;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < 3; i++) {
                if (row[i].length() > row[i + 1].length()) {
                    isSorted = false;
                    help = row[i];
                    row[i] = row[i + 1];
                    row[i + 1] = help;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(row[i]);
        }
    }
}
