package com.template;

public class App {
    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        
        return (number % 2 == 0);
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        if(a > b) {
            return a;
        }
        return b;
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        int result = 1;
        for(int i = 0; i < n; i++){
            result *= n-i;
        }
        return result;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        if(input == ""){ return ""; }
        String reversed_str = "";
        for(int i = input.length()-1; i >= 0; i--){
            reversed_str += input.charAt(i);
        }
        return reversed_str;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        int div = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0) {
                div++;
            }
        }
        return (div == 2);
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        
        return (celsius*9/5) + 32;
    }
}
