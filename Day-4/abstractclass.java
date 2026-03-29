             //abstract class ki help se hum ek hi method diff. classes me use karte he    
abstract class animal
{
    animal(){
       System.out.println("All animals sounds");
    }
    public abstract void sound();    //public na likho tobhi public hi rahega
}
class Dog extends animal
{
    Dog(){
    super();          //hum super keyword bana kar abstract class ke constructor ko call kar sakte he
    }
    public void sound(){
        System.out.println("dogs are barking");
    }
}

class tiger extends animal
{
    tiger()
    {
        super();        //hum super keyword bana kar abstract class ke constructor ko call kar sakte he
    }
    public void sound(){
        System.out.println("loins are shouting");
    }
}
class abstractclass
{
    public static void main(String args[]){
        Dog d = new Dog();
        tiger t = new tiger();
        d.sound(); t.sound();         //abstract class ki help se hum ek hi method diff. classes me use karte he
    }
}