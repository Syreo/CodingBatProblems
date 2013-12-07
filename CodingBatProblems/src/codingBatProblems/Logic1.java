package codingBatProblems;

public class Logic1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	 * 
	 */
	
	
	
	
}
