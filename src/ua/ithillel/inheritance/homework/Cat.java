package ua.ithillel.inheritance.homework;

/**        SOLID
 *           |
 *  Interface Segregation
 **/
public class Cat extends Animal {
    @Override
    public void run(int distance) {
        System.out.println("Cat ran " + distance);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats cannot swim even they can, they just do not want.");
    }
}
