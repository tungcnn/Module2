package com.example.readnumbertostring;
import java.util.Scanner;

public class ReadNumberToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
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
            boolean isSmaller15 = 0 < number && number <= 15;
            if (number == 0) {
                mess = "Zero";
            } else if (isSmaller15) {
                mess = numberTo15(number);
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
                        }
                        else {
                            mess = "Out of ability";
                        }
                    }
                }
            }
            System.out.println(mess);
        }
    }
    static public String numberTo15 (int number) {
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
            case 11 -> "Eleven";
            case 12 -> "Twelve";
            case 13 -> "Thirteen";
            case 14 -> "Fourteen";
            case 15 -> "Fifteen";
            default -> "";
        };
    }
    static public String numberTo20 (int number) {
        int ones = number % 10;
        String one = numberTo15(ones);
        return one+"teen";
    }
    static public String numberTo100 (int number) {
        int ones = number%10;
        int tens = (number - ones)/10;
        return switch (tens) {
            case 2 -> "Twenty " + numberTo15(ones);
            case 3 -> "Thirty " + numberTo15(ones);
            case 4 -> "Forty " + numberTo15(ones);
            case 5 -> "Fifty " + numberTo15(ones);
            case 6 -> "Sixty " + numberTo15(ones);
            case 7 -> "Seventy " + numberTo15(ones);
            case 8 -> "Eighty " + numberTo15(ones);
            case 9 -> "Ninety " + numberTo15(ones);
            default -> "";
        };
    }
    static public String numberTo1000 (int number) {
        int hundreds = Integer.parseInt(Integer.toString(number).substring(0, 1));
        number = number%100;
        String a = number < 20?
                number <= 15?
                        numberTo15(number):numberTo20(number):"";
        return switch (hundreds) {
            case 1 -> "One hundred " + a + numberTo100(number);
            case 2 -> "Two hundred " + a + numberTo100(number);
            case 3 -> "Three hundred " + a + numberTo100(number);
            case 4 -> "Four hundred " + a + numberTo100(number);
            case 5 -> "Five hundred " + a + numberTo100(number);
            case 6 -> "Six hundred " + a + numberTo100(number);
            case 7 -> "Seven hundred " + a + numberTo100(number);
            case 8 -> "Eight hundred " + a + numberTo100(number);
            case 9 -> "Nine hundred " + a + numberTo100(number);
            default -> "";
        };
    }
}