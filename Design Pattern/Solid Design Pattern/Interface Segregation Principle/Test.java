public interface IVehicle {
    void startEngine();
    void stopEngine();
}
public interface ICar extends IVehicle {
    void honkHorn();
}
public interface IMotorcycle extends IVehicle {
    void revEngine();
}
public class Car implements ICar {
    public void startEngine() {
    }
    public void stopEngine() {
    }
    public void honkHorn() {
    }
}
public class Motorcycle implements IMotorcycle {
    public void startEngine() {
    }
    public void stopEngine() {
    }
    public void revEngine() {
    }
}
