import java.util.Scanner;

public class Main4 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		String st=new String();
		
		String str=new String();
		
		System.out.println("String 1: ");
		st=s.nextLine();
		
		System.out.println("String 2: ");
		str=s.nextLine();
		
		if(st.length()>str.length())
		{
			System.err.println(st+" is Bigger than "+str);
		}
		else if(st.length()==str.length())
		{
			System.out.println(str+" and "+st+" are equal");
		}
		else
		{
			System.err.println(str+" is Bigger than "+st);	
		}
		
		
		
	}

}
//String 1: This is Exercise 1
//String 2: This is Exercise 2
//"This is Exercise 1" is less than "This is Exercise 2"


