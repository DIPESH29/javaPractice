import java.util.Scanner;

//this is a java method for add  
 class Add{

public static void main(String[] args)

{
int a,b;
float c;
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers");
 a=s.nextInt();
 b=s.nextInt();
 c=a/b;
System.out.println("Sum is " +c);

}
}