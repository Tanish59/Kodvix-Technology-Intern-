class demu{
     int a=10;
     String name="ram"; 
    
    void show()
{
   
    System.out.print(a+" "+name);
}
}

class BOX
{
    public static void main(String argu[]){
    demu v=new demu();
    v.show();
}
}