/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c;
		System.out.println("enter three integers");
		Scanner in=new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		if ( a > b && a > c )
		System.out.println(a);
		else if ( b > a && b > c )
		System.out.println(b);
		else if ( c > a && c > b )
		System.out.println(c);
		else
		System.out.println("entered numbers are not distinct.");
	}
	}
