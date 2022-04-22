package Phase1assignment;
import java.util.Scanner;
public class dataTypeConversion {
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Integer Number is=");
		int a=sc.nextInt();
		System.out.println("Enter the double Number is=");
		double d=sc.nextDouble();
		 
		float f =(float)a;
		 System.out.println("Integer convert into float value is= "+ f);
		 
		 long l=(long)d;
		 System.out.println("double value converting in to long"+l);
		 
	}

}
