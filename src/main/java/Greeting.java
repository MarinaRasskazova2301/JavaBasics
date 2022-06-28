public class Greeting {
    public static String greet(String name) {

        if (name == null || name.length() < 1) {
            return "Invalid input.";
        }
        return String.format("Hello, %s how are you doing today?", name);
    }
}
