package it.unipd.mtss.model;
public class User {
    private String FC;
    private String name;
    private String surname;
    private int age;

    public User() {
        FC="AAAA";
        name="John";
        surname="Maven";
        age=16;
    }

    public User(String fc, String n, String s, int a) {
        FC=fc;
        name=n;
        surname=s;
        age=a;
    }

    public String getFC() {
        return FC;
    }

    public void setFC(String fC) {
        FC = fC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}