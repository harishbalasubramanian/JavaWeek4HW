import java.util.*;
public class RomanNumeral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		int a = romanToNumber(s1);
		int b = romanToNumber(s2);
		int c = romanToNumber(s3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static int romanToNumber(String s) {
		int output = 0;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			char d = i == s.length() - 1 ? ' ' : s.charAt(i+1);
			if(c == 'M') {
				output += 1000;
			}else if (c == 'C' && d == 'M') {
				output += 900;
				i++;
			}else if (c == 'D') {
				output += 500;
			}else if (c == 'C' && d == 'D') {
				output += 400;
				i++;
			}else if(c == 'C') {
				output += 100;
			}else if (c == 'X' && c == 'C') {
				output += 90;
				i++;
			}else if (c == 'L') {
				output += 50;
			}else if (c == 'X' && d == 'L') {
				output += 40;
				i++;
			}else if (c == 'X') {
				output += 10;
			}else if (c == 'I' && d == 'X') {
				output += 9;
				i++;
			}else if (c == 'V') {
				output += 5;
			}else if (c == 'I' && d == 'V') {
				output += 4;
				i++;
			}else {
				output++;
			}
		}
		return output;
	}
}
