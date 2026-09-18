import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to IntelArch Simulator (Java Edition)");
        
        // 1. Instantiation
        Processor cpu1 = new Processor("Intel Dual Core (32-bit)", 2, 2, 2.0, 32);
        Processor cpu2 = new Processor("Intel Core i7 (64-bit)", 8, 16, 3.5, 64);
        
        // 2. User Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of computational tasks to simulate (e.g., 5000): ");
        String rawInput = scanner.nextLine();
        
        int taskCount = InputValidator.validateTaskInput(rawInput);
        
        // 3. Execution
        WorkloadSimulator sim1 = new WorkloadSimulator(cpu1);
        WorkloadSimulator sim2 = new WorkloadSimulator(cpu2);
        
        double time1 = sim1.runWorkload(taskCount);
        double time2 = sim2.runWorkload(taskCount);
        
        // 4. Analytics
        Map<String, Double> results = new LinkedHashMap<>();
        results.put(cpu1.getName(), time1);
        results.put(cpu2.getName(), time2);
        
        PerformanceAnalyzer.generateReport(results);
        scanner.close();
    }
}
