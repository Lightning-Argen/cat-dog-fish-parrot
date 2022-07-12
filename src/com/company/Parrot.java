package com.company;

public class Parrot {


    private String Name;
    private int Age;
    private String Paroda;
    private String Color;

    void setName(String ParrotName) {
        this.Name = ParrotName;
    }

    void setAge(int ParrotAge) {
        this.Age = ParrotAge;
    }

    void setParoda(String ParrotParoda) {
        this.Paroda = ParrotParoda;
    }

    void setColor(String ParrotColor) {
        this.Color = ParrotColor;
    }

    String getName() {
        return Name;
    }

    int getAge() {
        return Age;
    }

    String getParoda() {
        return Paroda;
    }

    String getColor() {
        return Color;
    }

    void CanPArrot() {
        System.out.println("Имеет моногамное зрение, может использовать каждый глаз независимо от другого, при этом скорость просмотра составляет около 150 кадров в секунду, в то время как у человека всего-навсего около 24.");
    }


}
