interface A
{
    void run();
}
public class Interface1 implements A {
   public void run()
    {
        System.out.println("Interface 1");
    }

    public static void main(String[] args) {
        Interface1 i = new Interface1();
        i.run();
    }
}