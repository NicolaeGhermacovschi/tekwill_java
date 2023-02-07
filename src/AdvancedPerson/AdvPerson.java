package AdvancedPerson;

import Person.*;

public class AdvPerson extends Person {
    private String streetHome;
    private int streetHomeNumber;
    private int numberFlat;
    private char characterFlat;// 70A, 80B, 80C

    public AdvPerson() {
    }

    public AdvPerson(String streetHome, int streetHomeNumber, int numberFlat, char characterFlat) {
        this.streetHome = streetHome;
        this.streetHomeNumber = streetHomeNumber;
        this.numberFlat = numberFlat;
        this.characterFlat = characterFlat;
    }


    public String getStreetHome() {
        return streetHome;
    }

    public void setStreetHome(String streetHome) {
        this.streetHome = streetHome;
    }

    public int getStreetHomeNumber() {
        return streetHomeNumber;
    }

    public void setStreetHomeNumber(int streetHomeNumber) {
        this.streetHomeNumber = streetHomeNumber;
    }

    public int getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(int numberFlat) {
        this.numberFlat = numberFlat;
    }

    public char getCharacterFlat() {
        return characterFlat;
    }

    public void setCharacterFlat(char characterFlat) {
        this.characterFlat = characterFlat;
    }

    @Override
    public String toString() {
        return "AdvPerson info{firstName= '" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", IDNP=" + getIDNP() +
                ", email='" + getEmail() + '\'' +
                ", dateBH=" + getDateBH() +
                ", gender=" + getGender() +
                " streetHome='" + streetHome + '\'' +
                ", streetHomeNumber=" + streetHomeNumber +
                ", numberFlat=" + numberFlat +
                ", characterFlat=" + characterFlat +
                '}';
    }
}
