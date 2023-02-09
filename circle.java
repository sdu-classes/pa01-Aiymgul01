import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      double radious = scan.nextDouble();
      Circle circle = new Circle(radious);
        System.out.println(circle);
        System.out.println("Circle's area :" + circle.getArea()+ " Cercle's size" + circle.getCercumference());
    }
}
class Circle {
    private double radious;

    Circle(){
    }
    Circle(double radious){
        this.radious = radious;
    }
    public double getRadious(){
        return radious;
    }
    public  void setRadious(double new_radious){
        this.radious = new_radious;
    }
    public double getArea(){
        return 2 * Math.PI * Math.pow(radious, 2);
    }
 public double getCercumference(){
        return 2 * Math.PI * radious;
 }
 public String toString(){
        return "Circle [" + radious + "]";
 }
}