import hero.Person;
import hero.PersonComparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person candidat0 = new Person("Ivan","Ivanov",18);
        Person candidat1 = new Person("Oleg","Ivanov",20);
        Person candidat2 = new Person("Ivan","Smirnov",45);
        Person candidat3 = new Person("Ivan","Smirnov",17);
        Person candidat4 = new Person("Ivan","Ivanov",25);
        Person candidat5 = new Person("Semen","Kinzhalov",30);
        Person candidat6 = new Person("Dmitriy","Kinzhalov",30);

        Person[]candidats = new Person[]{candidat0,candidat1,candidat2,candidat3,candidat4,candidat5,candidat6};

        System.out.println("\nBefore sorting: ");
        for (Person candidat:candidats) {
            System.out.println(candidat);
        }

        Arrays.sort(candidats);
        System.out.println("\nAfter sorting: ");
        for (Person candidat:candidats) {
            System.out.println(candidat);
        }

        Person clone = (Person) candidat0.clone();
        System.out.println("clone = " + clone);


        Comparator ageComparator = new PersonComparator();
        Arrays.sort(candidats,ageComparator);
        System.out.println("\nComparator sorting: ");
        for (Person candidat:candidats) {
            System.out.println(candidat);
        }


    }
}
