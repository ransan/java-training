package IPK.math;

import java.text.DecimalFormat;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        int celsius = 12;
        double fahrenheit = (12 * 9/5) + 32;
        System.out.println(fahrenheit);
        double cel = (fahrenheit - 32) * 5/9;
        System.out.println(decimalFormat.format(cel));

    }
}
