package methodHomework;

public class HomeworkQ1 {

	public static void main(String args[]) {

		calculate(1, 2, '=');

	}

	public static void calculate(double numOne, double numTwo, char mathOperationSign) {

		switch (mathOperationSign) {

		case '+':

			System.out.println(numOne + numTwo);

		case '-':
			System.out.println(numOne - numTwo);
			break;
		case '/':
			System.out.println(numOne / numTwo);
			break;
		case '*':
			System.out.println(numOne * numTwo);
			break;
		case '%':
			System.out.println(numOne % numTwo);
			break;
		default:
			System.out.println("Error: Invalid Math Operation Sign ");
		}
	}

}
