import java.util.Arrays;

public class BetterThanAverage {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        int[] allPoints = new int[classPoints.length + 1];
        System.arraycopy(classPoints, 0, allPoints, 0, classPoints.length);
        allPoints[allPoints.length - 1] = yourPoints;
        return yourPoints > Arrays.stream(allPoints).average().orElse(0);

    }

}

