import java.util.*;
class Question9{
public static void main(String[]args) {
 Scanner ob=new Scanner(System.in);
int a=0;
int b=1;
int c;
System.out.println("Enter the terms repeat");
	int terms=ob.nextInt();
	for(int i=1;i<=terms;i++){
	System.out.print(a+",");
	c=a+b;
	a=b;
	b=c;
		}
	}
}
