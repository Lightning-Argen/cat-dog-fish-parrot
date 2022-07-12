package com.company;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("Анабас");
        fish.setHabitat(" в озерах, илистых прудах, канавах, на рисовых полях, а также в солоноватых водоемах.");
        fish.setHowlonglive("Анабас живет в неволе не более 5 лет");
        System.out.println(("Название - ") + fish.getName());
        System.out.println(("Место обитания - ") + fish.getHabitat());
        System.out.println(fish.getHowlonglive());
        fish.FishCan();
        System.out.println("-----------------");

        Cat cat = new Cat();
        cat.setName("Murka");
        cat.setParoda("Магическая");
        cat.setAge(2);
        cat.setColor("Рыжий");
        System.out.println("Имя- " + cat.getName());
        System.out.println("Paroda- " + cat.getParoda());
        System.out.println("Лет- " + cat.getAge());
        System.out.println("Цвет- " + cat.getColor());
        cat.canCat();
        System.out.println("------------------");

        Dog dog = new Dog();
        dog.setName("Рекс");
        dog.setParoda("Лабрадор ретривер");
        dog.setAge(10);
        dog.setColor("желтый (считается от кремово-белого до лисьего)");
        dog.setGrowth("56-57 сантиметров");
        System.out.println("Имя - " + dog.getName());
        System.out.println("Парода - " + dog.getParoda());
        System.out.println("Возраст - " + dog.getAge());
        System.out.println("Цвет - " + dog.getColor());
        System.out.println("Рост собаки - " + dog.getGrowth());
        dog.DogCan();
        System.out.println("------------------");


        Parrot parrot = new Parrot();
        parrot.setName("Гриша");
        parrot.setAge(20);
        parrot.setColor("Многоцветье");
        parrot.setParoda("Ара");

        System.out.println("Имя - " + parrot.getName());
        System.out.println("Взраст - " + parrot.getAge());
        System.out.println("Цвет - " + parrot.getColor());
        System.out.println("Парода - " + parrot.getParoda());
        parrot.CanPArrot();
        System.out.println("----------------");


        System.out.println("Автор - Арен Молдошев , он старался 😊");
    }
}