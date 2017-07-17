# Roman-number
import java.io.*;
import java.util.*;
public class Roman number
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the input:");
n=Integer.parseInt(br.readLine());
int num;
switch(n)
{
Case 'I' :
num=1;
System.out.println(num);
break;

Case 'V' :
num=5
System.out.println(num);
break;

Case 'X' :
num=10;
System.out.println(num);
break;

Case 'L' :
num=50;
System.out.println(num);
break;

Case 'C' :
num=100;
System.out.println(num);
break;

Case 'D' :
num=500;
System.out.println(num);
break;

Case 'M' :
num=1000;
System.out.println(num);
break;

default :
num=0;
System.out.println(num);
break;
}
}
}


