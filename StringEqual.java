package DAY1;

import java.util.Scanner;

public class StringEqual {
	public static void main(String args[]) {
		String str1, str2;
		Scanner AZ = new Scanner(System.in);
		System.out.println("Enter first String");
		str1 = AZ.nextLine();

		System.out.println("Enter second String");
		str2 = AZ.nextLine();

		if (str1.equals(str2))
			System.out.print("Equal Strings");
		else
			System.out.print("UnEqual Strings");
	}
}
