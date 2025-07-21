package heap.easy;
import java.util.*;

class MaxProductSol{

    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num: nums){
            pq.add(num);
        }
        int x = pq.poll();
        int y = pq.poll();
        return (x-1)*(y-1);
    }
}

public class MaxProduct {

    public static void main(String[] args) {

        int[] nums={3,4,5,2};
        MaxProductSol sol = new MaxProductSol();

        System.out.println(sol.maxProduct(nums));

    }
}
