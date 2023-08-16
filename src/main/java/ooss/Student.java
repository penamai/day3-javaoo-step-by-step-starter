package ooss;

public class Student extends Person{

    private Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public void join(Klass newClass){
        this.klass = newClass;
    }

    public boolean isIn(Klass className){
        return className.equals(this.klass);
    }

    @Override
    public String introduce(){
        return super.introduce() + " I am a student."
                + (this.klass == null ? "" : " I am in class " + this.klass.number + ".");
    }
}
