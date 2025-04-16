package org.example;

public class Solution {
    public int solution(int number, int n, int m) {
        if(number % n == 0 && number % m == 0){
            return 1;
        } else if(n % number == 0 || m % number == 0){
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution(55, 10, 5);
        System.out.println("결과: " + result);
    }
}