package com.company;

public class Fish {


    private String name;
    private String habitat;
    private String howlonglive;


    void setName(String fishName) {
        this.name = fishName;
    }

    void setHabitat(String fishOcean) {

        this.habitat = fishOcean;
    }

    void setHowlonglive(String fishHowlonglive) {
        this.howlonglive = fishHowlonglive;

    }

    String getName() {
        return name;
    }

    String getHabitat() {
        return habitat;
    }

    String getHowlonglive() {
        return howlonglive;
    }

    void FishCan() {
        System.out.println("Передвигаться по суше со скоростью до 200 м в час и находиться вне воды до 48 часов кряду.");
        System.out.println("Так же он славится высокими прыжками из воды.");
    }
}
