package Threadsss;

public class Main2 {
    public static void main(String args[])
    {
        Thread thread = new Thread(() -> System.out.println("B"));
        thread.start(); 
    }
}
