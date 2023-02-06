public class Sum {

    public int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }
        int sum = 0;

        int i = a;
        if (a < b) {
            while (i <=b) {
                sum += i;
                i++;
            }
        } else {
            while (i >=b) {
                sum += i;
                i--;
            }
        }
        return sum;
    }
}
