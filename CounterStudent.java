class CounterStudent {
    static int rollBase = 100;
    String name;
    float roll;

    CounterStudent(String n) {
        name = n;
        roll = rollBase + 0.1f;
        rollBase++;
    }

    void display() {
        System.out.println(name + " " + roll);
    }

    public static void main(String[] args) {
        CounterStudent s1 = new CounterStudent("Amit");
        CounterStudent s2 = new CounterStudent("Neha");

        s1.display();
        s2.display();
    }
}