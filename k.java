public class k{
 
public static void main (String [] args){

int a=0;
int b=1;
int fibo;

for (int i=0;i<10;i++){

   fibo=a+b;
    a=b;
    b=fibo;

System.out.println(fibo);

}

}}