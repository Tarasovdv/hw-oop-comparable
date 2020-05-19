package hero;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person implements Comparable<Person>, Cloneable {

    private String name;
    private String surname;
    private Integer age;


    @Override
    public int compareTo(Person person) {
        int res = this.surname.compareTo(person.surname);
        if (res == 0) {
            res = this.name.compareTo(person.name);
            if (res == 0) {
                res = this.age.compareTo(person.age);
            }
        }
        return res;
    }

    @Override
    public String toString() {
        return "Surname: " + surname +
                ", Name: " + name +
                ", Age: " + age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
