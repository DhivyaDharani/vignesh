import java.util.*;
import java.io.*;
public class Even
{
public static void main(String args[])
{
int i,n,m;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number1:");
n=sc.nextInt();
System.out.println("Enter the number2:");
m=sc.nextInt();
System.out.println("The Even numbers:");
for(i=n;i<m;i++)
{
if(i%2==0)
{
System.out.println(i);
}
}
}
}
