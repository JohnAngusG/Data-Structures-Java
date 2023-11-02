public class InsertionSort{
    // insertion sort wants to temporarily remove the value at index 1 and then shift everyhting around it. 
    
    static int [] insertionSort(int [] array){

        for (int i = 1; i < array.length; i++){     // Going through entire length of array. 
            int temp = array[i];                    // Taking the index 1 value and storing it in temp variable. 
            int position = i - 1;                   // taking value TO THE LEFT of where I am initially looking at each loop. 

            // this is what shift the array to the right.
            while (position >= 0){                  // DONT UNDERSTAND THIS ONE, WHY DOES IT GO BELOW 0 EVER?
                if (array[position] > temp){                    
                    array[position + 1] = array[position];
                    position = position - 1;
                }
                else {
                    break;
                }
            }

            array[position + 1] = temp;
        }

        return array;
    }

    public static void main (String[] args){
        int [] unsortedArray = {10, 0, 2, 1, 5, 3, 11, 5};
        int [] sortedArray  = insertionSort(unsortedArray);

        for (var element : sortedArray){
            System.out.print(element + " ");
        }
    }



}