package com.company;

abstract class Edu {
    String Name;
    String Place;
    String LevelOfAcc;
    String Teachers;
    // Конструктор абстрактного класу
    Edu (String Name, String Place, String LevelOfAcc, String Teachers) {
        this.Name=Name;
        this.Place=Place;
        this.LevelOfAcc=LevelOfAcc;
        this.Teachers=Teachers;
    }
    abstract void prnt();
}
