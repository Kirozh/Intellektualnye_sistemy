package task3;

import java.io.IOException;
import java.util.Scanner;
import java.lang.String;
import java.lang.Math;
public class Main {


	public static long translateHexToDec(String s)
	{
		char c;
		long result=0;

		for (int i = s.length(); i > 0; i--) {
			c = s.charAt(i - 1);
			//System.out.println("result: " + c);

			switch (c) {
				case '0': {
					result = result;
					break;
				}
				case '1':
					result += 1 * Math.pow(16, (s.length() - i));
					break;
				case '2':
					result += 2 * Math.pow(16, (s.length() - i));
					break;
				case '3':
					result += 3 * Math.pow(16, (s.length() - i));
					break;
				case '4':
					result += 4 * Math.pow(16, (s.length() - i));
					break;
				case '5':
					result += 5 * Math.pow(16, (s.length() - i));
					break;
				case '6':
					result += 6 * Math.pow(16, (s.length() - i));
					break;
				case '7':
					result += 7 * Math.pow(16, (s.length() - i));
					break;
				case '8':
					result += 8 * Math.pow(16, (s.length() - i));
					break;
				case '9':
					result += 9 * Math.pow(16, (s.length() - i));
					break;
				case 'A': {
					result += 10 * Math.pow(16, (s.length() - i));
					break;
				}
				case 'B': {
					result += 11 * Math.pow(16, (s.length() - i));
					break;
				}
				case 'C': {
					result += 12 * Math.pow(16, (s.length() - i));
					break;
				}
				case 'D': {
					result += 13 * Math.pow(16, (s.length() - i));
					break;
				}
				case 'E': {
					result += 14 * Math.pow(16, (s.length() - i));
					break;
				}
				case 'F': {
					result += 15 * Math.pow(16, (s.length() - i));
					break;
				}
				case '-': {
					result = -result;
					break;
				}
				default: {
					System.out.println(c);
					result = 0;
					break;
				}
			}
		}
		return result;
	}

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		s = in.next();
		s = s.toUpperCase();
		System.out.println("s: " + s);

		System.out.println("result: " + (translateHexToDec(s)));


		//System.out.print("result = " + Translate(s));


	}
}
