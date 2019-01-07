
import java.util.Scanner;

public class backjoon_2947 {
	public static void main(String args[]) {
		String inputstr = null;
		Scanner input = new Scanner(System.in);

		inputstr = input.nextLine();

		String[] tempStr = null;
		for (int i = 0; i < inputstr.length(); i++) {
			tempStr = inputstr.split(" ");
		}
		for (int z = 0; z < tempStr.length - 1; z++) {
			for (int j = 0; j < tempStr.length - 1; j++) {
				if (tempStr[j].compareTo(tempStr[j + 1]) >0) {
					String temp;
					temp = tempStr[j];
					tempStr[j] = tempStr[j + 1];
					tempStr[j + 1] = temp;
					System.out.println(tempStr[0] + " " + tempStr[1] + " " + tempStr[2] + " " + tempStr[3] + " " + tempStr[4]);
				}
			}
		}
	}

}
