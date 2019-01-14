package com.michaelpearcey.teaching;

public class FunctionExample {

    public static void main(String[] args) {
        printHello();
        String toPrint = "Hello Guys and Gals!";
        printText(toPrint);

        int product = multiply(4, 5);
        System.out.println(product);
    }

    private static void printHello() {
        System.out.println("Hello!");
    }

    private static void printText(String text) {
        System.out.println(text);
    }

    private static int multiply(int x, int y) {
        return x*y;
    }

}
