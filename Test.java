package Threadsss;

public class Test {
    private static int num = 1;
    private String name;

        // This says that if name isn't provided by the user use 1st name = "manjit" as default: calling
        // another constructor of same class
    public Test(){
        this.name = "Manjit";
    }

    public Test(String name){
        this.name = name;
    }
    public static void increment(){
        Thread thread = new Thread();

        Test.increment();       
        Test.increment();     
        Test.increment();     
        Test.increment();      
        Test.increment();
    }

    public static int display(){
        return num;
    }

    // public int show(){

    // }
}
