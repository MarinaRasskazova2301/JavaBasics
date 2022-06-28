public class SmashWords {
    public static String smash(String... words) {

       //Option 1
       // return String.join(" ", words);


        //Option 2
        StringBuilder sb=new StringBuilder();
        for (String word : words) {
           sb.append(word+" ");
        }
        return sb.toString().trim();

    }
}
