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
    
    static int binarySearch(int []myarray, int needle){ // If i know the array is ordered then I can shorten the runtime. Saw it in class with Pat too. 
        int index;                                      // Worst case scenario is need to do 20 operations since I divide the array in half each time. How to divide array in half though? Maybe assign I with the length divided by 2?
        for (int i = myarray.length / 2; i < myarray.length; i++){
            if (myarray[i] > needle){

            }
        }

        return index;
    }



    public static void main (String[] args){

        int [] simpleArray = {0, 1, 2, 3, 4, 5};
        int indexOf2 = linearSearch(simpleArray, 2);

        System.out.println(indexOf2);
        



    }

}