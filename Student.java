class Student {
    String name;
    int roll;
    char div;

    Student(String n, int r, char d) {
        name = n;
        roll = r;
        div = d;
    }

    void display() {
        System.out.println(name + " " + roll + " " + div);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Amit", 1, 'A');
        Student s2 = new Student("Neha", 2, 'B');
        Student s3 = new Student("Rahul", 3, 'A');

        s1.display();
        s2.display();
        s3.display();
    }
}