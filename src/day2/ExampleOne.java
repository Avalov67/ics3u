package day2;

public class ExampleOne {
    public static void main(String[] args) {
        // add the digits from a four digit number

        int number = 2756;

        int digit1 = number / 1000;
        int digit2 = number / 100 % 10;     // 2756 / 100 = 27, 27 % 10 = 7
        int digit3 = number / 10 % 10;
        int digit4 = number % 10;

        System.out.println(digit1 + digit2 + digit3 + digit4);

        // print out 20 --> 2 + 7 + 5 + 6




    }
}
