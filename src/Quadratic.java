import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first root:");
        double a = sc.nextDouble();
        System.out.print("Enter the second root:");
        double b = sc.nextDouble();
        System.out.print("Enter the third root:");
        double c = sc.nextDouble();
        double d = b*b-4*a*c;
        if (d>0.0){
            double r1= (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println(r1+ "and" + r2);
        }
        else if (d==0.0){
            double r1 = -b / (2.0 * a);
            System.out.println(r1);
        }
        else{
            System.out.println("root are not real");

        }
    }
}
