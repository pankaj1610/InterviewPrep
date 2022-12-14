public abstract class Shape {
  // Abstract method for calculating the area of the shape
  public abstract double calculateArea();
}

public class Rectangle extends Shape {
  private double width;
  private double height;
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }
  @Override
  public double calculateArea() {
    return width * height;
  }
}

public class Circle extends Shape {
  private double radius;
  public Circle(double radius) {
    this.radius = radius;
  }
  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}
