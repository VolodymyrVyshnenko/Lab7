package com.company;

public class University extends Edu{

    private String kind = "Університет ";

    University (String Name, String Place, String LevelOfAcc, String Teachers) {
        super(Name, Place, LevelOfAcc, Teachers);
    }
    @Override
    void prnt() {
        System.out.println(kind + Name + Place + LevelOfAcc + Teachers);
    }
}
