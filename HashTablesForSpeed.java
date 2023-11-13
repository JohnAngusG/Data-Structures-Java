import java.util.HashMap;

public class HashTablesForSpeed {
    
    public static void main (String[] args){
        
        HashMap<Integer, Boolean> testingMap = new HashMap<Integer, Boolean>();
        testingMap.put(42, true);
        testingMap.put(11,true);
        testingMap.put(234, true);

        System.out.println(testingMap.get(21)); // Doesn't exist in the HashMap so java returns null. 
        System.out.println(testingMap.get(42)); // Java returns true, use values as index in order to shorten search time. 

    }

}
