package main.java.com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        if (args.length > 0) {
            System.out.println("Arguments passed:");
            for (String arg : args) {
                System.out.println(arg.length());
                System.out.println(arg);
            }
        } else {
            System.out.println("No arguments provided.");
        }

    }
}