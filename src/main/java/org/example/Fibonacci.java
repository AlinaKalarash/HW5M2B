package org.example;
import java.util.HashMap;
import java.util.Map;


//TODO: Розробити три варіанти реалізації розв'язання задачі про числа Фібоначчі: ітераційний, рекурсивний та за принципом динамічного програмування.
//TODO: Для кожного з цих методів визначити просторову і часову складності.
//TODO: Для кожного з цих методів підготувати доречний тип UML діаграми.
public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        System.out.println("Iteration: "+fibonacci.fibonacciIteration(6));
        System.out.println("Recursive: "+fibonacci.fibonacciRecursive(6));
        System.out.println("DynamicPr: "+fibonacci.fibonacciDynamic(6));
    }
//Дано натуральне число n. Потрібно знайти n-те число Фібоначчі. У задачі потрібно реалізувати алгоритм, який обчислить n-те число Фібоначчі і поверне його як результат.
//
//Примітка: Числа Фібоначчі формуються за наступною послідовністю, де перші два числа - 0 і 1, а кожне наступне число є сумою двох попередніх чисел у послідовності.
// Тобто перші кілька чисел Фібоначчі: 0, 1, 1, 2, 3, 5, 8, 13, 21 і т.д.
//
//Задача полягає в тому, щоб знайти n-те число в цій послідовності. Наприклад, якщо n = 6, тобі потрібно знайти шосте число Фібоначчі, яким є число 8.
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

        int result = 0;
        return result;
    }
}