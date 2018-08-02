
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x,y,z;
		System.out.println("enter three integers");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>y&&x>z)
		System.out.println("first number is largest");
		else if(y>x&&y>z)
		System.out.println("second number is largest");
		else if(z>x&&z>y)
		System.out.println("third number is largest");
		else
		System.out.println("entered  numbers are not distinct");
	}
}
	
	
