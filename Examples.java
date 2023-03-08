
public class Examples {
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

    private double value;

    private double roundToIncrement;

    public Examples() {
        this.value = 0;
        this.roundToIncrement = 0;
    }

    public Examples(double value, double roundToIncrement) {
        this.value = value;
        this.roundToIncrement = roundToIncrement;

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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getRoundToIncrement() {
        return roundToIncrement;
    }

    public void setRoundToIncrement(double roundToIncrement) {
        this.roundToIncrement = roundToIncrement;
    }

    @Override
    public String toString() {
        return "Examples [value=" + value + ", roundToIncrement=" + roundToIncrement + "]";
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(roundToIncrement);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Examples other = (Examples) obj;
        if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value))
            return false;
        if (Double.doubleToLongBits(roundToIncrement) != Double.doubleToLongBits(other.roundToIncrement))
            return false;
        return true;
    }

}
