package codingBatProblems;

import java.io.UnsupportedEncodingException;

public class Logic1 {
private static String test = "";
	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		test();
		
	}
	
	public static void test() throws UnsupportedEncodingException{
		String japanese = "配送料と配送情報";
		byte[] jis =japanese.getBytes("UTF-8");
		String str = new String(jis);
		System.out.println(str);
		
	}
	
	public static String quack(String translate){
		for(int i = 0; i<translate.length(); i++){
			int number = i % 5;
			
			switch(number){
			case 0: test += "q";break;
			case 1: test += "u";break;
			case 2: test += "a";break;
			case 3: test += "c";break;
			case 4: test += "k";break;
			
			}
		}
		System.out.println(test);
		return test;
	}
	
	public static String reverse (String reverseThis){
		StringBuilder newString = new StringBuilder(reverseThis);
		String reversedString = newString.reverse().toString();
		System.out.println(reversedString);
		return reversedString;
		
		
	}

	/**
	 * cigarParty
	 */
	public boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend) {
			if (cigars >= 40) {
				return true;
			} else {
				return false;
			}

		} else {

			if (cigars >= 40 && cigars <= 60) {

				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * dateFashion
	 */

	public int dateFashion(int you, int date) {
		if (you <= 2 || date <= 2) {

			return 0;

		} else if (you >= 8 || date >= 8) {

			return 2;
		} else {
			return 1;

		}
	}

	/**
	 * squirrelPlay
	 */

	public boolean squirrelPlay(int temp, boolean isSummer) {
		boolean isPlay = false;
		if (isSummer) {
			if (temp >= 60 && temp <= 100) {

				isPlay = true;

			}
		} else if (temp >= 60 && temp <= 90) {
			isPlay = true;

		} else {
			isPlay = false;

		}
		return isPlay;
	}

	/**
	 * in1To10
	 */

	public boolean in1To10(int n, boolean outsideMode) {
		if (!outsideMode && n >= 1 && n <= 10) {
			return true;
		} else if ((outsideMode && n <= 1) || (outsideMode && n >= 10)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * specialEleven
	 * 
	 */

	public boolean specialEleven(int n) {
		if (n % 11 == 0 || n % 11 == 1) {

			return true;
		} else {
			return false;
		}
	}

	/**
	 * more20
	 */

	public boolean more20(int n) {
		if (n % 20 == 1 || n % 20 == 2) {

			return true;
		} else {
			return false;
		}
	}

	/**
	 * old35
	 */

	public boolean old35(int n) {
		if (n % 3 == 0 && n % 5 == 0) {

			return false;
		} else if (n % 3 == 0) {
			return true;
		} else if (n % 5 == 0) {

			return true;
		}
		return false;
	}

	/**
	 * less20
	 */

	public boolean less20(int n) {
		int number = n % 20;

		if ((number + 1) % 20 == 0 || (number + 2) % 20 == 0) {

			return true;
		} else {
			return false;
		}
	}

	/**
	 * nearTen
	 */

	public boolean nearTen(int num) {
		int number = num % 10;
		if (number == 0 || number == 1 || number == 2) {
			return true;
		} else if ((number + 1) % 10 == 0 || (number + 2) % 10 == 0) {

			return true;
		}
		return false;
	}

	/**
	 * teenSum
	 */
	public int teenSum(int a, int b) {
		int result = 0;

		if (a >= 13 && a <= 19) {
			result = 19;
		} else if (b >= 13 && b <= 19) {
			result = 19;
		} else {
			result = a + b;
		}
		return result;
	}

	/**
	 * answerCell
	 * 
	 */

	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep) {
			return false;
		} else if (isMorning && isMom) {

			return true;
		} else if (isMorning) {
			return false;
		}
		return true;
	}

	/**
	 * teaParty
	 */

	public int teaParty(int tea, int candy) {
		if (tea >= 5 && candy >= 5) {
			if (tea >= candy * 2 || candy >= tea * 2) {
				return 2;
			} else {
				return 1;
			}

		} else {
			return 0;
		}
	}

	/**
	 * fizzString
	 */

	public String fizzString(String str) {
		if (str.substring(0, 1).equals("f")
				&& str.substring(str.length() - 1).equals("b")) {
			str = "FizzBuzz";
			return str;
		} else if (str.substring(0, 1).equals("f")) {

			str = "Fizz";
			return str;
		} else if (str.substring(str.length() - 1).equals("b")) {
			str = "Buzz";
			return str;
		}
		return str;
	}

	/**
	 * fizzString2
	 * 
	 */

	public String fizzString2(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			return "FizzBuzz!";
		} else if (n % 3 == 0) {
			return "Fizz!";
		} else if (n % 5 == 0) {
			return "Buzz!";
		} else {
			String str = n + "!";
			return str;
		}

	}

	/**
	 * twoAsOne
	 */

	public boolean twoAsOne(int a, int b, int c) {
		if (a + b == c || b + c == a || c + a == b) {
			return true;
		}
		return false;
	}

	/**
	 * inOrder
	 * 
	 */

	public boolean inOrder(int a, int b, int c, boolean bOk) {
		if (!bOk && b > a && c > b) {

			return true;
		} else if (bOk && c > b) {
			return true;

		}
		return false;
	}

	/**
	 * inOrderEqual
	 */

	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if (!equalOk && c > b && b > a) {

			return true;
		} else if (equalOk && c >= b && b >= a) {

			return true;
		}
		return false;
	}

	/**
	 * lastDigit
	 */
	public boolean lastDigit(int a, int b, int c) {
		int a1 = a % 10;
		int b1 = b % 10;
		int c1 = c % 10;

		if (a1 == b1 || b1 == c1 || a1 == c1) {
			return true;

		}
		return false;

	}

	/**
	 * lessBy10
	 */

	public boolean lessBy10(int a, int b, int c) {
		if (a <= (b - 10) || b <= (a - 10) || a <= (c - 10) || b <= (c - 10)
				|| c <= (a - 10) || c <= (b - 10)) {

			return true;
		}
		return false;
	}

	/**
	 * withoutDoubles
	 */

	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		if (noDoubles && die1 == die2) {
			die1 = die1 + 1;
			if (die1 == 7) {
				die1 = 1;
			}
		}
		return die1 + die2;
	}

	/**
	 * maxMod5
	 */

	public int maxMod5(int a, int b) {
		if (a == b) {
			return 0;

		}
		if (a % 5 == b % 5) {
			if (a > b) {

				return b;
			} else {
				return a;
			}

		} else if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	/**
	 * redTicket
	 */

	public int redTicket(int a, int b, int c) {
		if (a == b && b == c) {
			if (a == 2) {
				return 10;
			} else {
				return 5;
			}
		}
		if (a != b && a != c) {
			return 1;
		}
		return 0;

	}

	/**
	 * greenTicket
	 */

	public int greenTicket(int a, int b, int c) {
		if (a == b && b == c) {
			return 20;

		} else if (a == b || a == c || b == c) {
			return 10;
		} else {
			return 0;
		}
	}

	/**
	 * blueTicket
	 */

	public int blueTicket(int a, int b, int c) {
		int ab = a + b;
		int ac = a + c;
		int bc = b + c;

		if (ab == 10 || ac == 10 || bc == 10) {

			return 10;
		} else if (ab - 10 == ac || ab - 10 == bc) {
			return 5;
		} else {
			return 0;
		}
	}

	/**
	 * shareDigit
	 */

	public boolean shareDigit(int a, int b) {
		if (b / 10 == a / 10 || a % 10 == b % 10 || a / 10 == b % 10
				|| b / 10 == a % 10) {
			return true;
		}
		return false;
	}

	/**
 * sumLimit 
 */

	public int sumLimit(int a, int b) {
		String str = String.valueOf(a);
		String sum = String.valueOf(a + b);
		if (sum.length() > str.length()) {

			return a;
		} else {
			return a + b;
		}
	}
/**
 * 
 */
	
	
}
