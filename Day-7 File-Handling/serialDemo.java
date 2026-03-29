import java.io.*;

 class Employee implements Serializable{

    public String name;
    public String address;
    public String ssw;
    public int number;  
}
class serialDemo {
    public static void main(String arggs[]){

        Employee e = new Employee();
        e.name="abc";
        e.address="abcdef";
        e.ssw="E1234567";
        e.number=1222;

        try {
         FileOutputStream fos = new FileOutputStream("c:\\cpp file\\java 3\\Tanish.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos);

         oos.writeObject(e);
         oos.close();
         fos.close();
         System.out.println("serialized data stored in c:\\cpp file\\java 3\\Tanish.txt");
    }
    
    catch(IOException ex)
    {
        System.out.println("exception during serialization "+ex );
    }
}
}

