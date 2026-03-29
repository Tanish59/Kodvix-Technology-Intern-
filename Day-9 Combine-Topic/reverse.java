class reverse 

{
void method(){
int arr[];
arr=new int[26]; 
int n;
n=1;
for ( int j=25;j>=n;j--){
	
	arr[j]=j;
}
System.out.println("all no.s in reverse order:");
for (int i=25;i>=n;i--)
{
System.out.println("\t \t \t	  "+arr[i]);
}
}
public static void main(String arga[])
{
reverse obj = new reverse();
obj.method();
}
}
 