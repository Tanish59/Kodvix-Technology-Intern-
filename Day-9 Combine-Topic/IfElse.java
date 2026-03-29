                       /* IF ELSE AND NESTED IF ELSE STATEMENTS */					   
	
	
	class IfElse
	{
public static void main(String ar[]){
int month = 5;  //april month
String season;
  if (month==11 || month==12 || month==1)
   season="winter";
  else if(month==2 || month==3 || month==4)
    season="summer";
  else if(month==5 || month==6 || month==7)
    season="rainy";
else
	season="bogus season";

System.out.println("the june month is in "  + season +".");
}
	}