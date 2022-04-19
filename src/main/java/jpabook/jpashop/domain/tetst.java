package jpabook.jpashop.domain;

public class tetst {

    public static void main(String[] args) {
        String ex = "hi";

        String ex4 = "hi";

        String ex2 = "hello";

        String ex3 = new String("hello");
        String ex5 = new String("hello");

        System.out.println(ex == ex4);

        System.out.println(ex3 == ex5);
        System.out.println(ex3 instanceof String);
        System.out.println(System.identityHashCode(ex));
        System.out.println(System.identityHashCode(ex4));
        System.out.println(System.identityHashCode(ex2));
        System.out.println(System.identityHashCode(ex));
        System.out.println(System.identityHashCode(ex3));

    }
}
