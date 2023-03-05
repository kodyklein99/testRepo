
public class test {
    public static void main(String[] args) {

        double value = 4.235298924;
        double realValue;
        value = .2;

        double rem = value % .25;

        if (rem != 0.0) {
            realValue = value - rem + .25;
        } else {
            realValue = value;
        }

        System.out.println(String.format("%.2f", value));
        System.out.println(String.format("%.2f", rem));
        System.out.println(String.format("%.2f", realValue));

    }
}
