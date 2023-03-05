
public class examples {

    public static void main(String[] args) {
        // examples myObj = new examples();
        String answer = roundValue(0.23);
        System.out.println(answer);
    }

    public static String roundValue(double value) {

        double realValue;

        double rem = value % .25;

        if (rem != 0.0) {
            realValue = value - rem + .25;
        } else {
            realValue = value;
        }

        String msg = ("value " + String.format("%.2f", value) + ", rem " + String.format("%.2f", rem)
                + ", realValue " + String.format("%.2f", realValue));

        // System.out.println(msg);

        return msg;
    }
}
