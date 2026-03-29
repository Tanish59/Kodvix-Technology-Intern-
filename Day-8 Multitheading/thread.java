//multi-threading extending thread

class A extends Thread
{
public void run()
{
    int i,j; 
    try
    {
    for( i=1; i<=10; i++)
    {
        System.out.println("Tanish"+i);
        Thread.sleep(2000);
    }
}
catch(InterruptedException n )
{
    System.out.println("out of try");
}

}
}
 
class thread {
    public static void main(String a[]) throws InterruptedException
    {
        A obj = new A();
        obj.start();
    for(int i=1; i<=5; i++)
    {
        System.out.println("Harry"+i);
        Thread.sleep(500);
    }

    }
}