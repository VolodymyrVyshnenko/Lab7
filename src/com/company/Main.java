package com.company;

public class Main {

    public static void main(String[] args) {
        Edu coll = new College("КТГГ ", "Київ ", "4 ", "30");
        coll.prnt();
        Edu univer = new University("КНТЕУ ", "Київ ", "4 ", "80");
        univer.prnt();
    }
}


/*
Варіант 4
Абстрактний клас Навчальний заклад з полями
(назва, місце розташування, рівень акредитації,
кількість викладачів). На базі абстрактного
класу створити підкласи: Коледж і Університе
 */