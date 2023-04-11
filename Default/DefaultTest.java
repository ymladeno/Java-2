package Default;

interface Foo1 {
    default void foo() {
        System.out.println("Foo1::foo");
    }
};

interface Foo2 {
    default void foo() {
        System.out.println("Foo2::foo");
    }
};

public class DefaultTest implements Foo1, Foo2 {
    public static void main(String[] args) {
        DefaultTest test = new DefaultTest();
        test.foo();
    }

    @Override
    public void foo () {
        Foo1.super.foo();
    }
}
