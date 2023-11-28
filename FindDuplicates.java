import java.util.HashMap; 
public class FindDuplicates {

    public static String findDuplicate(String [] array){
        HashMap<String, Boolean> data = new HashMap<String, Boolean>();
        for(int i = 0; i < array.length; i++){
            if((data.containsKey(array[i]))){
                return array[i];
            }
            else{
                data.put(array[i], true);   // Java doesnt like having an empty hashmap. I want to test it before i add it to the hashmap to just return asap but cant figurte out how to cehck it in Java. 
            }
        }
        return "Not Found";
    }
    
    public static void main (String[] args){
        String [] array = {"a", "b", "c", "d", "d"};
        
        System.out.println(findDuplicate(array));
    }


}


