import java.io.*;
import java.lang.String;
public class ThreadRunnableDemo implements Runnable
{
    public void run()
    {
        System.out.println("The thread is created and is running");
    }
    public static void main(String args[]) 
    {
        ThreadRunnableDemo ob=new ThreadRunnableDemo();
        Thread t=new Thread(ob);
        t.start();
    }
}
