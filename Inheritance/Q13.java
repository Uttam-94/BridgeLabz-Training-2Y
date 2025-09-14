class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student extends Person {
    private int grade;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}

public class Q13 {
    public static void main(String[] args) {
        Student s = new Student("Alice", 10);
        System.out.println("Name: " + s.getName() + ", Grade: " + s.getGrade());
    }
}
