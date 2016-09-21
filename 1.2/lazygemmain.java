import java.util.Scanner;

class lazygemmain{


	public static void main(String args[]){

int flag,output;
		//values for input

   Scanner df=new Scanner(System.in);


   System.out.println("enter the values of T(testcases) ,N(no.of problems),B(break time) and M(time per problem)");
   df.T=nextInt();

   if(T<1||T>100)
   {
     System.out.println("enter the values of T(testcases) again");

        df.T=nextInt();

        else


        	break;

   }

   df.N=nextInt();
   df.B=nextInt();
   df.M=nextInt();

   //returning the output

    output=hoolbar(df.M,df.B,df.N);

System.out.println("the out put for the required computation is :"+output);


	}
}