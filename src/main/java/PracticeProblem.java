import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String c;
		c = in.nextLine();
		System.out.print(c.charAt(0));
		System.out.println();
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		Boolean trueFalse;
		trueFalse = in.nextBoolean();
		System.out.print(!trueFalse);
		System.out.println();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int num;
		num = in.nextInt();
		System.out.print(num > 5);
		System.out.println();
		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double num2;
		num2 = in.nextDouble();
		in.nextLine();
		System.out.print((num2 >= -2) && (num2 <= 2));
		System.out.println();
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String words;
		words = in.nextLine();
		System.out.print("Hello World".equals(words));
		System.out.println();
		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int num3;
		num3 = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		int num4;
		num4 = in.nextInt();
		in.nextLine();
		System.out.print(num3 <= num4);
		System.out.println();
	}

	public static void q7() {
		//Write question 7 code here
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		Double num5;
		num5 = in.nextDouble();
		in.nextLine();
		System.out.print("In: ");
		Double num6;
		num6 = in.nextDouble();
		in.nextLine();
		System.out.print(num5 > num6);
		System.out.println();
	}

}
