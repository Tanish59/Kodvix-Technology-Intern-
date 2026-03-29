class A{
int a=10;
int b=20;
private void sum()
{
System.out.println("sum of a and b is:" +(a+b));
}
}

class ABC
{
public static void main(String args[]){
A show = new A();
System.out.println("hello world");
System.out.println("sum of a and b are:");
show.sum();
}
}