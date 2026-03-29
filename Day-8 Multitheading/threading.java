class threading
{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        
        System.out.println("new thread:"  +t);
        
//change the name of the thread
        t.setName("my thread");
        System.out.println("after name change"  +t);
        try
        {
            for (int i=5; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
        catch(InterruptedException s)
        {
        System.out.println("main thread interrupted");
        }

    }
}