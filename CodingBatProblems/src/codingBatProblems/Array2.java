/**
 * 
 */
package codingBatProblems;

/**
 * @author Hannah
 * 
 */
public class Array2 {

	/**
	 * countEvens
	 */

	public int countEvens(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				result++;
			}
		}
		return result;
	}

	/**
	 * bigDiff
	 */

	public int bigDiff(int[] nums) {
		boolean hasChanged = true;

		while (hasChanged) {
			hasChanged = false;
			for (int index = 0; index < nums.length - 1; index++) {

				if (nums[index] > nums[index + 1]) {
					int num = nums[index];
					nums[index] = nums[index + 1];
					nums[index + 1] = num;
					hasChanged = true;
				}

			}
		}
		return nums[nums.length - 1] - nums[0];
	}

	/**
	 * centeredAverage
	 */

	public int centeredAverage(int[] nums) {
		boolean hasChanged = true;
		int sum = 0;
		int result = 0;
		int count = 0;

		while (hasChanged) {
			hasChanged = false;
			for (int index = 0; index < nums.length - 1; index++) {

				if (nums[index] > nums[index + 1]) {
					int num = nums[index];
					nums[index] = nums[index + 1];
					nums[index + 1] = num;
					hasChanged = true;
				}
			}
		}
		for (int index = 1; index <= nums.length - 2; index++) {
			sum += nums[index];
			count++;

		}
		result = sum / (nums.length - 2);
		return result;
	}

	/**
	 * sum13
	 */

	public int sum13(int[] nums) {
		int sum = 0;

		for (int index = 0; index < nums.length; index++) {
			if (nums[index] == 13) {
				index++;
			} else {
				sum += nums[index];
			}

		}
		return sum;
	}

	/**
	 * sum67
	 */

	public int sum67(int[] nums) {
		boolean hasSum = true;
		int sum = 0;

		for (int index = 0; index < nums.length; index++) {

			if (nums[index] == 6) {
				hasSum = false;

			} else if (nums[index] == 7) {
				if (hasSum) {
					sum += nums[index];
				}
				hasSum = true;

			} else {
				if (hasSum) {
					sum += nums[index];
				}
			}
		}
		return sum;
	}

	/**
	 * has22
	 */

	public boolean has22(int[] nums) {
		boolean has22 = false;

		for (int index = 0; index < nums.length - 1; index++) {
			if (nums[index] == 2 && nums[index + 1] == 2) {
				has22 = true;

			}
		}
		return has22;
	}

	/**
	 * lucky13 
	 */
	
	public boolean lucky13(int[] nums) {
		  boolean hasNo = true;
		  
		  for(int index = 0; index < nums.length; index++){
		  if(nums[index] == 1 || nums[index] == 3) {
		  
		  hasNo = false;
		  }
		  
		  }
		  return hasNo;
		}
	
	/**sum28 
	 * 
	 */
	
	
	
	public boolean sum28(int[] nums) {
		  int count = 0;
		  int sum = 0;
		  boolean has8 = false;
		  
		  for(int index = 0; index < nums.length; index++){
		  if(nums[index] == 2){
		  count++;
		  
		  }
		  
		  }
		  if(count == 4) {
		  
		  has8 = true;
		  }
		  return has8;
		}


	/**
	 * more14 
	 */
	
	
	public boolean more14(int[] nums) {
		  int count4 = 0;
		  int count1 = 0;
		  boolean has1 = false;
		  for(int index = 0; index < nums.length; index++){
		  if(nums[index] == 1){
		  count1++;
		  }
		  if(nums[index] == 4){
		  count4++;
		  
		  }
		  
		  }
		  if(count1 > count4){
		  has1 = true;
		  
		  }
		  return has1;
		}

	/**
	 * 
	 */
	
	
	
}
