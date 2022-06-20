package Elements;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number to be checked");

			int input = s.nextInt();
			int i,k =0;
			for(i=2;i<=input/2;i++) 
			{
				if(input%i==0) {
				k++;
				break;
				}
			}
				if(k==0)
				{
					System.out.println("it is a prime number");
				}else {
					System.out.println("it is not a prime number");
				}
		s.close();
	}
	
}
