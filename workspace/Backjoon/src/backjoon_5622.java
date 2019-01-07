
import java.util.Scanner;

public class backjoon_5622 {
	public static void main(String args[]) {
		String inputstr = null;
		Scanner input = new Scanner(System.in);

		inputstr = input.nextLine();
		
		String[] tempStr = null;
		int time=0;
		
		for(int i = 0; i<inputstr.length(); i++) {
			tempStr = inputstr.split("");
		}
		for(int j = 0; j<tempStr.length; j++) {
			if(Str(tempStr[j]) == 0) {
				time += 10;
			}
			else if(Str(tempStr[j]) == 1) {
				time +=1;
			}else {
				time += Str(tempStr[j]);
			}
		}
		time += (int)tempStr.length;
		System.out.println(time);
	}

	public static int Str(String str) {
		int dial = 0;
		switch (str) {
		case "A" :
		case "B" :
		case "C" :
			dial = 2;
			break;
		case "D" :
		case "E" :
		case "F" :
			dial = 3;
			break;
		case "G" :
		case "H" :
		case "I" :
			dial = 4;
			break;
		case "J" :
		case "K" :
		case "L" :
			dial = 5;
			break;
		case "M" :
		case "N" :
		case "O" :
			dial = 6;
			break;
		case "P" :
		case "Q" :
		case "R" :
		case "S" :
			dial = 7;
			break;
		case "T" :
		case "U" :
		case "V" :
			dial = 8;
			break;
		case "W" :
		case "X" :
		case "Y" :
		case "Z" :
			dial = 9;
			break;
		}
		return dial;
	}

}
