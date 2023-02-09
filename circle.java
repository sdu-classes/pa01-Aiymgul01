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