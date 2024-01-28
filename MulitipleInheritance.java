interface A {
    void run();

}

interface B {
    void show();
}

public class MulitipleInheritance implements A, B {
    public void run() {
        System.out.println("hello");

    }
    public void show()
    {
        System.out.println("world");
    }

    public static void main(String[] args) {
        MulitipleInheritance m = new MulitipleInheritance();
        m.run();
        m.show();
    }
}
