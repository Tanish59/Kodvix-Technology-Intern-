public class CMDlineexample{
    public static void main(String args[]){
        // check if arguments are passed
        if (args.length>0)
        {
            System.out.println("command line args:");
           for( int i=0; i<args.length; i++){
           System.out.println("args are" +(i+1)+ ":" +args[i]);
        }
    }
    else{
        System.out.println("no args passed");
    }
}
}