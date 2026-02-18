import java.util.Scanner;
public class PracticeProblem {


	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		char char1 = 'a';
		System.out.println(char1);
	}

	public static void q2() {
	Scanner input = new Scanner(System.in);
	System.out.print("Input a word: ");
	String wordIn = input.nextLine();
	input.close();
	char char1 = wordIn.charAt(2);
	System.out.println(char1);
	}

	public static void q3() {
	Scanner input = new Scanner(System.in);
	System.out.print("Input a word: ");
	String wordIn = input.nextLine();
	input.close();
	char char1 = wordIn.charAt(1);
	System.out.println("The second character user entered was: " + char1);
	}

	public static void q4() {
	Scanner input = new Scanner(System.in);
    System.out.print("Input a number: ");
    Integer numIn = input.nextInt();
    input.close();
    Integer numOut = numIn + 1;
    System.out.println("Your number plus 1 is: " + numOut);
}
	

	public static void q5() {
	Scanner input = new Scanner(System.in);
    System.out.print("Input a letter: ");
    String charIn = input.nextLine();
	System.out.print("Input another letter: ");
	String charIn2 = input.nextLine();
    input.close();
	char char1 = charIn.charAt(0);
    char char2 = charIn2.charAt(0);
    System.out.println(char1 + char2);
	}

}
