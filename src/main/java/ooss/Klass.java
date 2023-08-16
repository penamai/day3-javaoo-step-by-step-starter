package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {
    public final int number;
    private Student leader;
    private final List<Person> attachedPeople;

    public Klass(int number) {
        this.number = number;
        this.attachedPeople = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return number == klass.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public void assignLeader(Student newLeader) {
        if (newLeader.isIn(this)){
            this.leader = newLeader;
            this.attachedPeople.forEach(person ->
                    System.out.println("I am " + person.name
                            + (person instanceof Student ? ", student of Class " : ", teacher of Class ")
                            + this.number + ". I know " + this.leader.name + " become Leader."));
        }else
            System.out.println("It is not one of us.");
    }

    public boolean isLeader(Student student) {
        return this.leader.equals(student);
    }

    public void attach(Person person) {
        this.attachedPeople.add(person);
    }
}
