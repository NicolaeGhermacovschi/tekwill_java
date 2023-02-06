package Person;

import java.time.LocalDate;

public class Person{
    private String firstName;
    private String lastName;
    private int IDNP;
    private String email;
    private LocalDate dateBH;
    private char gender;

    public Person() {
    }

    public Person(String firstName, String lastName, int IDNP, String email, LocalDate dateBH, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNP = IDNP;
        this.email = email;
        this.dateBH = dateBH;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIDNP() {
        return IDNP;
    }

    public void setIDNP(int IDNP) {
        this.IDNP = IDNP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public LocalDate getDateBH() {
        return dateBH;
    }

    public void setDateBH(LocalDate dateBH) {

        if (dateBH.isAfter(LocalDate.now()) ){
            System.out.println("it's impossible to set data");
        } else {
            this.dateBH = dateBH;
        }


    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", IDNP=" + IDNP +
                ", email='" + email + '\'' +
                ", dateBH=" + dateBH +
                ", gender=" + gender +
                '}';
    }
    public String personToString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", IDNP=" + IDNP +
                ", email='" + email + '\'' +
                ", dateBH=" + dateBH +
                ", gender=" + gender +
                '}';
    }
    public void occupation() {

        if ( ( 2023 - getDateBH().getYear() > 18 ) ) {
            System.out.println(getFirstName() + "'s occupation is work" );
        } else {
            System.out.println(getFirstName() + "'s occupation is study" );
        }
    }
}
