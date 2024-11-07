import java.io.*;
class A
{
    void callMe()
    {
        System.out.println("I am from A");
    }
}
class B extends A
{
    void callMe()
    {
        System.out.println("I am from B");
    }
}
public class DMDDemo2
{
	public static void main(String[] args) {
	    A a1=new A();
		a1.callMe();
		A a2=new B();
		a2.callMe();
		B b=new B();
		b.callMe();
	}
}
