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
    
    public static void main (String[] args){

        int [] simpleArray = {0, 1, 2, 3, 4, 5};
        int indexOf2 = linearSearch(simpleArray, 2);

        System.out.println(indexOf2);
        



    }

}