interface A {
    void show();
}

interface B extends A {
    void print();
}

public class Interface3 implements B {
    public void show() {
        System.out.println("hello");
    }

    public void print() {
        System.out.println("world");
    }
    public static void main(String[] args) {
        Interface3 i = new Interface3();
        i.show();
        i.print();
    }

}
