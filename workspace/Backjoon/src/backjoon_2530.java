import java.util.Scanner;

public class backjoon_2530 {
	public static void main(String args[]) {
		String currenttime = null;
		int cooktime = 0;
		Scanner input = new Scanner(System.in);
		
		currenttime = input.nextLine();
		cooktime = input.nextInt();
		
		int current_hour = 0; 
		int current_minute = 0;
		int current_second = 0;
		String[] tempStr = null;
		for(int i = 0; i<currenttime.length(); i++) {
			tempStr = currenttime.split(" ");
			current_hour = Integer.parseInt(tempStr[0]);
			current_minute = Integer.parseInt(tempStr[1]);
			current_second = Integer.parseInt(tempStr[2]);
		}
		for(int j = 0; j<cooktime; j++) {
			current_second++;
			if(current_second == 60) {
				current_minute++;
				if(current_minute == 60) {
					current_hour++;
					if(current_hour == 24) {
						current_hour = 0;
					}
					current_minute = 0;
				}
				current_second = 0;
			}
		}
		System.out.println(current_hour + " " + current_minute + " " + current_second);
	}
}
