/**
 * 
 */
package codingBatProblems;

/**
 * @author hyoung
 * 
 */
public class String2 {

	/**
	 * doubleChar
	 * 
	 * @param str
	 * @return
	 */

	public String doubleChar(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result += str.substring(i, i + 1);
			result += str.substring(i, i + 1);
		}
		return result;
	}

	/**
	 * countHi
	 */

	public int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 1).equals("h")
					&& str.substring(i + 1, i + 2).equals("i")) {
				count++;
			}

		}
		return count;
	}

	/**
	 * catDog
	 */

	public boolean catDog(String str) {
		int catCount = 0;
		int dogCount = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				catCount++;

			}
			if (str.substring(i, i + 3).equals("dog")) {
				dogCount++;

			}
		}
		if (dogCount == catCount) {

			return true;
		}
		return false;
	}

	/**
	 * countCode
	 */

	public int countCode(String str) {
		int count = 0;

		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, i + 2).equals("co")
					&& str.substring(i + 3, i + 4).equals("e")) {
				count++;

			}

		}
		return count;
	}

	/**
	 * endOther
	 */
	public boolean endOther(String a, String b) {

		int count = a.length();
		int count2 = b.length();
		if (count <= count2) {
			if (b.substring(b.length() - count, b.length()).toLowerCase()
					.equals(a.toLowerCase())) {
				return true;
			}
		}

		if (count2 <= count) {
			if (a.substring(a.length() - count2, a.length()).toLowerCase()
					.equals(b.toLowerCase())) {

				return true;
			}
		}
		return false;
	}

	/**
	 * xyzThere
	 */

	public boolean xyzThere(String str) {
		for (int i = 0; i < str.length() - 2; i++) {

			if (str.substring(i, i + 3).equals("xyz") && i == 0) {

				return true;
			} else if (str.substring(i, i + 3).equals("xyz")
					&& !str.substring(i - 1, i).equals(".")) {
				return true;
			}
		}

		return false;
	}

	/**
	 * bobThere 
	 */

	public boolean bobThere(String str) {
		if (str.length() > 2) {
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.substring(i, i + 1).equals("b")
						&& str.substring(i + 2, i + 3).equals("b")) {
					return true;
				}

			}
		}
		return false;
	}

}
