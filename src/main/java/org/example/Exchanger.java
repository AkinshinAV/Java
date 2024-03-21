package org.example;

// Класс Exchanger реализует функционал обмена валюты
public class Exchanger {
    public Convertor[] convertors; // Массив конверторов для доступа к различным валютам

    public Exchanger() {
        // Инициализация массива конверторов при создании объекта Exchanger
        convertors = new Convertor[]{new DollarConverter(), new RubConverter(), new JPNConvertor(), new CNConvertor()};
    }

    // Метод для конвертации валюты
    public double Convert(double value, String input, String output) {
        double rub = 0; // Исходная сумма в рублях

        // Перебираем конверторы для нахождения входной валюты и конвертации в рубли
        for (Convertor convertor : convertors) {
            if (convertor.getType().equals(input)) {
                rub = convertor.ConvertToRub(value);
            }
        }

        double result = -1; // Результат конвертации

        // Перебираем конверторы для нахождения выходной валюты и конвертации из рублей
        for (Convertor convertor : convertors) {
            if (convertor.getType().equals(output)) {
                result = convertor.ConvertToCurrency(rub);
            }
        }

        return result; // Возвращаем результат конвертации
    }
}
