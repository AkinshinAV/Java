package org.example;

// Интерфейс Convertor определяет методы для конвертации валюты
public interface Convertor {
    double ConvertToRub(double val); // Метод для конвертации в рубли
    double ConvertToCurrency(double Rub); // Метод для конвертации из рублей в другую валюту
    String getType(); // Метод для получения типа валюты
}



