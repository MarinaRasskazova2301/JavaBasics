public class TrafficLights {

    public static String updateLight(String current) {

        return (current.equals("red") ? "green" : current.equals("yellow") ? "red" : "yellow");
    }

}
