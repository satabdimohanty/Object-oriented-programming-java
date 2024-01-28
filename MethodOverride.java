class A 
{
    void add() 
    {
        System.out.println("inside A class");
    }

}

class B extends A 
{
    void add() 
    {
        super.add();
        System.out.println("inside B class");
    }

}

public class MethodOverride 
{
    public static void main(String[] args) 
    {
        B bb = new B();
        bb.add();

        A aaA = new B();
        aaA.add();

    }

}
