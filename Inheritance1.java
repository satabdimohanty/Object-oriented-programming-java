
class a{
    public void run()
    {
        int a=9,b=9;
        System.out.println(a*b);
    }
}
class b extends a{
    public void show()
    {
        int a=9,b=9;
        System.out.println(a+b);
    }
}
class c extends b{
    public void chow()
    {
        int a=10,b=20;
        System.out.println((a/b));
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        c cc=new c();
        cc.run();
        cc.show();
        cc.chow();

    }
    
}
