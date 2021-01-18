public class FizzBuzz {
    public static String translateNumber(int number) {
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleBy5 = number % 5 == 0;
        boolean isContain3 = false;
        boolean isContain5 = false;
        int firstNum = 0;
        int secondNum = 0;
        if (number > 10) {
            firstNum = (number - number % 10)/10;
            secondNum = number % 10;
            isContain3 = secondNum == 3 || firstNum == 3;
            isContain5 = secondNum == 5 || firstNum == 5;
        }

        if (isDivisibleBy3 && isDivisibleBy5 || number == 35 || number == 53)
            return "FizzBuzz";
        else  if (isDivisibleBy5 || isContain5)
            return  "Buzz";
        else if (isDivisibleBy3 || isContain3)
            return "Fizz";
        else if (number < 10)
            return showNumber(number);
        else
            return showNumber(firstNum) + " " + showNumber(secondNum);
    }
    public static String showNumber(int number) {
        String[] arr = {"mot", "hai", "", "bon", "", "sau", "bay", "tam", "chin"};
        return arr[number - 1];
    }
}
