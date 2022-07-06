public class TestValue extends Object{
    
        private Integer num;

        public TestValue(Integer num){
            this.num = num;
        }

        // // Locking whole funtion
        // public synchronized void increment(){
        //     num++;
        // }
    
        // public synchronized void decrement(){
        //     num--;
        // }

        // Locking resource
        public void increment(){
            synchronized(num){
                num++;
            }
        }

        public void decrement(){
            synchronized(num){
                num--;
            }
        }

        @Override
        public String toString(){
            return "TestValue [number=" + num + "]";
        }

}
