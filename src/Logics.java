import java.util.Scanner;
public class Logics
{
	int roll;
	String name;
	double p1;
	double p2;
	double p3;
	int choice;
	
	Scanner s1= new Scanner(System.in);
	
	void setf()
	{
		System.out.println("Enter Roll: ");
		roll =Integer.parseInt(s1.nextLine());
		
		System.out.println("Enter Name: ");
		name = s1.nextLine();
		
		System.out.println("Marks");
		System.out.println("Enter Paper 1: ");
		p1=Double.parseDouble(s1.nextLine());
		
		System.out.println("Enter Paper 2: ");
		p2=Double.parseDouble(s1.nextLine());
		
		System.out.println("Enter Paper 3: ");
		p3=Double.parseDouble(s1.nextLine());
	}
	
	void getf()
	{
		
		System.out.println("Roll: "+roll);
		System.out.println("Name: "+name);
		System.out.println("Paper 1: "+p1);
		System.out.println("Paper 2: "+p2);
		System.out.println("Paper 3: "+p3);
	}
	
	void Delete()
	{
		System.out.println("Do You really want to delete this record? (y/n)");
		choice = Integer.parseInt(s1.nextLine());	
		if(choice==1)
		{
			roll=0;
			name=null;
			p1=0;
			p2=0;
			p3=0;
			System.out.println("Ok Record Deleted..");
		}
		else
		{
			System.out.println("Not Delete..");
		}
		
			
		
		
	}
	
	
	

}
