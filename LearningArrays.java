public class LearningArrays {
    
    static int linearSearch(int [] myarray, int lookingFor){
        int i;
        for(i = 0; i < myarray.length; i++){
            if (myarray[i] == lookingFor){
                break;
                
            }
        }
        return i; 
    }
    /* 
    static int binarySearch(int []myarray, int needle){             // If i know the array is ordered then I can shorten the runtime. Saw it in class with Pat too. 
        int index;                                                  // Worst case scenario is need to do 20 operations since I divide the array in half each time. How to divide array in half though? Maybe assign I with the length divided by 2?
        for (int i = myarray.length / 2; i < myarray.length; i++){  // could assign i with half the length of the array and then check to see if its greater than or less than and then assign i again. how to assign it as a subarray in java though?
            if (myarray[i] > needle){

            }
        }

        return m;
    }
*/


    static int binarySearch(int [] myarray, int needle){
        int low = 0;
        int hi = myarray.length;
        int m;
        int value;

        do{
            m = low + (hi - low ) / 2;
            value = myarray[m];

            if (value == needle){
                break;
            } else if (value > needle){
                hi = m;
            } else {
                low = m + 2;
            }

        } while (low < hi);
        return m;

    }

    public static void main (String[] args){

        int [] simpleArray = {0, 1, 2, 3, 4, 5};
        int indexOf2 = linearSearch(simpleArray, 2);

        System.out.println(indexOf2);
        
        int [] simplerArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int indexOf8 = binarySearch(simplerArray, 8);
        System.out.println(indexOf8);


    }

}