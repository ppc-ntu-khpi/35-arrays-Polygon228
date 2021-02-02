package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
	int[] arr = {10,6,4,3,2,3,0};
        System.out.printf("the number that repeats the largest number of times: %d",Exercise.Calculate(arr));      

    }
}
