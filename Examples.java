
public class Examples {
    double value;

    public Examples(double value) {
        this.value = value;

    }

    // The main method is what runs when you call the class. Similar to python if
    // name == main. Without a main method, you can't run it and can only create
    // instances.
    public static void main(String[] args) {
        // examples myObj = new examples();
        Examples myObj = new Examples(0.23);

        System.out.println(myObj.notStaticRoundValue());
    }

    /*
     * A static method belongs to the class as well as the instance, but accessing
     * // the method from the instance works but is discouraged.
     * public static double staticRoundValue(double value) {
     * return roundValue(value);
     * }
     */

    // A non-static method belongs to only the instance and can only be accessed by
    // creating an instance
    public double notStaticRoundValue() {
        return roundValue(value);
    }

    private static double roundValue(double value) {
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
