import java.util.Arrays;

public class NextDayCalculator {
    public static String showNext(String input) {
        String[] elements = input.split("/");
        String oldDate = elements[0];
        int date = Integer.parseInt(oldDate);
        String oldMonth = elements[1];
        int month = Integer.parseInt(oldMonth);
        String oldYear = elements[2];
        int year = Integer.parseInt(oldYear);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (date == 31) {
                    date = 1;
                    month += 1;
                } else {
                    date += 1;
                }
                break;
            case 12:
                if (date == 31) {
                    date = 1;
                    month = 1;
                    year += 1;
                } else {
                    date += 1;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (date == 30) {
                    date = 1;
                    month += 1;
                } else {
                    date += 1;
                }
                break;
            case 2:
                boolean isLeap = checkLeapYear(year);
                if (isLeap) {
                    if (date == 29) {
                        date = 1;
                        month = 3;
                    } else {
                        date += 1;
                    }
                } else {
                    if (date == 28) {
                        date = 1;
                        month = 3;
                    } else {
                        date += 1;
                    }
                }
                break;
        }
        return date + "/" + month + "/" + year;
    }

    public static boolean checkLeapYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
            }
        }
        return isLeap;
    }
}
