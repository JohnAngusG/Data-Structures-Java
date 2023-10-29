
import java.util.Arrays;

public class TwoSum {
    // solving https://leetcode.com/problems/two-sum/ 

    // Psuedo Code Solution
    /* get inputs
        get target
        i = 0
        j = 1
        for inputs times:
            for inputs - 1 times:   
                sum = inputs[i] + inputs[j]
                if sum == value
                break
        report [inputs[i], inputs[j]]
     * 
     * 
    */
    static int[] twoSum(int[] nums, int target) {
            int i;
            int j = 1;
            for (i = 0; i < nums.length - 1; i++){
                for(; j < nums.length - 1; j++){
                    int sum = nums[i] + nums[j];
                    if (sum == target){
                        break;
                    }
                }
            }
            int [] solution = {nums[i], nums[j]};
            return solution;
        }

    public static void main(String[] args){
        int [] exampleArray = {1, 2, 3, 4, 5};
        int [] example = twoSum(exampleArray, 7);

        System.out.println(Arrays.toString(example));


    }
}
