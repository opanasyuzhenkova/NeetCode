package easy.prefixsum;

import java.util.ArrayList;

public class HighestAltitude {
    public static int highestAltitude(int[] gain) {
        int maxAlt = 0;
        int curAlt = 0;
        for (int i = 0; i <= gain.length - 1; i++) {
            maxAlt = Math.max(maxAlt, curAlt + gain[i]);
            curAlt = curAlt + gain[i];
            System.out.println(maxAlt + " " + curAlt);
        }
        return maxAlt;
    }

    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(highestAltitude(gain));
    }
}
