//super keyword
class A
{
    A()
    {
     System.out.println("hello programmer");   
       
}
}
class B extends A
{
 B()
  //super();         by default in default constructor
  //super(int);       compulsury in case of parameterised constructor                    
  {
    System.out.println("hello viewers");
 }
}
class superclass
{
    public static void main(String args[]){
        B obj = new B();                    //firstly super class result(output) shown and then sub class
    }
}