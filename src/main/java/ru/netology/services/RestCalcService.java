package ru.netology.services;

public class RestCalcService {
    public int calculate(int income, int expenses, int treshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= treshold) { // Буду отдыхать
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;//Придется работать;
            }


        }
        return count;
    }
}
