package ooss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private final List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        classes = new ArrayList<>();
    }

    @Override
    public String introduce() {
        StringBuilder introduction = new StringBuilder();
        introduction.append(super.introduce()).append(" I am a teacher.");
        if (this.classes.size() > 0) {
            introduction.append(" I teach Class ").append(this.classes.size() == 1 ?
                    this.classes.get(0).number :
                    this.classes.stream()
                            .map(klass -> String.valueOf(klass.number))
                            .collect(Collectors.joining(", "))).append(".");
        }
        return introduction.toString();
    }

    public void assignTo(Klass klass) {
        this.classes.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return this.classes.contains(klass);
    }

    public boolean isTeaching(Student student) {
        return this.classes.stream().anyMatch(student::isIn);
    }
}
