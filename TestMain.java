import java.util.stream.IntStream;
// Specialization of Stream interface for int primitive: Represents a stream of primitive int-valued elements

//public class TestMain extends Object{} --  every class is child class of Object class (native)
public class TestMain {
    public static void main(String args[]){

        TestValue testValue = new TestValue(1);

        //Thread t1 = new Thread(()-> testValue.increment());
        //Thread t2 = new Thread(()-> testValue.increment());
        Thread t1 = new Thread(()-> IntStream.range(1, 100).forEach(i -> testValue.increment()));
        // Can also be written as: Thread t1 = new Thread(() -> IntStream.range(1, 100).forEach(i -> testValue.increment()));
        t1.start();

        Thread t2 = new Thread(()-> IntStream.range(1, 100).forEach(i -> testValue.decrement()));
        //t1.start();
        t2.start();

        try{
            Thread.sleep(2000);
        }catch(Exception ex){

        }

        try{
            Thread.sleep(2000);
        }catch(Exception ex){

        }

        System.out.println(testValue);
    }
}
