public class FakeBinary {
    public static String fakeBin(String numberString) {

        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < numberString.toCharArray().length; i++) {

            int number = Integer.valueOf(numberString.substring(i, i+1));
            sb.append((number < 5)?"0":"1");

        }
        return sb.toString();
        // return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
//return s.replaceAll("[1-4]","0").replaceAll("[^0]","1");
     //  return str.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(joining());
    }
}
