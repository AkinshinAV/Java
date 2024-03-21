package org.example;

public class DollarConverter implements Convertor {
    private final String type = "USD";
    private final double course = 91.45;

    @Override
    public double ConvertToRub(double val) {
        return val * course;
    }

    @Override
    public double ConvertToCurrency(double Rub) {
        return Rub / course;
    }

    @Override
    public String getType() {
        return type;
    }
}
