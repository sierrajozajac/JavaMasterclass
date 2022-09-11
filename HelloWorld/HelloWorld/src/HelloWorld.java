import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        printHelloInputName();
        printHelloGivenName("Norman");
        printHelloUnlessItsTim("Abigail");
        printHelloUnlessItsTim("Tim");

        printNumberSum(10, 6, 12);
        printNumberSum(10*2, 5-16, (9*5)+6);
        printNumberMinus1Thousand(213098);
    }

    public static void printHelloInputName() {
        System.out.println("Please type your name.");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void printHelloGivenName(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void printHelloUnlessItsTim(String name) {
        if (name.equals("Tim")) System.out.println("Oh hi Tim -_-");
        else System.out.println("Hello, " + name + "!");
    }

    public static void printNumberSum(int firstNumber, int secondNumber, int thirdNumber) {
        int myTotal = firstNumber + secondNumber + thirdNumber;
        System.out.println("My total: " + myTotal);
    }

    public static void printNumberMinus1Thousand(int num) {
        int total = num - 1000;
        System.out.println(num + " - 1000 = " + total);
    }


}