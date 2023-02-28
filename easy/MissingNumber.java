package easy;

/*Given an array nums containing n distinct numbers in the range [0, n],
 return the only number in the range that is missing from the array.*/

public class MissingNumber {
    public int missingNumber(int[] nums){
        int rangeSum = 0, numsSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
            rangeSum += i;
        }
        return (rangeSum + nums.length) - numsSum;
    }
}
