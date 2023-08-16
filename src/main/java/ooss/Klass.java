package ooss;

import java.util.Objects;

public class Klass {
    public final int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
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

    public void assignLeader(Student king) {
        if (king.isIn(this))
            this.leader = king;
        else
            System.out.println("It is not one of us.");
    }

    public boolean isLeader(Student tom) {
        return this.leader.equals(tom);
    }
}
