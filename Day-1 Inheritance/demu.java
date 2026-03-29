class A{
    void callme()
    {
     System.out.println("inside A's method");
    }
}
    class b extends A {
    void callme()
    {
      System.out.println("inside b's method");    
    } 
}
class C extends b{
    void callme()
    {
        System.out.println("inside c's method");
    }
}
class demu{
    public static void main(String args[]){
     C c = new C();
    }
}