import java.io.*; 
class Animal
{ 
   Animal()
   {
       System.out.println("Animal object is created"); 
   }
   void eat()
    { 
        System.out.println("Animal is eating");
    } 
} 
class Dog extends Animal
{ 
    String color ="black";
    Dog()
    {
        super();
        System.out.println("Dog object is created"); 
    }
    void printcolor()
    { 
        System.out.println("Dog color is"+color);
        super.eat();
    } 
} 
 public class superdemo3
{ 
    public static void main(String args[])
    { 
        Dog d = new Dog(); 
        d.printcolor(); 
    } 
}
