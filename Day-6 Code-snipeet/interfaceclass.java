import java.util.Scanner;
interface client
{
    void input(); //public+abstract
    void output();
}
class interfaceclass implements client
{
    String name; double sal;
    public void input()
    {
        Scanner r = new Scanner(System.in);
 System.out.println("enter the username:");
      name=r.nextLine(); 

      System.out.println("enter the salary:");
      sal=r.nextDouble();
    }
    public void output()
    {
        System.out.println(name+" "+sal);
    }
    public static void main(String args[]){
        client c = new interfaceclass();
        c.input();
    }
}