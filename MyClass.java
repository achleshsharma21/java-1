import java.util.*;
class A
{
    public void talk()
    {
        System.out.println("Hi! I am A class");
    }
}
class B extends A 
{
    public void talk()
    {
        System.out.println("Hi! I am B class");
    }
}
public class MyClass {
    public static void main(String args[]) {
      A obj=new B();
     obj.talk(); 
    }
}