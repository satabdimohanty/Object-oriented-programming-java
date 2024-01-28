class A
{
    static void add(int a,int b)
    {
        System.out.println(a+b);
    }
    static void add(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
}


public class Methodoverload {
    public static void main(String[] args) {
        A aa=new A();
        aa.add(1, 01);
        aa.add(12, 120, 122);
    }
    
}
