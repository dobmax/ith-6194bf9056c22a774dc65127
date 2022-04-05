package ua.ithillel.oop.abstraction.homework;

public class Robot implements Participant{
    @Override
    public void run() {
        System.out.println("Robot is running...");
    }

    @Override
    public void jump() {
        System.out.println("Robot is jumping...");
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
