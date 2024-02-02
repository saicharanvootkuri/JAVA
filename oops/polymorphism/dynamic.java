class X {
    void display() {
        System.out.println("Inside X's display method");
    }
}

class Y extends X {
    void display() {
        System.out.println("Inside Y's display method");
    }
}

class Z extends X {
    void display() {
        System.out.println("Inside Z's display method");
    }
}
public class DynamicDispatchExample {
    public static void main(String args[]) {
        X x = new X();
        Y y = new Y();
        Z z = new Z();

        X ref;
        ref = x;
        ref.display();

        ref = y;
        ref.display();

        ref = z;
        ref.display();
    }
}
