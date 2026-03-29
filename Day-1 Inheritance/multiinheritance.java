// Multiple inheriytance program
class A
{
int a,b,c;
void add()
{
    a=100;b=50;
    c=a+b;
    System.out.println("sum of two numbers are:" +c);
}

void sub()
{
    a=150;b=40;
    c=a-b;
    System.out.println("sub of two numbers are:" +c);
}
}

class B extends A
{
    void mul()
    {
        a=10;b=50;
        c=a*b;
        System.out.println("mul of two numbers are:" +c);
    }
    void div()
{
    a=100;b=50;
    c=a/b;
    System.out.println("div of two numbers are:" +c);
}

}

class C extends B
{
    void rem()
{
    a=101;b=50;
    c=a%b;
    System.out.println("reminder of two numbers are:" +c);
}
}
class multiinheritance
{
    public static void main(String[] args){
        C obj = new C();
        obj.add(); obj.sub(); obj.mul(); obj.div(); obj.rem();
    }
}