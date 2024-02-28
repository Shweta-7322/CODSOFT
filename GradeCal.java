import java.util.Scanner;
public class GradeCal
{
    	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Five Subject Marks :");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		int total = m1+m2+m3+m4+m5;
		float per = total/5;
		System.out.println("Total :"+total);
		System.out.println("Percentage :"+per);	
		if(per>=90)
			System.out.println("Grade A");
		else if(per>=80)
			System.out.println("Grade B");
		else if(per>=70)
			System.out.println("Grade C");
		else if(per>=60)
			System.out.println("Grade D");
		else if(per>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}
