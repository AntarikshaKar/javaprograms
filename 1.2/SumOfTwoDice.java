import java.util.Scanner;
class SumOfTwoDice{

	public static void main(String args[]){


Scanner df=new Scanner(System.in);

System.out.println("enter your range of random number :");
int min=df.nextInt();
int max=df.nextInt();
		int x,y;

			x=min+(int)(Math.random()*(max-min) +1);
			y=min+(int)(Math.random()*(max-min)+1 );

			System.out.println("the random number generated are :"+x+y);
			System.out.println("The sum of the two number is :"+ (x+y));


	}
}