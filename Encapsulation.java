
class A { 
    private String name; 
    private int age;
    private int pin; 
  
    public String getName()
     { return name;
     } 
  
    public void setName(String name)
     {
         this.name = name;
         } 
  
    public int getAge() { 
        return age; 
    } 
  
    public void setAge(int age) { 
        this.age = age; 
    } 

public int getPin()
{
    return pin;
}
public void setPin(int pin){
    this.pin=pin;
}
}

    
public class Encapsulation {
    public static void main(String[] args) 
    { 
        A aa = new A(); 
        aa.setName("Satabdi M"); 
        aa.setAge(23); 
        aa.setPin(1222);
  
        System.out.println("Name: " + aa.getName()); 
        System.out.println("Age: " + aa.getAge());
        System.out.println("Pin: " +aa.getPin()); 
    } 
}
