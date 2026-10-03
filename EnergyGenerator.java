
import java.util.Scanner;
public class EnergyGenerator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the energy generated (in kWh): ");
     double energyGenerated = sc.nextDouble();
     if 
        (energyGenerated >= 10) {
         System.out.println("good energy generation");
        } else if (energyGenerated < 10) {
            System.out.println("Low energy generation");
        }
    }
}
