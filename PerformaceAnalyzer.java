import java.util.Map;

public class PerformanceAnalyzer {
    public static void generateReport(Map<String, Double> results) {
        System.out.println("\n--- Performance Analytics Report ---");
        for (Map.Entry<String, Double> entry : results.entrySet()) {
            System.out.printf("Processor: %s | Execution Time: %.4f seconds\n", entry.getKey(), entry.getValue());
        }
    }
}
