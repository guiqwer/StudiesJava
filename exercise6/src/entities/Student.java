package entities;

public class Student {
    public String name;
    public double n1, n2, n3;

    public double totalGrade() {
        return n1 + n2 + n3;
    }

    public double missingPoints() {
        if (totalGrade() < 60) {
            return 60 - totalGrade();
        } else {
            return 0.0;
        }
    }
}


