package test;

public class Test2 {

    static void def(I i) {
        System.out.println(i.abc("privmjmjjjhet"));
    }

    public static void main(String[] args) {
        def(String::length);
    }

}


interface I {
    int abc(String s);
}