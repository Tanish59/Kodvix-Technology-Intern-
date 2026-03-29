//using abstract method and classes
 abstract class figure {
    int dim1;
    int dim2;

    figure(int a, int b) {
        dim 1=a;
        dim 2=b;
    }
    abstract void area()
} 

class triangle extends figure{
    triangle(int a, int b)
    {super (a,b);
    }
    void area(){
        ar = (dim1*dim2)/2;
        System.out.println("area of triangle=" +ar);
    }
}
class rectangle extends figure{
    rectangle (int a, int b)
    { super (a,b);
    }
    void area(){
        System.out.println("area of rectangle=" +(dim1*dim2));
    }
}
class AbstractArea 
{
    public static void main(String args[]){
        figure f;
        triangle t= new triangle(10,20);
        rectangle r= new rectangle(10,15);

       f = t;
       f.area();
       f=r ;
       f.area() ;

       }  
       }    
        
    