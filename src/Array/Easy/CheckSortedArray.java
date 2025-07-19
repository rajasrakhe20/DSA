package Array.Easy;

class Solution{
    public boolean check(int[] nums) {

        int count = 0;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i]){
                count++;
            }
        }
        if(nums[n-1]>nums[0]){
            count++;
        }
        return count<=1;
    }
}

public class CheckSortedArray {


    public static void main(String[] args) {

        int nums[] ={3,4,5,1,2};

        Solution sol = new Solution();

        System.out.println(sol.check(nums));
    }
}
