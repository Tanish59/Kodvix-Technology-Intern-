// parameterised constructor
class A {
    int x;
    String y;
    A(int a , String b)
    {
     x=a; y=b;
    }
    A(int a, boolean b){
        System.out.println(a+ " " +b);
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
}
 class constructor
 {
    public static void main(String ar[]){
        A ref = new A(100, "Tanish");
        ref.show();
        A r = new A(17, true); 
    }
 }