package org.example;

// Класс CNConvertor реализует интерфейс Convertor для конвертации в китайские юани
public class CNConvertor implements Convertor {
    private final String type = "CN"; // Тип валюты
    private final double course = 13.02; // Курс валюты к рублю

    @Override
    public double ConvertToRub(double val) {
        return val * course; // Конвертация в рубли
    }

    @Override
    public double ConvertToCurrency(double Rub) {
        return Rub / course; // Конвертация из рублей в китайские юани
    }

    @Override
    public String getType() {
        return type; // Получение типа валюты
    }
}