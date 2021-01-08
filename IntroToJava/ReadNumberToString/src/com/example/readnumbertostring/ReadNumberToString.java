package com.example.readnumbertostring;

import java.util.Scanner;

public class ReadNumberToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            boolean loop = true;
            int number = 0;
            do {
                System.out.println("Enter a number: ");
                String str = input.nextLine();
                try {
                    number = Integer.parseInt(str);
                    loop = false;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a proper number");
                }
            } while (loop);
            String mess = "";
            boolean isSmaller10 = 0 < number && number <= 10;
            if (number == 0) {
                mess = "Zero";
            } else if (isSmaller10) {
                mess = numberTo10(number);
            } else {
                boolean isSmaller20 = number < 20;
                if (isSmaller20) {
                    mess = numberTo20(number);
                } else {
                    boolean isSmaller100 = number < 100;
                    if (isSmaller100) {
                        mess = numberTo100(number);
                    } else {
                        boolean isSmaller1000 = number < 1000;
                        if (isSmaller1000) {
                            mess = numberTo1000(number);
                        } else {
                            mess = "Out of ability";
                        }
                    }
                }
            }
            System.out.println(mess);
        }
    }

    static public String numberTo10(int number) {
        return switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            case 10 -> "Ten";
            default -> "";
        };
    }

    static public String numberTo20(int number) {
        return switch (number) {
            case 11 -> "Eleven";
            case 12 -> "Twelve";
            case 13 -> "Thirteen";
            case 14 -> "Fourteen";
            case 15 -> "Fifteen";
            case 16 -> "Sixteen";
            case 17 -> "Seventeen";
            case 18 -> "Eighteen";
            case 19 -> "Nineteen";
            default -> "";
        };
    }

    static public String numberTo100(int number) {
        int ones = number % 10;
        int tens = (number - ones) / 10;
        String oneStr = numberTo10(ones).toLowerCase();
        return switch (tens) {
            case 2 -> "Twenty " + oneStr;
            case 3 -> "Thirty " + oneStr;
            case 4 -> "Forty " + oneStr;
            case 5 -> "Fifty " + oneStr;
            case 6 -> "Sixty " + oneStr;
            case 7 -> "Seventy " + oneStr;
            case 8 -> "Eighty " + oneStr;
            case 9 -> "Ninety " + oneStr;
            default -> "";
        };
    }

    static public String numberTo1000(int number) {
        int hundreds = Integer.parseInt(Integer.toString(number).substring(0, 1));
        number = number % 100;
        String a = number < 20 ?
                number <= 10 ?
                        numberTo10(number).toLowerCase() : numberTo20(number).toLowerCase() : "";
        String b = a + numberTo100(number).toLowerCase();
        return switch (hundreds) {
            case 1 -> "One hundred " + b;
            case 2 -> "Two hundred " + b;
            case 3 -> "Three hundred " + b;
            case 4 -> "Four hundred " + b;
            case 5 -> "Five hundred " + b;
            case 6 -> "Six hundred " + b;
            case 7 -> "Seven hundred " + b;
            case 8 -> "Eight hundred " + b;
            case 9 -> "Nine hundred " + b;
            default -> "";
        };
    }
}