import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome Student Management System");
		
		Scanner s = new Scanner(System.in);
		int choice;
		int Limit=50;
		int ns=0;
		int Roll;
		
		Print p = new Print();
		
		Logics l[] = new Logics[Limit];
		
		do
		{
			p.prt();
			choice = Integer.parseInt(s.nextLine());	
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Number Of Student: ");
				ns=Integer.parseInt(s.nextLine());
				for(int i=0;i<ns;i++)
				{
					System.out.println("Student "+(i+1));
					 l[i]=new Logics();
				     l[i].setf();	
				}
				System.out.println("Record Save..!");
				break;
			case 2:
				for(int j=0;j<ns;j++)
				{
					l[j].getf();
				}
				System.out.println("All data Show...");
				break;
			case 3:
			
				System.out.println("Delete Record...");
				System.out.println("Enter Student Roll: ");
				Roll = Integer.parseInt(s.nextLine());	
				
				
				for(int k=0;k<ns;k++)
				{
					System.out.println("Roll Is: "+Roll);
					System.out.println("Name Is: "+l[k].name);
					
					l[k].Delete();
				}
				
				
				break;
			case 4:
				System.out.println("Case 4");
				break;
			case 5:
				System.out.println("Case 5");
				break;
			case 0:
				System.out.println("Exit.");
				break;
				default:
					System.out.println("Invalic!");
					break;
					
			}
			
			
		}
		while(choice!=0);
		
		
		
		
		
		
		
		
		
	}

}
