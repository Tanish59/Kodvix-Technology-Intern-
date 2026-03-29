abstract class Animal
{
void callme(){
System.out.print("types of animal");
}
}
class Dog extends Animal
{
void callme(){
System.out.println("dog is an animal");
}
}
class Abstract
{
public static void main(String args[]){

Animal obj = new Dog();
obj.callme() ;
}
}