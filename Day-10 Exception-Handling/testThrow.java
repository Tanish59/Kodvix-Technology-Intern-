// throw exception program_2



public class testThrow {
static void validate(int age){
if (age<18)
 throw new ArithmeticException ("not valid");
 else
 System.out.println("welcome to vote");
 }
 public static void main(String args[]){
 validate(15);
 }
}