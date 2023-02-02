

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        int avg =(s1+s2+s3)/3;
        if (avg < 60) {
            return 'F';
        } else if (avg < 70) {
            return 'D';
        } else if (avg < 80) {
            return 'C';
        } else if (avg < 90) {
            return 'D';
        } else {
            return 'A';
        }

    }
//    s1=(s1+s2+s3)/3;
//        return s1 >= 90 ? 'A':s1 >= 80 ? 'B':s1 >= 70 ? 'C':s1 >= 60 ? 'D':'F';
//return "FFFFFFDCBAA".charAt((s1+s2+s3)/30);
}
