import java.io.*; 
class Animal
{ 
    String color ="white"; 
} 
class Dog extends Animal
{ 
    String color ="black"; 
    void printcolor()
    { 
        System.out.println("Dog color is"+color); 
        System.out.println("Animal color is"+super.color); 
    } 
} 
 public class superdemo1
{ 
    public static void main(String args[])
    { 
        Dog d = new Dog(); 
        d.printcolor(); 
    } 
}
