package com.company;

public class College extends Edu {

    private String kind = "Коледж ";

    College (String Name, String Place, String LevelOfAcc, String Teachers) {
        super(Name, Place, LevelOfAcc, Teachers);
    }
    @Override
    void prnt() {
        System.out.println(kind + Name + Place + LevelOfAcc + Teachers);
    }
}
