class lazygemp{

	public static int hoolbar(int M,B,N){

int output;
flag=lazyfucn(N);


if(flag)

{
 N=N/2;
}
else
{
 N=(N+1)/2;
}


 output=output+(N*M) +B;

//after first case

do{



 flag=lazyfucn(N);


if(flag)

{
 N=N/2;
}
else
{
 N=(N+1)/2;
}


output=output+(N*2*M) +B;

//after furst br




}while(N!=1);
}

return output;



}