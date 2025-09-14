class Person {
    private String name;
    private int age;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }
}

class Student3 extends Person {
    public void display() {
        System.out.println("Name: " + getName() + ", Age: " + getAge());
    }
}

public class Q7 {
    public static void main(String[] args) {
        Student3 s = new Student3();
        s.setName("John");
        s.setAge(20);
        s.display();
    }
}
