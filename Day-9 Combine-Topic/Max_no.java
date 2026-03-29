 class Max_no
 {

 public void method()
 {
	  int i,j,k;
 i=1000;
 j=-20;
 k=100;
 if (i>j && i>k)
 {
 System.out.println("i is gtratest"+i);
 
 if (j>i && j>k)
 {
 System.out.println("j is gtratest"+j);
 }
 }
 else
 {
 System.out.println("k is gtratest"+k);
 }
 }
 
 public static void main(String args[]){
 Max_no obj = new Max_no();
 obj. method();
 }
 }