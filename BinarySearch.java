public class BinarySearch {
    static int binarySearch(int [] arr, int needle){
        int low = 0;
        int high = arr.length;   // this takes us into the indexes of the array, not the array elements themselves 
        int m;
        int value;

        do {
            m = low + (high - low) / 2;
            value = arr[m]; // looking at actual value of array 
            if (value == needle){ 
                return m;
            }
            else if (value > needle){
                high = m;
            }
            else {
                low = m + 1;
            }
        } while (low < high);

        return -1;
    }

    public static void main (String[] args){
        int [] my_array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(my_array, 13));
    }


}
