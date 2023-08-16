package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private final List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        classes = new ArrayList<>();
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a teacher."
                + (this.classes.size() == 0 ? "" : " I teach Class " +
                (this.classes.size() == 1 ? this.classes.get(0).number :
                        this.classes.stream()
                                .map(klass -> String.valueOf(klass.number))
                                .collect(Collectors.joining(", ")) + "."));
    }

    public void assignTo(Klass klass) {
        this.classes.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return this.classes.contains(klass);
    }
}
