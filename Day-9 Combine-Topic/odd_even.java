import java.util.Scanner;
class odd_even
{

void method()
{
int n;
n=10;
Scanner obj = new Scanner(System.in);
System.out.println("enter the value to find odd or evem");
int p=obj.nextInt();
if(p%2==0)
{
System.out.println("no. is even");
}

 else
 {
 System.out.println(" no is odd");
 }
 }
 public static void main(String[] args)
 {
 odd_even obj1 = new odd_even();
 obj1.method();
 }
 }
 