import java.io.*;
class createFile
{
    public static void main(String args[]) throws IOException{
        File f = new File("c:\\cpp file\\java 3\\tanish.txt");

        if(f.createNewFile())
        {
            System.out.println("new file is created");
        }
        else
        System.out.println("file aleady exists");
    }
}

