package ua.ithillel.inheritance.homework;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = getAnimals();

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(150);
            animals[i].swim(250);
        }
    }

    static Animal[] getAnimals() {

        return null;
    }
}
