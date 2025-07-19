package Array.Easy;

class RemoveDuplicateSolution{

    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }

        return i+1;
    }

}

public class RemoveDuplicate {

    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        RemoveDuplicateSolution sol = new RemoveDuplicateSolution();
        int ans = sol.removeDuplicates(nums);

        System.out.println(ans);

    }
}
