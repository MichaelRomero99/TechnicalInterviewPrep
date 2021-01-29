import java.util.*;
public class Solution {
	public static int[] twoSum(int[] nums,int target) {
		Set<Integer> set = new HashSet<>();
		for(int x: nums) {
			if(set.contains(target-x)) {
				return new int[] {target-x,x};
			}
			set.add(x);
		}
		return new int[] {};
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(Solution.twoSum(new int[] {2,3,4,5},8)));
		System.out.println(Arrays.toString(Solution.twoSum(new int[] {-2,3,4,5},3)));
	}
}
