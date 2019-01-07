import java.util.Scanner;

public class backjoon_1475 {
	public static void main(String[] args) {
		String roomnumber = null;
		int array[] = new int[10]; // 0~9까지의 팻말이 몇번 쓰였는지 알기 위한 배열
		Scanner input = new Scanner(System.in);

		roomnumber = input.nextLine();
		String[] temp = null;
		int setCount = 0;
		
		
		for(int i = 0; i<roomnumber.length(); i++) {
			temp = roomnumber.split("");
			int number = Integer.parseInt(temp[i]);
			if(number == 6 || number == 9) {
				if(array[6] < setCount) {
					array[6]++;
				}else if(array[9] < setCount) {
					array[9]++;
				}else {
					setCount++;
					array[number]++;
				}
			}else {
				if(setCount == array[number]) {
					setCount++;
					array[number]++;
				}
				else {
					array[number]++;
				}
			}
		}
		System.out.println(setCount);
	}
}
