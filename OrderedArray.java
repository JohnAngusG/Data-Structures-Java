public class OrderedArray {
    static int orderedArraySearch(int [] array, int target){
        for (int i = 0; i < array.length; i++){
            if(array[i] == target){
                return i;
            }
            else if (array[i] > target){
                return -1;
            }
        }
        return -1;
    }

    public static void main (String[] args){
        int [] testArray = {1, 2, 3, 4, 5, 6};
        int target = 8;
        System.out.println(orderedArraySearch(testArray, target));
    }


}
