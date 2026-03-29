//copy constructor
class A{
     int a,b;                             //syntax 
                                          // class class name
    A()                                  //  {
                                          //  class name (obj ref)
                                          //  {

                                         //   }
                                         //  }
    {
        a=100; b=123;
        System.out.println(a+ " "+b);
    }
    A(A ref)
    {
        a=ref.a;
        b=ref.b;
        System.out.println(a+ " "+b);
    
    }
}
class copyconst
{
    public static void main(String ar[]){
        A r=new A();
        A r2=new A(r);

        
    }
}