import java.util.*;
class LabTaskFive{
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
	String password,email;
		String [][] arry= new String[2][5];
		arry[0][0]="support@tigerjawad.com";  
		arry[0][1]="tj11";
		arry[0][2]="sjawad452@gmail.com";
		arry[0][3]="sj012";
		arry[0][4]="support@sindhrihost.com";
		arry[1][0]="sd123";
		arry[1][1]="sjawad0308@gmail.com";
		arry[1][2]="gd1012";			
		arry[1][3]="sjawad052@gmail.com";
		arry[1][4]="ja1012";
		System.out.println("<Welcom to tigerjawad>");
		System.out.println("Type the Email: ");
	email=ob.nextLine();
		if(email.equalsIgnoreCase(arry[0][0])|| email.equalsIgnoreCase(arry[0][2])||email.equalsIgnoreCase(arry[0][4])|| email.equalsIgnoreCase(arry[1][1])||email.equalsIgnoreCase(arry[1][3])){
			System.out.println("Type the password:");
			password=ob.nextLine();
			if(password.equals(arry[0][1]) && email.equalsIgnoreCase(arry[0][0]) || password.equals(arry[0][3]) && email.equalsIgnoreCase(arry[0][2]) ||password.equals(arry[1][0]) && email.equalsIgnoreCase(arry[0][4]) ||password.equals(arry[1][2])&&email.equalsIgnoreCase(arry[1][1]) ||password.equals(arry[1][4])&&email.equalsIgnoreCase(arry[1][3])){
				System.out.print("Welcom on the page..");
			}
			else
			{
				System.out.print("password Invaild");
			}	
			}
			else
			{
				System.out.print("Email is not registered...");
			}			
	
}

}
