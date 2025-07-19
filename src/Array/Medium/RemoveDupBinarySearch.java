package Array.Medium;

class RemoveDupBinarySearchSol{
    public int removeDuplicates(int[] nums) {
        int k = 2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

public class RemoveDupBinarySearch {

    public static void main(String[] args) {

        int[] nums= {1,1,1,2,2,3};
        RemoveDupBinarySearchSol sol = new RemoveDupBinarySearchSol();
        int ans = sol.removeDuplicates(nums);
        System.out.println(ans);

    }
}
