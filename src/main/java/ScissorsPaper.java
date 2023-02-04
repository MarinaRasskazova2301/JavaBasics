import java.util.ArrayList;
import java.util.List;

public class ScissorsPaper {
    public static String rps(String p1, String p2) {

        List<String> elements = new ArrayList<>();
        elements.add(p1);
        elements.add(p2);

        if (elements.contains("scissors") && elements.contains("paper")) {

            return "Player " + getPlayerNumber(elements, "scissors")+" won!";
        } else if (elements.contains("scissors") && elements.contains("rock")) {

            return "Player " + getPlayerNumber(elements, "rock")+" won!";
        } else if (elements.contains("rock") && elements.contains("paper")) {

            return "Player " + getPlayerNumber(elements, "paper")+" won!";
        }

        return "Draw!";
    }


    public static int getPlayerNumber(List<String> elements, String element) {
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).equals(element)) {
                return i+1;
            }
        }
        return -1;
    }

}

//
//   if(p1 == p2) return "Draw!";
//           int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
//           return "Player " + p + " won!";
