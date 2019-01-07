import java.util.Scanner;

public class backjoon_1475 {
	public static void main(String[] args) {
		String roomnumber = null;
		Scanner input = new Scanner(System.in);

		roomnumber = input.nextLine();

		String[] temp = null;
		int size = Integer.parseInt(roomnumber);
		int set;
		for (int i = 0; i < roomnumber.length(); i++) {
			temp = roomnumber.split("");
		}
		System.out.println(size);

	}

}
