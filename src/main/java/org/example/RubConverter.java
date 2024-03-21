package org.example;

public class RubConverter implements Convertor {
    private final String type = "RUB";
    private final double course = 1;

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
