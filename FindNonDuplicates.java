import java.util.HashMap;

public class FindNonDuplicates {  // Couldnt figure out solution by myself so copying frrom book. Interesting solution where you increment the value and use a number for the value instead of boolean. 
    
    public static char NonDuplicate(String word){
        HashMap<Character, Integer> data = new HashMap<Character, Integer>();
        for(int i = 0; i < word.length(); i++){
            if(data.containsKey(word.charAt(i))){
                data.put(word.charAt(i), data.get(word.charAt(i) + 1)); 
            }
            else{
                data.put(word.charAt(i), 1);
            }
        } 
        
        for(int i = 0; i < word.length(); i++){
            if(data.get(word.charAt(i))== 1){
                return word.charAt(i);
            }
        }

        return 'n';
    }

    public static void main(String[] args){
        String problem = "minimum";
        System.out.println(NonDuplicate(problem));
    }

}
