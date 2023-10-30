
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
    // static int[] twoSum(int[] nums, int target) {
    //         int i;
    //         for (i = 0; i < nums.length - 1; i++){
                
    //         }
    //         int [] solution = {nums[i], nums[i+1];
    //         return solution;
    //     }

    public static void main(String[] args){
        int [] exampleArray = {2,5,5,11};
        int i;
        int j;
        int target = 10;
        int [] solutionList = new int[2];
        for (i = 0; i < exampleArray.length -1; i++){
            for(j = 1; j < exampleArray.length; j++){
                int sum = exampleArray[i] + exampleArray[j];
                if (sum == target && i != j){
                    solutionList[0] = i;
                    solutionList[1]= j;

                }
            }
        }
        System.out.println(Arrays.toString(solutionList));
        


    }
}
