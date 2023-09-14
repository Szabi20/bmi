import java.util.Scanner;
public class Bmi{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány kilo: ");
        double weight = sc.nextDouble();
        System.out.print(" Hány méter: ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.print(" A testömeg index (BMI) " + bmi + " kg/m2");

    }
}
