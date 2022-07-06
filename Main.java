public class Main {
    public static void main(String[] args)
    {
        //System.out.println("Output: "+1/0);
        //System.out.println("HelloWorld");
        //System.out.println("Nepal");
       // System.out.println(Thread.currentThread().getName());  // calls method of class without creating object...here, 
                //currentThread() is a static method that gives thread object

        Thread t1 = new Thread(()->
        {
            while(true){
                System.out.println(Thread.currentThread().getName());
            }
        });
        t1.setName("Ram");
        t1.start();


        Thread t2 = new Thread(()->
        {
            while(true){
                System.out.println(Thread.currentThread().getName());
            }
        });
        t2.setName("Hari");
        t2.start();

        Thread t3 = new Thread(
            ()-> {
            while(true){
                System.out.println(Thread.currentThread().getName());
            }
        }
        ); 
        t3.setName("Shyam");
        t3.start();

        Thread t4 = new Thread(()-> 
        {
            while(true){
                System.out.println(Thread.currentThread().getName());
            }
        });
        t4.setName("Sita");
        t4.start();

        Thread t5 = new Thread(()-> 
        {
            while(true){
                System.out.println(Thread.currentThread().getName());
            }
        });
        t5.setName("Gita");
        t5.start();
            }
}
