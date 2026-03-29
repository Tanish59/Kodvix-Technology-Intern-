// multi-threading implementing runnable

class A implements Runnable
{
    public void run() {

        try{
            for(int i=5; i>0; i--)
            
                System.out.println("child thread"+i);
                Thread.sleep(500);
            }
            catch(InterruptedException n)
            {
                System.out.println("child not exist");
            }
        
        System.out.println("child class ended");
    }
    }



class runnableEx 
{
    public static void main(String[] args) {
        A r = new A();
        Thread t= new Thread(r) ;
        t.start();

        try{ 
            for(int i=5; i>0; i--)
            
                System.out.println("Main thread"+i);
                Thread.sleep(1000);
        }
            catch (InterruptedException n)
            {
                System.out.println("Main not exist");
            }
        
        System.out.println("Main class ended");
        }
    }
