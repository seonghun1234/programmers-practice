package org.example;

public class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] message1 = message.split("");

        for (int i = 0; i <= message1.length; i++) {
            answer = i*2;
        }
        return answer;
    }

}