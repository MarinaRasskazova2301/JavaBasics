import java.util.Arrays;

public class SumArray {
    public static double sum(double[] numbers) {
//        double sum=0;
//    for(double number:numbers){
//        sum+=number;
//        }
//
//        return sum;

    return Arrays.stream(numbers).sum();

    }
}
