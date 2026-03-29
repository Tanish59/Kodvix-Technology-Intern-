
interface box {

    void push(int ele);

    void pop();

    void display();

   int peek();
}

class A implements box {

    private int arr[];
    private int tos;

    A(int size) {
        arr = new int[size];
        tos = -1;
    }

    public void push(int ele) {
        if (tos == arr.length - 1) {
            System.out.println("array is overflow"); 
        }else {
            tos++;
            arr[tos] = ele;
            // System.out.println("ele inserted "+ele+"  ");
        }
    }

    public void pop() {
        if (tos == -1) {
            System.out.println("array is underflow");

        } else {
            tos--;

        }
    }

    public void display() {
        if (tos == -1) {
            System.out.println("empty"); 
        }else {
            for (int i=tos; i>=0; i--) {
                System.out.println("|"+arr[i]+"|");
            }
            System.out.println("|__|");
        }
    }
    public int peek(){

        if(tos==-1)
        System.out.println(" no peek element ");
        else
        {
            return arr[tos];
        }
        return 0;
    }
}//end of class

class stack {

    public static void main(String args[]) {
        A obj1 = new A(10);
        //  A obj2 = new A(50);

        obj1.push(11);
        obj1.push(12);
        obj1.push(13);
        obj1.push(14);
        obj1.display();

        System.out.println(" aab dusra wala display");
        obj1.pop();
        obj1.display();
          
System.out.println(" peek =");
        obj1.peek();
    }
}
