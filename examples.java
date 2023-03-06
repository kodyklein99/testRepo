
public class examples {

    public static void main(String[] args) {
        // examples myObj = new examples();

        System.out.println(roundValue(0.23));
    }

    // A static method belongs to the class as well as the instance, but accessing
    // the method from the instance works but is discouraged.
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

    // A non-static method belongs to only the instance and can only be accessed by
    // creating an instance
    public double roundValue2(double value) {

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
