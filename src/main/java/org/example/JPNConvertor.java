package org.example;

public class JPNConvertor implements Convertor{
    private final String type = "JPN";
    private final double course = 0.16;

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
