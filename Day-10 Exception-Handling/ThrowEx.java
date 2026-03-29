import java.io.*;
public class ThrowEx {
	void my_Method(int num)throws IoExeception,ClassNotFoundException
	{
		if(num==1)
			throw new IoException("Exception message1");
		else
			throw new ClassNotFoundException
		("Exception message 2");
	}
}
class Demo {
	public static void main(String ar[]){
		try{
			ThrowEx.t = new ThrowEx();
			t.my_method(1);
		}
		catch(Exception ex);
		{
		System.out.println(Ex);
		}
	}
}
