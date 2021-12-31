package methodHomework;

public class HomeworkQ2 {

	public static void main(String args[]) {

		getGender('m');

	}

	public static void getGender(char gender) {

		switch (gender) {

		case 'm':
			System.out.println("Male");
			break;

		case 'M':
			System.out.println("Male");
			break;
		case 'F':
			System.out.println("Male");
			break;

		case 'f':
			System.out.println("Male");
			break;

		default:
			System.out.println("Error");
		}

	}
}
