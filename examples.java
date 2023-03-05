
public class examples {

    public static void main(String[] args) {
        // examples myObj = new examples();

        System.out.println(roundValue(0.23));
    }

    public static double roundValue(double value) {

        double realValue;

        double rem = value % .25;

        if (rem != 0.0) {
            realValue = value - rem + .25;
        } else {
            realValue = value;
        }

        return realValue;
    }
}
