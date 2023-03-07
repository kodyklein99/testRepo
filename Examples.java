
public class Examples {
    double value;
    double roundToIncrement;

    public Examples(double value, double roundToIncrement) {
        this.value = value;
        this.roundToIncrement = roundToIncrement;

    }

    // The main method is what runs when you call the class. Similar to python if
    // name == main. Without a main method, you can't run it and can only create
    // instances.
    public static void main(String[] args) {
        // examples myObj = new examples();
        double value = 0.23;
        double roundToIncrement = 0.25;

        Examples myObj = new Examples(value, roundToIncrement);

        System.out.println(myObj.notStaticRoundValue());
    }

    /*
     * A static method belongs to the class as well as the instance, but accessing
     * the method from the instance works but is discouraged.
     * public static double staticRoundValue(double value) {
     * return roundValue(value);
     * }
     */

    // A non-static method belongs to only the instance and can only be accessed by
    // creating an instance
    public double notStaticRoundValue() {
        return roundValue(value, roundToIncrement);
    }

    private double roundValue(double value, double roundToIncrement) {
        double realValue;

        double rem = value % roundToIncrement;

        if (rem != 0.0) {
            realValue = value - rem + roundToIncrement;
        } else {
            realValue = value;
        }

        return realValue;
    }
}
