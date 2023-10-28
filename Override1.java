class A {

    void show() {
        System.out.println("I AM PERFORMING METHOD OVERRIDING");
    }
}

class B extends A {
@Override
    void show() {
        System.out.println("I AM PERFORMING METHOD OVERRIDING");
    }

}

public class Override1 {
    public static void main(String[] args) {
        
    
A aa=new B();
aa.show();
aa.show();
}
}
