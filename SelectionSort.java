public class SelectionSort {

    // opposite of bubble sort. lower values sink to the bottom.
    static int [] selectionSort(int [] array){
        for (int i  = 0; i <array.length -1; i++){                  // iterate through the array
            int lowestIndex = i;                                    // every time we iterate we consider the current index position to be the lowest value
            for (int j = 0 + i + 1; j < array.length; j++){         // iterate through the loop again
                if(array[j] < array[lowestIndex]){                  // check to see if the position later on in the array is shorter than the first one we saved. 
                    lowestIndex = j;                            // if the value at position j on the second loop is lower than the value at position i then change the pointer. 
                }
            }
            if (lowestIndex != i){                                  // check to see if we changed the lowestr index pointer 
                int temp = array[i];                                // swap values
                array[i] = array[lowestIndex];
                array[lowestIndex] = temp;
            }
        }


        return array;                                               // return array
    }


    public static void main(String[] args){

        int [] unsortedArray = {2, 1, 4, 5, -1,0 };
        int [] sortedArray = selectionSort(unsortedArray);

        for(var element: sortedArray){
            System.out.println(element);
        }
    }
}
