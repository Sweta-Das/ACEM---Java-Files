package Threadsss;
public class Main1 {
    static int x = 0;
    public static void main(String[] args)
    {
      int j = 10000;
        
        Thread t1 = new Thread(()->
        {
            for (int i = 0; i<j; i++)
            {
             x++;   
            }
        });
        t1.setName("Ram");
        t1.start();


        Thread t2 = new Thread(()->
        {
            for (int i = 0; i<j; i++)
            {
             x++;   
            }
        });
        t2.setName("Hari");
        t2.start();

        Thread t3 = new Thread(
            ()-> {
                for (int i = 0; i<j; i++)
                {
                 x++;   
                }
        }
        ); 
        t3.setName("Shyam");
        t3.start();

        Thread t4 = new Thread(()-> 
        {
            for (int i = 0; i<j; i++)
            {
             x++;   
            }
        });
        t4.setName("Sita");
        t4.start();

        Thread t5 = new Thread(()-> 
        {
            for (int i = 0; i<j; i++)
            {
             x++;   
            }
        });
        t5.setName("Gita");
        t5.start();

        System.out.println("Output: "+x);
            }
}
