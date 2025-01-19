package java.mobilephones;

    // AbstractFactory class
abstract class AbstractFactory {
    public abstract MobilePhone createMobilePhone(String model);
    public abstract TV createTV(String model);
}

// Concrete Factory for Mobile Phones
class MobileFactory extends AbstractFactory {
    @Override
    public MobilePhone createMobilePhone(String model) {
        return switch (model) {
            case "A10" -> new A10();
            case "X25" -> new X25();
            case "TPlus" -> new TPlus() {
            @Override
            public void display() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
            default -> null;
        };
    }

    @Override
    public TV createTV(String model) {
        return null; // MobileFactory does not create TV objects
    }
}

// Concrete Factory for TVs
class TVFactory extends AbstractFactory {
    @Override
    public MobilePhone createMobilePhone(String model) {
        return null; // TVFactory does not create MobilePhone objects
    }

    @Override
    public TV createTV(String model) {
        return switch (model) {
            case "Alpha 40" -> new Alpha40();
            case "Gamma 50" -> new Gamma50();
            case "Theta 65" -> new Theta65();
            default -> null;
        };
    }
}

