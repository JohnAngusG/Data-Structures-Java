import java.util.HashMap;
public class LetterMissing{

    public static char findMissingLetter(String sentence){
        HashMap<Character, Boolean> data = new HashMap<Character, Boolean>();
        Character [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        // Create hashmap with character, boolean key value pairs. 
        for(int i =0; i < sentence.length(); i++){
            data.put(sentence.charAt(i), true);
        }

        // check to see if the hashmap contains the letter in the alphabet i need. 
        for(int i = 0; i < sentence.length(); i++){
            if(!(data.containsKey(alphabet[i]))){    
                return alphabet[i];
            }
        }
        return 'n';
    }

    public static void main(String[] args) {
        String problem = "the quick brown box jumps over a lazy dog";
        System.out.println(findMissingLetter(problem));
    }




}

