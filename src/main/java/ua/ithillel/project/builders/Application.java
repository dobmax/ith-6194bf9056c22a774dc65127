package ua.ithillel.project.builders;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println(new HelloWorld().greetingMessage(args[0]));
    }
}
