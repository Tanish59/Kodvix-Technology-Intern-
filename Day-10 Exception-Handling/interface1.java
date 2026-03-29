
import java.util.Scanner;
interface inter{
  void fun();
  void add(int a, int b);
  void substract();
  //void mul(int a, int b);
 	 //void divide(int a, int b);
}
	class interface1 implements inter
	{
		public void fun()
		{
			System.out.println("this is program of interface");
			
		}
		public void add(int a, int b)
		{
			int c=a+b;
			System.out.println(c);
		}
		public void substract()
		{
			Scanner obj= new Scanner(System.in);
            System.out.println("enter 2 digit for substraction");
			int first=obj.nextInt();
			int second=obj.nextInt();
		int res=first-second;
	
	System.out.println("the resut  "+res);
}
 public static void main(String a[]){
	 interface1 t = new interface1();
	 t.fun();
	 t.add(122, 34);
	 t.substract();
 }
	}