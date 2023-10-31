public class OrderedArray {
    static int orderedArraySearch(int [] array, int target){
        for (int i = 0; i < array.length; i++){
            if(array[i] == target){
                return i;
            }
            else if (array[i] > target){
                break;
            }
        }
        return -1;
    }

    static int binarySearch(int [] array, int target){
        int lowerbound = 0;
        int upperbound = array.length - 1;

        

        while (lowerbound <= upperbound){
            int midpoint = (upperbound + lowerbound) / 2;
            int valueAtMidpoint = array[midpoint];

            if (valueAtMidpoint == target) {
                return midpoint;
            }
            else if (target < valueAtMidpoint){
                upperbound = midpoint - 1;
            }
            else if (target > valueAtMidpoint){
                lowerbound = midpoint + 1;
            }


            // if (valueAtMidpoint == target){
            //     return midpoint;
            // }
            // else if (valueAtMidpoint > target){
            //     lowerbound = midpoint + 1;
            // }
            // else {
            //     upperbound = midpoint -1;
            // }
        }

        return -1;
    }

    public static void main (String[] args){
        int [] testArray = {1, 2, 3, 4, 5, 6};
        int target = 5;
        System.out.println(orderedArraySearch(testArray, target));
        System.out.println(binarySearch(testArray, target));

    }


}
