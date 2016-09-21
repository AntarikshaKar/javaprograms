import java.lang.*;
import java.util.Scanner;

class WindChill{

public static void main(String args[]){

double t,v,w;

t=Integer.parseInt(args[0]);
v=Integer.parseInt(args[1]);



w=35.74 + (0.6215*t) + (0.4275*t - 35.75) *(Math.pow(v,0.16));


System.out.println("the output of the formula is :"+w);












}

}