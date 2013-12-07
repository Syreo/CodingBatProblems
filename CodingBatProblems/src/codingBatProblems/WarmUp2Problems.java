package codingBatProblems;


/**
 * CodingBat.com Warm up Section 2 problems for Java.
 *
 */

public class WarmUp2Problems {

	
	/**
	 * Warmup-2 > stringTimes 
	 */
	
	public String stringTimes(String str, int n) {
		  String solution = "";
		  for(int i = 1; i <= n; i++){
		  solution = solution + str;
		  }
		  return solution;
		}

	
	/**
	 * Warmup-2 > frontTimes 
	 */
	public String frontTimes(String str, int n) {
		  String solution = "";
		  for(int i = 1; i <= n; i++){
		     if(str.length() < 3) {
		     solution += str.substring(0, str.length());
		     } else {
		     solution += str.substring(0,3);
		     }
		  }
		   return solution;
		}
	/**
	 * Warmup-2 > countXX 
	 */
	int countXX(String str) {
		  int solution = 0;
		  //I do length() - 1 in order to check for overlapping x's. 
		  for(int i = 0; i < str.length()-1; i++){ 
		     if(str.substring(i, i + 2).equals("xx")){
		     solution = solution + 1;
		     
		     }
		  }
		  return solution;
		}
	/**
	 * 
	 */
	
	


}
