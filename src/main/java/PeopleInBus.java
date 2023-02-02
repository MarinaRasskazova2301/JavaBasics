import java.util.ArrayList;

public class PeopleInBus {

    public static int countPassengers(ArrayList<int[]> stops) {
       return stops.stream()
                .mapToInt(x -> x[0] - x[1])
               .sum();
    }
}