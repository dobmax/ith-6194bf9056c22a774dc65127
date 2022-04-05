package ua.ithillel.oop.abstraction.homework;

public class Cat implements Participant {
    @Override
    public void run() {
        System.out.println("Cat is running...");
    }

    @Override
    public void jump() {
        System.out.println("Cat is jumping...");
    }

    @Override
    public int getRunDistance() {
        return 100;
    }

    @Override
    public int getJumpDistance() {
        return 20;
    }
}
