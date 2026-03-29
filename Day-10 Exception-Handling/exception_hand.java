class exception_hand
{
	
public static void main(String args[]){
System.out.println("main method started");

int a=100,b=0,c;
try
{
c=a/b;
System.out.println(" "+c);
}
catch(ArithmeticException e)
{
	System.out.println("error occured");
}
}
}