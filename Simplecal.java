import java.util.Scanner;
public class Simplecal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Simplecal calculator=new Simplecal();
	Scanner Scannerobj=new Scanner(System.in);
	int a=0;
	int choice;
	int conti; 
	int b=0;
	float result;
	System.out.println("choice any two numbers" );	
	int choice1=Scannerobj.nextInt();
	do{
	int choice2=Scannerobj.nextInt();
	System.out.println("choice  number 1 for add" );
	System.out.println("choice  number 2 for sub");
	System.out.println("choice  number 3 for mul" );
	System.out.println("choice  number 4 for div" );
	choice = Scannerobj.nextInt();
	
	if(choice==1)
	{
		result=choice1+choice2;
		System.out.println("Result is "+ result);
		a=(int) result;
		
	}
	
	else if(choice==2)
	{
		result=choice1-choice2;
		System.out.println("Result is "+ result);
		a=(int) result;
		
	}
	else if(choice==3)
	{
		result=choice1*choice2;
		System.out.println("Result is "+ result);
		a=(int) result;
		
	}


	else if(choice==4)
	{
		result=choice1/choice2;
		System.out.println("Result is "+ result);
		a=(int) result;
		
	}
	
	System.out.println("do u want to continue");
	 
	
	System.out.println("press 1 to continue");
	System.out.println("press 2 to stop");
	conti =Scannerobj.nextInt(); 
	}while(conti==1);
	}
	}

