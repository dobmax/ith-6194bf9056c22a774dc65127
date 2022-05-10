package ua.ithillel.exceptions.classwork;

public class Main {

    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 2;

    public static void main(String[] args) {
        foo1();
    }

    static void foo1() {
        System.out.println("Foo1 Before");
        foo2();
        System.out.println("Foo1 After");
    }

    static void foo2() {
        try {
            String decartCoordinate = getDecartCoordinate(-1, 6);
            System.out.println("Coordinate: " + decartCoordinate);
        } catch (CoordinateOutRangeException ex) {
            ex.printStackTrace();
            System.out.println("SWW while consideration of coordinates.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Something went wrong with parameters.");
        } catch (Exception ex) {
            System.out.println("SWW");
        }
    }


    static String getDecartCoordinate(int x, int y) {
        if (false) throw new IllegalArgumentException("TEST");
        try {
            checkCoordinate(x);
            checkCoordinate(y);
        } catch (CoordinateRangeException ex) {
            String message = String.format("Coordinates are invalid: x: %s, y: %s", x, y);
            throw new CoordinateOutRangeException(message, ex);
        }
        return String.format("[%s, %s]", x, y);
    }

    static void checkCoordinate(int coordinate) throws CoordinateRangeException {
        if (coordinate < MIN_RANGE || coordinate > MAX_RANGE) {
            throw new CoordinateRangeException("Coordinate is out of range.");
        }
    }

}
