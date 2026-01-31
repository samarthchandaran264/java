public class OuterClass {

    int outerData = 50;

    // Inner (non-static) class
    class InnerClass {
        void display() {
            System.out.println("Outer class data: " + outerData);
        }
    }

    public static void main(String[] args) {
        // Create object of outer class
        OuterClass obj = new OuterClass();

        // Create object of inner class using outer class object
        OuterClass.InnerClass in = obj.new InnerClass();

        // Call inner class method
        in.display();
    }
}
