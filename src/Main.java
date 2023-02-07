import java.time.LocalDate;

import AdvancedPerson.AdvPerson;
import Person.*;
import Practica.PracticaDoi;
import Practica.PracticaTrei;

//TODO:Adaugati modificatori de acces la variabilile si metodele claselor
//TODO:pentru fiecare clasa creati un fisier nou
//TODO:folositi variabile de diferite tipuri in clasele voastre, inclusiv variabile de tipul clase create de java cum ar fi String
//TODO:Folositi variabile locale si variabile externe
//TODO:Mosteniti clasa parinte prin cuvintul cheie extends

public class Main {
    public static void main(String... args) {
        add();

        practica();

    }

    private static void practica() {
        PracticaDoi practica = new PracticaDoi();
        System.out.println("\n\n\n\n\n");
        practica.ex1();
        practica.ex2Variables();
        practica.ex3TaxCalculator();

        PracticaTrei practicaTrei = new PracticaTrei();
        practicaTrei.ex1();


    }


    private static void add() {
        Person p =  new Person();

        p.setFirstName("Nicolae");
        p.setLastName("Nic");
        p.setIDNP(218131521);
        p.setGender('M');
        p.setEmail(p.getFirstName().toLowerCase() + "_" + p.getLastName().toLowerCase() + "@gmail.com" );
        p.setDateBH(LocalDate.of(2000, 1, 8));

        AdvPerson advP = new AdvPerson();
        advP.setStreetHome("Paris");
        advP.setStreetHomeNumber(10);
        advP.setNumberFlat(15);
        advP.setCharacterFlat('A');

        System.out.println(advP.toString());

        AdvPerson advP1 = new AdvPerson();
        advP1.setFirstName("Nicolae");
        advP1.setLastName("AN");
        advP1.setIDNP(314521521);
        advP1.setGender('M');
        advP1.setEmail(p.getFirstName().toLowerCase() + "_" + p.getLastName().toLowerCase() + "@gmail.com" );
        advP1.setDateBH(LocalDate.of(1998, 11, 25));

        advP1.setStreetHome("Ion Creanga");
        advP1.setStreetHomeNumber(27);
        advP1.setNumberFlat(225);
        advP1.setCharacterFlat('C');

        System.out.println(advP1.toString());

        Person p1 =  new Person();
        p1.setFirstName("Anton");
        p1.setLastName("An");
        p1.setIDNP(223481314);
        p1.setGender('M');
        p1.setEmail(p1.getFirstName().toLowerCase() + "_" + p1.getLastName().toLowerCase() + "@gmail.com" );
        p1.setDateBH(LocalDate.of(2005, 8, 25));

        System.out.println(p1.toString());


        Person p2 =  new Person();
        p2.setFirstName("Amelia");
        p2.setLastName("Dh");
        p2.setIDNP(223481314);
        p2.setGender('F');
        p2.setEmail(p2.getFirstName().toLowerCase() + "_" + p2.getLastName().toLowerCase() + "@gmail.com" );
        p2.setDateBH(LocalDate.of(2012, 10, 14));

        System.out.println(p2.toString());

        System.out.println("\n================ occupation ===================\n");
        p.occupation();
        p1.occupation();
        p2.occupation();
    }
}


