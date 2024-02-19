package org.example;
import java.util.HashMap;
import java.util.Map;


//TODO: Для кожного з цих методів визначити просторову і часову складності.
//TODO: Для кожного з цих методів підготувати доречний тип UML діаграми.
public class Fibonacci {
    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        System.out.println("Iteration: "+fibonacci.fibonacciIteration(6));
        System.out.println("Recursive: "+fibonacci.fibonacciRecursive(6));
        System.out.println("DynamicPr: "+fibonacci.fibonacciDynamic(6));
    }

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

    public int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1)+fibonacciRecursive(n - 2);

    }

    public int fibonacciDynamic(int n) {
        if (n <= 1) {
            return n;
        }

        Map<Integer, Integer> memory = new HashMap<>();
        if (memory.containsKey(n)) {
            return memory.get(n);
        }

        int result = fibonacciRecursive(n);
        memory.put(n, result);

        return result;
    }
}