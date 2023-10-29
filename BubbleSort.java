public class BubbleSort {
    
    static int [] bubbleSort (int [] my_array){
        for(int i = 0; i < my_array.length; i++){
            for(int j = 0 ; j < my_array.length - 1 - i; j++){
                if (my_array[j] > my_array[j+1]){
                    int temp;
                    temp = my_array[j+1];
                    my_array[j+1] = my_array[j];
                    my_array[j] = temp;
                }
            }
        }
        return my_array;
    }

    public static void main(String[] args){
        int [] simpleArray = {0, 3, 4, 5, 1, 7, 8,10, 9, 2, 6};
        int [] sortedArray = bubbleSort(simpleArray);
        for(int element : sortedArray){
            System.out.print(element + " ");
        }
    }

}
