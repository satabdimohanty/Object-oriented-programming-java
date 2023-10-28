
abstract class A{
abstract void run();//does not have any body
public void c()
{
    System.out.println(" i am inside A class");
}

}
class B extends A {
    public void run()
    {
        System.out.println(" i am inside B class");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        
    
    B bb=new B();
    bb.run();
    bb.c();
    
}
}