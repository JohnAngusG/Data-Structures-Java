public class TwoCrystalBalls {

    static int sqrtNSearch (boolean [] arr){
        double jmpAmount = Math.floor(Math.sqrt((arr.length)));
        int i = (int) jmpAmount;

        for (; i < arr.length;i += jmpAmount){
            if (arr[i]){
                break;
            }
        }
        i -= jmpAmount;

        for(int j = 0; j < jmpAmount && i < arr.length; j++, ++i){
            if (arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        boolean [] my_array = {false, false, false, false, false, false, false, false, true, true, true, true};        
        System.out.println(sqrtNSearch(my_array));
        

    }
}
