package domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Клас що являє собою завдання
 * @author Roman
 */
public class Exercise {
    
    /**
     * Знаходить в масиві число, яке повторюється найбільшу кількість разів
     * @param arr вхідний масив
     * @return число, яке повторюється найбільшу кількість разів
     */
    public static int Calculate(int[] arr) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i:arr){
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else {
             map.put(i, 1);
            }
        }
        
        int max = 1;
        int res = 0;
        
        for (Map.Entry<Integer, Integer> currentEntry : map.entrySet()) {
            if (currentEntry.getValue() > max) {
                max = currentEntry.getValue();
                res = currentEntry.getKey();
            }
        }
        return res;
}
    
}

