package Lerntheke.Gruen;

import Lektion14.Person.Person;

import java.util.Optional;

public class Station4 {
    public static void main(String[] args) {
        Person p = new Person("Hans","Müller","Gehweg","3",12345,"Berlin");
        Optional<Person> o = Optional.of(p);
        Optional<Person> leer = Optional.empty();
    }
}
