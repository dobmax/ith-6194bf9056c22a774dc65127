package ua.ithillel;

import ua.ithillel.encapsulation.second.Animal;

public class Main {
    public static void main(String[] args) {
        Animal strangeAnimal = new Animal();
        strangeAnimal.setEyeColor("Black");
        strangeAnimal.setEyeColor("Brown");

//        strangeAnimal.eyeColor = "Black";
//        strangeAnimal.eyeColor = "Brown";

    }

    void test1() {
        Animal strangeAnimal = new Animal();
        strangeAnimal.setEyeColor("Brown");
//        strangeAnimal.eyeColor = "Brown";
    }
}
