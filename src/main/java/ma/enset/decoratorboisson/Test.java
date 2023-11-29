package ma.enset.decoratorboisson;

import ma.enset.composants.Boisson;
import ma.enset.composants.Sumatra;

public class Test {
    public static void main(String[] args) {

        Boisson boisson;
        boisson = new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        boisson = new Chocolat(new Caramel(new Chocolat(boisson)));
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
