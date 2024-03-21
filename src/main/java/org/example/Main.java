package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Главный класс приложения
public class Main {
    public static void main(String[] args) {
        // Создаем объект Exchanger для обмена валюты
        Exchanger change = new Exchanger();

        // Пример использования: конвертация 100 рублей в рубли
        double money = change.Convert(100, "RUB", "RUB");

        // Проверяем, успешно ли прошла конвертация
        if (money > 0) {
            System.out.println(money); // Выводим результат на экран
        } else {
            System.out.println("Ошибка ввода или отсутствие валют в базе"); // Выводим сообщение об ошибке
        }
    }
}