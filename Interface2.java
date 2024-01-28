/**
 * InnerInterface2
 */
interface InnerInterface2 {
    void run();

}

class A implements InnerInterface2 {
    public void run() {
        System.out.println("hello");

    }

}

class B implements InnerInterface2 {
    public void run() {
        System.out.println("world");
    }
}


public class Interface2 {

    public static void main(String[] args) {
        InnerInterface2 i = new B();
        {
            i.run();
            InnerInterface2 ii = new A();
            ii.run();
            
        }
        ;
    }
}
