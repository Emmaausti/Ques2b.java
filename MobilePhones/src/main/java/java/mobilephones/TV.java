package java.mobilephones;

 // Abstract class TV
abstract class TV {
    String model;
    int size;

    // Abstract method for displaying details of the TV
    public abstract void display();
}

// Subclasses of TV
class Alpha40 extends TV {
    public Alpha40() {
        model = "Alpha 40";
        size = 40;
    }

    @Override
    public void display() {
        System.out.println("TV Model: " + model + ", Size: " + size + " inches");
    }
}

class Gamma50 extends TV {
    public Gamma50() {
        model = "Gamma 50";
        size = 50;
    }

    @Override
    public void display() {
        System.out.println("TV Model: " + model + ", Size: " + size + " inches");
    }
}

class Theta65 extends TV {
    public Theta65() {
        model = "Theta 65";
        size = 65;
    }

    @Override
    public void display() {
        System.out.println("TV Model: " + model + ", Size: " + size + " inches");
    }
   
}
