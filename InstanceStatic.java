class InstanceStatic {
    static int x = 5;
    int y = 10;

    void display() {
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        InstanceStatic obj = new InstanceStatic();
        obj.display();
    }
}