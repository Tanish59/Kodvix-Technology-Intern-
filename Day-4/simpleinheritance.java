class A
{
    int i,j;
    
      void showij(){
        System.out.println("i and j are:"+i+ " " +j);
      }
}
class B extends A
{
    int k;
    void showk(){
        System.out.println("k is an:"+k);
    }
    void sum(){
        System.out.println("sum of i+j+k:" + (i+j+k));
    }
}
class simpleinheritance
{
    public static void main(String[] args) {
        A superob = new A();
        B subob = new B();
    
    superob.i=100;
    superob.j=200;
    // superob.k=1000;
   System.out.println("contents of superob:" );
   superob.showij();


   subob.i=10;
   subob.j=15;
   subob.k=20;
   System.out.println("contents od subob:");
   subob.showij();
   subob.showk();
 
   System.out.println("sum of all are" );
   subob.sum();
}
}