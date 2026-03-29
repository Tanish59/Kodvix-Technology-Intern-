     /*multi-threading in java */
 
 class Mythread implements Runnable
 {
public void run(){
    try
    {
        for(int i=0; i<=5; i++) {
        System.out.println("child class "+i );
        Thread.sleep(500);
    }  
}
    catch (InterruptedException n){
        System.out.println("child not exist");
    }   

System.out.println("child class ended");
}
} 

class Multithread
{
    public static void main(String args[]){
        
        Mythread obj = new Mythread();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);
        t2.start();
        t1.start();
        t3.start();
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }
 System.out.println("main thread ended");
    }
}