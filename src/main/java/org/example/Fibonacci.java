package org.example;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        long startTime = System.currentTimeMillis();
        System.out.println("Iteration: "+fibonacci.fibonacciIteration(45));
        long endTimeForIteration = System.currentTimeMillis();
        System.out.println("Time: "+ (endTimeForIteration-startTime));
        System.out.println("Recursive: "+fibonacci.fibonacciRecursive(40));
        long endTimeForRecursive = System.currentTimeMillis();
        System.out.println("Time: "+ (endTimeForRecursive-endTimeForIteration));
        System.out.println("DynamicPr: "+fibonacci.fibonacciDynamic(45));
        long endTimeForDynamic = System.currentTimeMillis();
        System.out.println("Time: "+ (endTimeForDynamic-endTimeForRecursive));
    }

    //    Часова складність = O(5)
//    Просторова складність = O(4)
    public int fibonacciIteration(int n) {
        if (n <= 1) {
            return n;
        }

        int prev1 = 0;
        int prev2 = 1;
        int current = 0;

            for (int i = 2; i <= n; i++) {
                current = prev1 + prev2;
                prev1 = prev2;
                prev2 = current;
            }

        return current;

    }
    //    Часова складність = O(n^2)
//    Просторова складність = O(n^2)
    public long fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        long result = fibonacciRecursive(n - 1)+fibonacciRecursive(n - 2);
        return result;

    }
    //    Часова складність = O(n^2) в гіршому випадку
//    Просторова складність = O(n^2)
    public long fibonacciDynamic(int n) {
        if (n <= 1) {
            return n;
        }

        Map<Integer, Long> memory = new HashMap<>();
        if (memory.containsKey(n)) {
            return memory.get(n);
        }

        long result = fibonacciRecursive(n );
        memory.put(n, result);

        return result;
    }
}