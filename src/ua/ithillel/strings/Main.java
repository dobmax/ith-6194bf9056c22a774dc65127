package ua.ithillel.strings;

public class Main {

    public static void main(String[] args) {
        demo5();
    }

    static void demo6() {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("S");

        for (int i = 0; i < 10000000; i++) {
            sb.append("S");
        }

        System.out.println(sb.toString());


        System.out.println("Took time: " + (System.currentTimeMillis() - start));
    }

    static void demo5() {
        long start = System.currentTimeMillis();

        String multipleS = "S";

        for (int i = 0; i < 1000000; i++) {
            multipleS += "S";
        }

        System.out.println("Took time: " + (System.currentTimeMillis() - start));
    }

    static void demo6Exp() {
        long start = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("S");

        for (int i = 0; i < 50; i++) {
            sb.append(sb);
        }

        System.out.println("Took time: " + (System.currentTimeMillis() - start));
    }

    static void demo5Exp() {
        long start = System.currentTimeMillis();

        String multipleS = "S";

        for (int i = 0; i < 30; i++) {
            multipleS += multipleS;
        }

        System.out.println("Took time: " + (System.currentTimeMillis() - start));
    }

    static void demo4() {
        String abc = "abc";
        char[] chars = abc.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    static void demo3() {
        String abc1 = "abc";
        System.out.println(abc1.intern());
    }

    static void demo2() {
        String abc1 = "abc";
        String abc2 = new String("abc");
        String abc3 = "abc";
        String abc4 = abc3 + "d";

        System.out.println(abc1.equals(abc2));
        System.out.println(abc1 == abc2);
        System.out.println(abc1 == abc3);
        System.out.println(abc1 == abc4);
    }

    static void demo1() {
        char c1 = 'I';
        char c2 = 'T';
        char c3 = 66;
        char c4 = 'ы';

        System.out.println(c1 + c2 + c3);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }

}
