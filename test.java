
public class test {

    public static void main(String[] args) {
        test myObj = new test();
        myObj.roundValue(0.23);
    }

    public void roundValue(double value) {

        double realValue;

        double rem = value % .25;

        if (rem != 0.0) {
            realValue = value - rem + .25;
        } else {
            realValue = value;
        }

        System.out.println("value " + String.format("%.2f", value) + ", rem " + String.format("%.2f", rem)
                + ", realValue " + String.format("%.2f", realValue));
    }
}
