# Практична робота "Масиви, вирази, керування виконанням програми"
## Завдання Знайти в масиві число, яке повторюється найбільшу кількість разів

### Exercise.java
```java
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
```

### TestResult.java
```java
package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
	int[] arr = {10,6,4,3,2,3,0};
        System.out.printf("the number that repeats the largest number of times: %d",Exercise.Calculate(arr));      

    }
}
```