package ooss;

import java.util.Objects;

public class Person {
    public int id;
    public final String name;
    private final int age;

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    //TODO Just want to share an idea, you can use String.format() for cleaner code when returning a dynamic string
    public String introduce(){
        return "My name is " + name + ". I am " + age + " years old.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
