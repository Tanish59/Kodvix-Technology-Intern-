
class Animal
{
int a; int b; string Name;

a=10; b=100; Name="tanish";

public void sound(){
System.out.println("sound of animals are:" +(a+b));
}
}
class Lion extends Animal
{
string name;
public void sound(){
System.out.println("sound of lions are:", Name);
}
}
class Dog extends Lion
{
public void sound()
{
System.out.println("sound of dog are:" +bhou+ "  ");
}}

class inheritance
{
public static void main(String args[]){
Animal obj1 = new Animal();
Lion obj2 = new Lion();	
Dog obj3 = new Dog();


obj1.a();
obj1.sound();
obj1.sound();
}
}