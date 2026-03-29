class string 
{
    public static void main(String args[]){
        
        String obj = new String("ankit");
        System.out.println(obj);

        String obj1 = new String("ankit");
        System.out.println(obj1);

        obj.concat(" kumar");   //when we place obj=obj.concat("kumar")    then result is different
        System.out.println(obj);

        

       
    }
}