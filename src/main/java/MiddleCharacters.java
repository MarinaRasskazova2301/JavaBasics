public class MiddleCharacters {
    public static String getMiddle(String word) {

        return word.length()%2!=0? String.valueOf(word.charAt(word.length()/2)):word.substring(word.length()/2-1,word.length()/2+1);

//        int l = word.length();
//        return word.substring(l / 2 - (1 - l % 2), l / 2 + 1);
    }
}
