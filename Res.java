public class Res {
    public static void main(String[] args){
        String resource1 = "Nepal";
        String resource2 = "America";

        Thread t1 = new Thread (() -> {
                // locking resource1
                synchronized(resource1){ 
                    System.out.println(resource1);
                
                    // locking resource2
                    synchronized(resource2){
                        System.out.println(resource2);
                   }
                }
        });
        // synchronize() locks the resource
        // This is deadlock case, where resource2 is unaccessible as it's locked within resource1. Hence, those 
        //resources can't be accessed by thread - t2.

        Thread t2 = new Thread (() -> {
            synchronized(resource2){
                System.out.println(resource2);
            
                synchronized(resource1){
                    System.out.println(resource1);
            }
        }
    });

    t1.start();
    t2.start();
    }
}