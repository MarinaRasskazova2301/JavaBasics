import java.util.Arrays;

public class DoubleChar {
    public static String doubleChar(String s) {
        //enter your code here
        char[] chars = s.toCharArray();
        char[] doubleChars=new char[chars.length*2];
        for (int i=0; i<chars.length; i++){
            doubleChars[i*2]=chars[i];
            doubleChars[i*2+1]=chars[i];
            }
        return String.valueOf(doubleChars);
    }

    //return s.replaceAll(".", "$0$0");
}

//    StringBuilder srtingBuilder = new StringBuilder("");
//    for (int i = 0; i < s.length(); i++) {
//        stringBuilder.append(s.charAt(i)).append(s.charAt(i));
//        }
//        return stringBuilder.toString();
