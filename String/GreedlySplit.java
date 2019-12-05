package com.test.string;
/**
 * 
 * @author ravishankar
 * 
 * Balanced strings are those who have equal quantity of L and R characters. Given a balanced string s split
 * it in the maximum amount of balanced strings.
 * 
 * Return the maximum amount of splitted balanced strings.
 * 
 * #Example 1:
 * Input: s="RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL","RRLL","RL","RL", each substring contains same number of L and R.
 * 
 * #Example 2:
 * Input: s="RLLLLRRRLR"
 * Output: 3
 * Explanation: s can be split into "RL","LLLRRR","LR", each substring contains same number of L and R.
 * 
 * #Example 3:
 * Input: s="LLLLRRRR"
 * Output: 1
 * Explanation: s can be split into "LLLLRRRR", each substring contains same number of L and R.
 * 
 * #Example 4:
 * Input: s="RLRRRLLRLL"
 * Output: 2
 * Explanation: s can be split into "RL","RRRLLRLL", each substring contains same number of L and R.
 * 
 * Constraints:
 * 1<=s.length()<=1000
 * s[i]=L or R
 */
public class GreedlySplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = countgreedlySplit("RLLLLRRRLR");
		System.out.println(result);
	}

	public static int countgreedlySplit(String str){
		int count=0;
		int result=0;
		for (int i = 0; i < str.length(); ++i) {
			count += str.charAt(i) == 'L' ? 1 : -1;
			if(count == 0) ++result;
		}
		return result;
	}
}
  
/**
 * Dry Run
 * Input :  R L L L L R R R L R
 * count : -1 0 1 2 3 2 1 0 1 0
 * result:    1           1   1 = 3
 * 
 */