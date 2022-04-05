package ua.ithillel.inheritance.homework;

public class Dog extends Animal {
    @Override
    public void run(int distance) {
        System.out.println("Dog ran " + distance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Dog swim" + distance);
    }
}
