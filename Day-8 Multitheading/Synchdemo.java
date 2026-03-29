           /*Synchronization in java */

class Table
{
   synchronized public void PrintTable(int n)
    {
        for (int i=1; i<=10; i++){
        System.out.println(n*i);
    }
    try{
        Thread.sleep(500);
  }
    catch(Exception e){
        System.out.println(e);
    }
} 
}

class Mythread1 extends Thread{
Table t;
Mythread1(Table t)
{
 this.t= t;
}
public void run(){
    t.PrintTable(10);
}
}

class Mythread2 extends Thread{
  Table t;
  Mythread2(Table t){
    this.t=t;
  }
  public void run(){
    t.PrintTable(100);
  }
}

class Synchdemo {
    public static void main(String[] args) {
        Table obj = new Table();
        Mythread1 t1 = new Mythread1(obj);
        Mythread2 t2 = new Mythread2(obj);
         t1.start();
         t2.start();
    }
}