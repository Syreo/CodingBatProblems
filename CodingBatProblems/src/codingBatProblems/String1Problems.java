package codingBatProblems;

public class String1Problems {

	/**
	 * 
	 * String-1 > helloName
	 * 
	 */
	public String helloName(String name) {
		String newStr = "Hello ";

		return newStr + name + "!";
	}

	/**
	 * String-1 > makeAbba
	 */
	public String makeAbba(String a, String b) {
		String forwardStr = a + b;
		String reverseStr = b + a;

		return forwardStr + reverseStr;
	}

	/**
	 * String-1 > makeTags
	 */
	public String makeTags(String tag, String word) {
		String beginningTag = "<" + tag + ">";
		String endingTag = "</" + tag + ">";
		return beginningTag + word + endingTag;
	}

	/**
	 * String-1 > makeOutWord
	 */
	public String makeOutWord(String out, String word) {
		String firstStr = out.substring(0, 2);
		String lastStr = out.substring(2, 4);

		return firstStr + word + lastStr;
	}

	/**
	 * String-1 > extraEnd
	 */
	public String extraEnd(String str) {
		String newStr = str.substring(str.length() - 2);

		return newStr + newStr + newStr;
	}

	/**
	 * firstTwo
	 */

	public String firstTwo(String str) {
		if (str.length() > 2) {

			String newStr = str.substring(0, 2);
			return newStr;
		}

		return str;

	}

	/**
	 * firstHalf
	 */
	public String firstHalf(String str) {
		int count = str.length() / 2;

		String newStr = str.substring(0, count);
		return newStr;
	}

	/**
	 * withoutEnd
	 */

	public String withoutEnd(String str) {
		String newStr = str.substring(1, str.length() - 1);
		return newStr;
	}

	/**
	 * comboString
	 */
	public String comboString(String a, String b) {
		if (a.length() < b.length()) {
			return a + b + a;
		} else {
			return b + a + b;
		}
	}

	/**
	 * nonStart
	 */
	public String nonStart(String a, String b) {
		String newStr = a.substring(1, a.length()) + b.substring(1, b.length());
		return newStr;
	}

	/**
	 * left2
	 */
	public String left2(String str) {
		String end2Str = str.substring(0, 2);

		String frontEndStr = str.substring(2, str.length());
		return frontEndStr + end2Str;
	}

	/**
	 * right2
	 */
	public String right2(String str) {
		String backStr = str.substring(str.length() - 2, str.length());
		String frontStr = str.substring(0, str.length() - 2);

		return backStr + frontStr;
	}

	/**
	 * theEnd
	 */
	public String theEnd(String str, boolean front) {
		if (front) {
			String newStr = str.substring(0, 1);
			return newStr;
		} else {
			String newStr = str.substring(str.length() - 1);
			return newStr;
		}

	}

	/**
	 * withouEnd2
	 */
	public String withouEnd2(String str) {
		if (str.length() > 2) {
			String newStr = str.substring(1, str.length() - 1);
			return newStr;
		} else {
			return "";
		}
	}

	/**
	 * middleTwo
	 */
	public String middleTwo(String str) {
		if (str.length() % 2 == 0) {
			int count = str.length() / 2;
			String newStr = str.substring(count - 1, count + 1);
			return newStr;
		}
		return str;
	}

	/**
	 * endsLy
	 */
	public boolean endsLy(String str) {
		if (str.length() > 1
				&& str.substring(str.length() - 2, str.length()).equals("ly")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * nTwice
	 */
	public String nTwice(String str, int n) {
		String newStr = str.substring(0, n);
		String newStr2 = str.substring(str.length() - n, str.length());
		return newStr + newStr2;
	}

	/**
	 * twoChar
	 */
	public String twoChar(String str, int index) {
		if (index < 0) {
			String newString = str.substring(0, 2);
			return newString;
		}
		if (str.length() >= index + 2) {
			String newStr = str.substring(index, index + 2);
			return newStr;
		} else {
			String newStr = str.substring(0, 2);
			return newStr;
		}
	}

	/**
	 * middleThree
	 */

	public String middleThree(String str) {

		if (str.length() % 2 != 0) {

			int number = (str.length() - 1) / 2;
			String newStr = str.substring(number - 1, number + 2);

			return newStr;
		}
		return str;
	}

	/**
	 * hasBad
	 */
	public boolean hasBad(String str) {
		if (str.length() > 3) {
			if ((str.substring(0, 3).equals("bad"))
					|| (str.substring(1, 4).equals("bad"))) {
				return true;
			}
		}
		if (str.length() == 3 && str.substring(0, 3).equals("bad")) {
			return true;
		}

		return false;
	}

	/**
	 * atFirst
	 */

	public String atFirst(String str) {
		if (str.length() >= 2) {
			return str.substring(0, 2);
		}
		if (str.length() >= 1) {
			return str + "@";
		}
		return str + "@@";
	}

	/**
	 * lastChars
	 */
	public String lastChars(String a, String b) {
		if (a.length() > 0 && b.length() > 0) {
			String newStr = a.substring(0, 1) + b.substring(b.length() - 1);
			return newStr;
		}
		if (a.length() == 0 && b.length() == 0) {
			String newStr = "@@";
			return newStr;
		}
		if (a.length() == 0 && b.length() != 0) {
			String newStr = "@" + b.substring(b.length() - 1);
			return newStr;
		}
		if (b.length() == 0 && a.length() != 0) {
			String newStr = a.substring(0, 1) + "@";
			return newStr;
		}

		return a;
	}

	/**
	 * conCat
	 */
	public String conCat(String a, String b) {
		if (a.length() > 0 && b.length() > 0) {
			if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
				String newStr = a.substring(0, a.length() - 1) + b;
				return newStr;
			}
		}
		String newStr = a + b;
		return newStr;
	}

	/**
	 * lastTwo
	 */
	public String lastTwo(String str) {
		if (str.length() >= 2) {
			String firstChar = str
					.substring(str.length() - 2, str.length() - 1);
			String secondChar = str.substring(str.length() - 1);
			String newStr = str.substring(0, str.length() - 2) + secondChar
					+ firstChar;
			return newStr;
		}
		return str;
	}

	/**
	 * seeColor
	 */
	public String seeColor(String str) {
		if (str.length() >= 3) {
			if (str.substring(0, 3).equals("red")) {
				String newStr = "red";
				return newStr;
			}
		}
		if (str.length() >= 4) {
			if (str.substring(0, 4).equals("blue")) {
				String newStr = "blue";
				return newStr;
			}
		}
		return "";
	}

	/**
	 * frontAgain
	 */

	public boolean frontAgain(String str) {
		if (str.length() >= 3) {
			if (str.substring(0, 2).equals(
					str.substring(str.length() - 2, str.length()))) {
				return true;
			}
		}
		if (str.length() == 2) {
			return true;
		}
		return false;
	}

	/**
	 * minCat
	 */

	public String minCat(String a, String b) {
		if (a.length() > b.length()) {
			int number = b.length();
			String newStr = a.substring(a.length() - number);
			return newStr + b;
		}
		if (b.length() > a.length()) {
			int number = a.length();
			String newStr = b.substring(b.length() - number);
			return a + newStr;
		}
		return a + b;
	}

	/**
	 * extraFront
	 */

	public String extraFront(String str) {
		if (str.length() >= 2) {
			String newStr = str.substring(0, 2);
			return newStr + newStr + newStr;
		}
		String newStr = str + str + str;
		return newStr;
	}

	/**
	 * without2
	 */
	public String without2(String str) {
		if (str.length() >= 3) {
			if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
				String newStr = str.substring(2, str.length());
				return newStr;
			}
			return str;
		}
		if (str.length() == 1) {
			return str;
		}
		return "";
	}

	/**
	 * deFront
	 */

	public String deFront(String str) {
		if (str.substring(0, 1).equals("a") || str.substring(1, 2).equals("b")) {

			if (str.substring(0, 1).equals("a")
					&& (!str.substring(1, 2).equals("b"))) {
				String newStr = str.substring(0, 1)
						+ str.substring(2, str.length());
				return newStr;
			}
			if ((!str.substring(0, 1).equals("a"))
					&& (str.substring(1, 2).equals("b"))) {
				String newStr = str.substring(1, str.length());
				return newStr;

			}
			if (str.substring(0, 1).equals("a")
					&& str.substring(1, 2).equals("b")) {
				return str;
			}
		}
		if ((!str.substring(0, 1).equals("a"))
				&& (!str.substring(1, 2).equals("b"))) {
			String newStr = str.substring(2, str.length());
			return newStr;
		}
		return str;
	}

	/**
	 * startWord
	 */

	public String startWord(String str, String word) {
		int number = word.length();

		if (str.length() < 1 || word.length() > str.length()) {

			return "";
		}
		if (word.length() == 1) {
			String newStr = str.substring(0, 1);
			return newStr;
		}
		if (str.substring(1, number).equals(word.substring(1, word.length()))) {
			String newStr = str.substring(0, number);
			return newStr;

		}

		return "";
	}

	/**
	 * withoutX
	 */

	public String withoutX(String str) {
		if (str.length() >= 2) {
			if (str.substring(0, 1).equals("x")
					&& str.substring(str.length() - 1).equals("x")) {
				String newStr = str.substring(1, str.length() - 1);
				return newStr;
			}
			if (str.substring(0, 1).equals("x")) {
				String newStr = str.substring(1, str.length());
				return newStr;
			}
			if (str.substring(str.length() - 1).equals("x")) {
				String newStr = str.substring(0, str.length() - 1);
				return newStr;
			}
			return str;
		}
		return "";
	}

	/**
	 * withoutX2 
	 */

	public String withoutX2(String str) {
		if (str.length() >= 2) {

			if (str.substring(0, 1).equals("x")
					&& str.substring(1, 2).equals("x")) {

				String newStr = str.substring(2, str.length());
				return newStr;
			}
			if (str.substring(0, 1).equals("x")) {
				String newStr = str.substring(1, str.length());
				return newStr;
			}
			if (str.substring(1, 2).equals("x")) {

				String newStr = str.substring(0, 1)
						+ str.substring(2, str.length());
				return newStr;
			}
			return str;
		}
		return "";
	}
	
	
	/**
	 * 
	 */
	
	

}
