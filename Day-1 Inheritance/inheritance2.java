class Box {
    int h,w,d;
    Box (Box ob){
        h=ob.h;
        w=ob.w;
        d=ob.d;
    }
    Box(){
        h=w=d=-1;
    }
    Box(int ht,int wd, int dp){
        h=ht;
        w=wd;
        d=dp;
    }
    Box(int lin) {
        h=w=d=lin;
    }
        void volume(){
            System.out.println("volume of Box="+(h*w+d));
        
    }

}//end of class Box

class Boxweight extends Box
{
    int boxwt;
    Boxweight(int ht,int wd, int dp,int wt) {
        h=ht;
        w=wd;
        d=dp;
        boxwt=wt;
 }
}//end of class Boxweight

class inheritance2 {
    public static void main(String ar[]){
        Boxweight bw=new Boxweight(10,20,15,50);
        bw.volume();
        System.out.println("weight of box=" +bw.boxwt);
    }
}