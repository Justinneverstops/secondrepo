
import java.util.Scanner; // Import the Scanner class for user input
public class AreaPer {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter Radius of the Circle: " );
        int r1=scanner.nextInt();
        double radius = r1; // Radius of a circle
double area = Math.PI * radius * radius;
double perimeter = 2 * Math.PI * radius;
System.out.println("Area: " + area);
System.out.println("Perimeter: " + perimeter);
scanner.close();
    }
    
}
