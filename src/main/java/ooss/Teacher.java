package ooss;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
    private final List<Klass> classes;
    public Teacher(int id, String name, int age) {
        super(id, name, age);
        classes = new ArrayList<>();
    }

    @Override
    public String introduce(){
        return super.introduce() + " I am a teacher.";
    }

    public void assignTo(Klass klass) {
        this.classes.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return this.classes.contains(klass);
    }
}
