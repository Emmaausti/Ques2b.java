package java.mobilephones;
abstract class MobilePhone {
    String model;
    double price;

    // Abstract method for displaying details of the mobile phone
    public abstract void display();
}

// Subclasses of MobilePhone
class A10 extends MobilePhone {
    public A10() {
        model = "A10";
        price = 300.00;
    }

    @Override
    public void display() {
        System.out.println("Mobile Model: " + model + ", Price: $" + price);
    }
}

class X25 extends MobilePhone {
    public X25() {
        model = "X25";
        price = 400.00;
    }

    @Override
    public void display() {
        System.out.println("Mobile Model: " + model + ", Price: $" + price);
    }
}

