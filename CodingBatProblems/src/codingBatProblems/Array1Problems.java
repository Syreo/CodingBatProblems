package codingBatProblems;

public class Array1Problems {

	/**
	 * firstLast6
	 * 
	 * @param nums
	 * @return
	 */

	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * sameFirstLast
	 */
	public boolean sameFirstLast(int[] nums) {
		if (nums.length >= 1) {
			int firstNumber = nums[0];
			int secondNumber = nums[nums.length - 1];
			if (secondNumber - firstNumber == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	/**
	 * makePi
	 * 
	 */

	public int[] makePi() {
		int[] makePi = new int[3];
		makePi[0] = 3;
		makePi[1] = 1;
		makePi[2] = 4;
		return makePi;
	}

	/**
	 * commonEnd
	 */

	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * sum3
	 */

	public int sum3(int[] nums) {
		int sum = 0;

		if (nums.length > 2) {
			int firstNumber = nums[0];
			int secondNumber = nums[1];
			int thirdNumber = nums[2];

			sum = firstNumber + secondNumber + thirdNumber;

		}
		return sum;
	}

	/**
	 * rotateLeft3
	 */

	public int[] rotateLeft3(int[] nums) {
		int one = nums[0];
		int two = nums[1];
		int three = nums[2];

		nums[0] = two;
		nums[1] = three;
		nums[2] = one;

		return nums;

	}

	/**
	 * reverse3
	 */
	public int[] reverse3(int[] nums) {
		int one = nums[0];
		int two = nums[1];
		int three = nums[2];

		nums[0] = three;
		nums[1] = two;
		nums[2] = one;

		return nums;
	}

	/**
	 * maxEnd3
	 */

	public int[] maxEnd3(int[] nums) {
		if (nums[0] > nums[2]) {
			nums[1] = nums[0];
			nums[2] = nums[0];
		} else {
			nums[1] = nums[2];
			nums[0] = nums[2];
		}
		return nums;

	}

	/**
	 * sum2
	 */

	public int sum2(int[] nums) {
		int sum = 0;
		if (nums.length >= 2) {
			sum = nums[0] + nums[1];

			return sum;
		}
		if (nums.length == 0) {
			return 0;
		} else {
			sum = nums[0];
		}
		return sum;
	}

	/**
	 * middleWay
	 */

	public int[] middleWay(int[] a, int[] b) {
		int[] newArray = new int[2];

		newArray[0] = a[1];
		newArray[1] = b[1];

		return newArray;
	}

	/**
	 * makeEnds
	 */

	public int[] makeEnds(int[] nums) {
		int[] newArray = new int[2];
		if (nums.length >= 1) {
			newArray[0] = nums[0];
			newArray[1] = nums[nums.length - 1];

			return newArray;
		} else {

			return nums;
		}

	}

	/**
	 * has23
	 * 
	 */

	public boolean has23(int[] nums) {
		if (nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3) {

			return true;
		} else {
			return false;
		}
	}

	/**
	 * no23
	 */

	public boolean no23(int[] nums) {
		if (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3) {

			return true;

		} else {
			return false;
		}
	}

	/**
	 * makeLast
	 */

	public int[] makeLast(int[] nums) {
		int[] newArray = new int[nums.length * 2];
		newArray[newArray.length - 1] = nums[nums.length - 1];

		return newArray;

	}

	/**
	 * 
	 * double23
	 */

	public boolean double23(int[] nums) {
		if (nums.length > 1) {
			if ((nums[0] == 2 && nums[1] == 2)
					|| (nums[0] == 3 && nums[1] == 3)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * fix23
	 */
	public int[] fix23(int[] nums) {
		if (nums.length > 2) {
			if (nums[0] == 2 && nums[1] == 3) {
				nums[1] = 0;
				return nums;
			}

			if (nums[1] == 2 && nums[2] == 3) {
				nums[2] = 0;
				return nums;
			}
		}
		return nums;
	}

	/**
	 * start1
	 */
	public int start1(int[] a, int[] b) {
		int count = 0;
		if (a.length > 0 && a[0] == 1) {
			count++;
		}
		if (b.length > 0 && b[0] == 1) {
			count++;
		}
		return count;

	}

	/**
	 * biggerTwo
	 */

	public int[] biggerTwo(int[] a, int[] b) {
		int aSum = 0;
		int bSum = 0;

		aSum = a[0] + a[1];
		bSum = b[0] + b[1];

		if (aSum >= bSum) {
			return a;

		} else {
			return b;
		}

	}

	/**
	 * makeMiddle
	 */

	public int[] makeMiddle(int[] nums) {
		int test = (nums.length / 2);

		int[] newArray = new int[2];
		if (nums.length > 1) {
			newArray[0] = nums[test - 1];
			newArray[1] = nums[test];
		}

		return newArray;
	}

	/**
	 * plusTwo
	 */

	public int[] plusTwo(int[] a, int[] b) {
		int[] newArray = new int[4];

		newArray[0] = a[0];
		newArray[1] = a[1];
		newArray[2] = b[0];
		newArray[3] = b[1];

		return newArray;
	}

	/**
	 * swapEnds
	 */

	public int[] swapEnds(int[] nums) {
		int test = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = test;
		return nums;
	}

	/**
	 * midThree
	 */

	public int[] midThree(int[] nums) {
		int test = ((nums.length - 1) / 2);
		int[] newArray = new int[3];

		newArray[0] = nums[test - 1];
		newArray[1] = nums[test];
		newArray[2] = nums[test + 1];

		return newArray;

	}

	/**
	 * maxTriple
	 */

	public int maxTriple(int[] nums) {
		int test = ((nums.length - 1) / 2);
		int solution = 0;
		if (nums[0] > nums[nums.length - 1] && nums[0] > nums[test]) {
			solution = nums[0];
		} else if (nums[nums.length - 1] > nums[0]
				&& nums[nums.length - 1] > nums[test]) {
			solution = nums[nums.length - 1];
		}

		else if (nums[test] > nums[nums.length - 1] && nums[test] > nums[0]) {
			solution = nums[test];
		}

		return solution;

	}

	/**
	 * frontPiece
	 */

	public int[] frontPiece(int[] nums) {
		int[] newArray = new int[2];

		if (nums.length > 2) {
			newArray[0] = nums[0];
			newArray[1] = nums[1];

			return newArray;

		}
		return nums;
	}

	/**
	 * unlucky1
	 */

	public boolean unlucky1(int[] nums) {
		if (nums.length > 1) {
			if ((nums[0] == 1 && nums[1] == 3)
					|| (nums[1] == 1 && nums[2] == 3)) {
				return true;
			}
			if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
				return true;
			}
			return false;
		}
		return false;
	}

	/**
 * make2 
 */

	public int[] make2(int[] a, int[] b) {
		int[] newArray = new int[2];

		if (a.length <= 0) {
			newArray[0] = b[0];
			newArray[1] = b[1];
			return newArray;

		}
		if (a.length > 1) {
			newArray[0] = a[0];
			newArray[1] = a[1];
			return newArray;

		} else {
			newArray[0] = a[0];
			newArray[1] = b[0];
			return newArray;
		}

	}

}
