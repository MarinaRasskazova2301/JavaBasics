public class ValidatePin {
    public static boolean validatePin(String pin) {

        return pin.matches("\\d{4}|\\d{6}");

        //This is not correct. It ignores anything before and after so it will match "utp4564utp".
        // You need meta escape at start and the end. So correct answer is "^\d{4}$|^\d{6}$"

        //return pin.matches("[0-9]{4}|[0-9]{6}");
    }
}

