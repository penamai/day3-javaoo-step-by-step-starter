package ooss;

public class Student extends Person {

    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public void join(Klass newClass) {
        this.klass = newClass;
    }

    public boolean isIn(Klass className) {
        return className.equals(this.klass);
    }

    @Override
    public String introduce() {
        StringBuilder introduction = new StringBuilder();
        introduction.append(super.introduce()).append(" I am a student.");
        if (this.klass != null) {
            introduction.append(this.klass.isLeader(this) ?
                            " I am the leader of class " :
                            " I am in class ")
                    .append(this.klass.number).append(".");
        }
        return introduction.toString();
    }
}
