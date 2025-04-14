package org.example;

public class Solution {
    public int solution(int angle) {
        if (0 < angle && angle < 90) {
            return 1;  // 예각
        } else if (angle == 90) {
            return 2;  // 직각
        } else if (90 < angle && angle < 180) {
            return 3;  // 둔각
        } else {
            return 4;  // 평각
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] testAngles = {70,91,180};

        for (int angle : testAngles) {
            int result = sol.solution(angle);
            System.out.println("angle = " + angle + ", result = " + result);
        }
    }
}