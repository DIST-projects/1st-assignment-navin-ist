import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
    public static void main(String[] args) {
        try {
            // Replace with CLOUD IP
            Registry registry = LocateRegistry.getRegistry("20.198.251.98", 1099);
            CalculatorInterface stub = (CalculatorInterface) registry.lookup("CalculatorService");

            System.out.println("Addition: " + stub.add(10,5));
            System.out.println("Subtraction: " + stub.subtract(10,5));
            System.out.println("Multiplication: " + stub.multiply(10,5));
            System.out.println("Division: " + stub.divide(10,5));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
