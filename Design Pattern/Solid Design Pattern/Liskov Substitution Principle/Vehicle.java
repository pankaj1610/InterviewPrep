public class Vehicle {
    public void startEngine() {
        System.out.println("Starting engine...");
    }
}

public class Car extends Vehicle {
    public void openWindow() {
        System.out.println("Opening window...");
    }
    
    public void closeWindow() {
        System.out.println("Closing window...");
    }
    
    public void turnOnHeadlights() {
        System.out.println("Turning on headlights...");
    }
}

public class Test{
    public static void main(String args[]){
        Car car = new Car();
        car.startEngine(); // Output: "Starting engine..."
        car.openWindow();  // Output: "Opening window..."
        car.closeWindow(); // Output: "Closing window..."
        car.turnOnHeadlights(); // Output: "Turning on headlights..."
    }
}