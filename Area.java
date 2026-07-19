import java.lang.*;
import java.util.*;
import java.io.*;

class Area {
    public static void main(String[] args) {
        int x;
        double l, b, r, area, circumference;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter choice (1: Circle Area, 2: Rectangle Area, 3: Square Area, 4: Circle Circumference):");
        x = s.nextInt();
        
        System.out.println("Enter length, breadth, and radius:");
        l = s.nextDouble();
        b = s.nextDouble();
        r = s.nextDouble();

        switch (x) {
            case 1:
                area = 3.141 * r * r;
                System.out.println("Area of circle: " + area);
                break;
            case 2:
                area = l * b;
                System.out.println("Area of rectangle: " + area);
                break;
            case 3:
                area = l * l;
                System.out.println("Area of square: " + area);
                break;
            case 4:
                circumference = 2 * 3.141 * r;
                System.out.println("Circumference of circle: " + circumference);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
