package codingBatProblems;

public class WarmUp1Problems {

	/**
	 * CodingBat.com Warm u p Section 1 problems for Java.
	 */
	public static void main(String[] args) {
		
		String str = "hannah";
		String newStr = str.substring(0,1).toUpperCase();
		//return newStr;
		System.out.println(newStr);

	}

	/**
	 * 
	 * Warmup-1 > sleepIn
	 */
	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
			return true;
		}

		return false;
	}

	/**
	 * 
	 * Warmup-1 > monkeyTrouble
	 */

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile == true && bSmile == true) {
			return true;
		}
		if (aSmile == false && bSmile == false) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Warmup-1 > sumDouble
	 */

	public int sumDouble(int a, int b) {
		int total = 0;
		if (a == b) {
			total = (a + b) * 2;
			return total;
		} else {
			total = a + b;
			return total;
		}
	}

	/**
	 * 
	 * Warmup-1 > diff21
	 */
	public int diff21(int n) {
		int total = 0;
		if (n < 21) {
			total = 21 - n;
		} else if (n > 21) {
			total = (n - 21) * 2;
		}
		return total;
	}

	/**
	 * Warmup-1 > parrotTrouble 
	 */
	public boolean parrotTrouble(boolean talking, int hour) {
		if (hour < 6 || hour > 21) {
			talking = true;
		} else {
			talking = false;
		}
		return talking;
	}

	/**
	 * Warmup-1 > makes10
	 */

	public boolean makes10(int a, int b) {
		if (a == 10 || b == 10 || a + b == 10) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Warmup-1 > nearHundred
	 */
	public boolean nearHundred(int n) {
		if (n >= 90 && n <= 110 || n >= 190 && n <= 210) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Warmup-1 > posNeg 
	 */
	public boolean posNeg(int a, int b, boolean negative) {
		if(negative == true){
	           if(a < 0 && b < 0){
	           return true;
	           }else {
	           return false;
	           }
		}
	           else if(a < 0 && b > 0 || a > 0 && b < 0){
	           return true;
	           }else {
	           return false;
	           }
	        }	  
	

	/**
	 * Warmup-1 > notString
	 */
	public String notString(String str) {
		String newStr = "not " + str;
		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
			return str;
		} else {
			return newStr;
		}
	}

	/**
	 * Warmup-1 > missingChar
	 */

	public String missingChar(String str, int n) {
		String newStr = str.substring(0, n);
		String newStr2 = str.substring(n + 1); // this is what removes the
												// character.
		return newStr + newStr2;
	}

	/**
	 * Warmup-1 > frontBack
	 */
	public String frontBack(String str) {
		if (str.length() > 1) {
			String back = str.substring(str.length() - 1);
			String front = str.substring(0, 1);
			String middle = str.substring(1, str.length() - 1);
			return back + middle + front;
		} else {
			return str;
		}
	}

	/**
	 * Warmup-1 > front3
	 */
	public String front3(String str) {
		if (str.length() < 4) {
			return str + str + str;
		} else {
			String newStr = str.substring(0, 3);
			return newStr + newStr + newStr;
		}
	}

	/**
	 * Warmup-1 > backAround
	 */
	public String backAround(String str) {
		if (str.length() > 0) {
			String back = str.substring(str.length() - 1);
			return back + str + back;
		} else {
			return str;
		}
	}

	/**
	 * Warmup-1 > or35
	 */
	public boolean or35(int n) {
		if (n % 3 == 0 || n % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Warmup-1 > front22
	 */

	public String front22(String str) {
		if (str.length() > 2) {
			String firstTwo = str.substring(0, 2);
			return firstTwo + str + firstTwo;
		} else {
			return str + str + str;
		}
	}

	/**
	 * Warmup-1 > startHi
	 */
	public boolean startHi(String str) {
		if (str.length() > 1 && str.substring(0, 2).equals("hi")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Warmup-1 > icyHot
	 */
	public boolean icyHot(int temp1, int temp2) {
		if (temp1 < 0 && temp2 > 100 || temp1 > 0 && temp2 < 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Warmup-1 > in1020
	 */

	public boolean in1020(int a, int b) {
		if (a >= 10 && a <= 20 || b >= 10 && b <= 20) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Warmup-1 > hasTeen
	 */
	public boolean hasTeen(int a, int b, int c) {
		if (a <= 19 && a >= 13 || b <= 19 && b >= 13 || c <= 19 && c >= 13) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Warmup-1 > loneTeen
	 */
	public boolean loneTeen(int a, int b) {
		if (a >= 13 && a <= 19 && b >= 13 && b <= 19) {
			return false;
		} else if ((a > 19 && b > 19) || (a < 13 && b < 13)
				|| (a > 19 && b < 13) || (a < 13 && b > 19)) {
			return false;
		} else {

			return true;
		}
	}

	/**
	 * Warmup-1 > delDel
	 */
	public String delDel(String str) {
		if (str.length() > 3) {
			if (str.substring(1, 4).equals("del")) {
				String strFront = str.substring(0, 1);
				String strBack = str.substring(4);
				return strFront + strBack;
			}

			else {
				return str;
			}

		} else {
			return str;
		}
	}

	/**
	 * Warmup-1 > mixStart
	 */
	public boolean mixStart(String str) {
		if (str.length() > 2) {
			if (str.substring(1, 3).equals("ix")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Warmup-1 > startOz
	 */
	public String startOz(String str) {
		if (str.length() > 2) {
			if (str.substring(0, 2).equals("oz")) {
				String newString = str.substring(0, 2);
				return newString;
			}

			else if (str.substring(0, 1).equals("o")
					&& (!str.substring(1, 2).equals("z"))) {
				String oStr = str.substring(0, 1);
				return oStr;
			} else if ((!str.substring(1, 2).equals("o"))
					&& str.substring(1, 2).equals("z")) {
				String zStr = str.substring(1, 2);
				return zStr;
			} else if (!str.substring(0, 2).equals("oz")) {
				return "";
			}

		}
		return str;
	}

	/**
	 * Warmup-1 > intMax
	 */

	public int intMax(int a, int b, int c) {
		if (a > b) {
			if (a > c) {
				return a;
			} else {
				return c;
			}
		}
		if (b > c) {
			return b;
		} else {
			return c;
		}
	}

	/**
	 * Warmup-1 > close10
	 */
	public int close10(int a, int b) {
		int firstNum = 0;
		int secondNum = 0;
		if (a != b) {

			if (a > 10) {
				firstNum = a - 10;
			} else {
				firstNum = 10 - a;
			}
			if (b > 10) {
				secondNum = b - 10;
			} else {
				secondNum = 10 - b;
			}
			if (firstNum > secondNum) {
				return b;
			} else if (firstNum == secondNum) {
				return 0;
			} else {
				return a;
			}
		}
		return 0;
	}

	/**
 *  Warmup-1 > in3050 
 */
	public boolean in3050(int a, int b) {
		  if(a >= 30 && a <= 40 && b >= 30 && b <= 40){
		  return true;
		  }else if (a >= 40 && a <= 50 && b >= 40 && b <= 50){
		  return true;
		  }
		  else {
		  return false;
		  }
		}
/**
 * Warmup-1 > max1020 
 */
	
	public int max1020(int a, int b) {
		  if(a >= 10 && a <= 20 || b >= 10 && b <= 20){
		     if(a < 10 || a > 20 && b >= 10 && b <= 20){
		  return b;
		  }
		  else if (b < 10 || b > 20 && a >= 10 && a <= 20){
		  return a;
		  }
		  
		  else if(a >= 10 && a <= 20 && b >= 10 && b <= 20){
		     if(a > b){
		     return a;
		     }
		     else {
		     return b;
		     }
		  }
		  }
		
		return 0;
		
		}
/**
 * Warmup-1 > stringE 
 */
	public void test(){
		boolean test = stringE("Heelele");
		System.out.println(test);
	}
	public boolean stringE(String str) {
		   int numberOfEs = 0;
		   for(int i = 0; i < str.length(); i++){
		   if (str.substring(i, i + 1).equals("e")){
		      numberOfEs = numberOfEs + 1;
		   }
		   }
		      if(numberOfEs >= 1 && numberOfEs <= 3){
		      return true;
		      }else{
		      return false;
		      }
		   
		}
	/**
	 * Warmup-1 > lastDigit 
	 */
	public boolean lastDigit(int a, int b) {
		  if(a % 10 == b % 10){
		  return true;
		  }
		  else {
		  return false;
		  }
		}
	/**
	 * Warmup-1 > endUp 
	 */
	public String endUp(String str) {
		  if(str.length() >= 3){
		  int cutStr = str.length()-3;
		  String front = str.substring(0, cutStr);
		  String back = str.substring(cutStr).toUpperCase();
		  return front + back;
		  }
		  else {
		  String sameStr = str.toUpperCase();
		  return sameStr;
		  }
		}
	/**
	 * Warmup-1 > everyNth 
	 */
	
	public String everyNth(String str, int n) {
		  String solution = "";
		  for(int i = 0; i < str.length(); i+=n){ 
		     
		     String newStr = str.substring(i, i + 1);
		     solution = solution + newStr;
		  }
		  return solution;
		}

}
