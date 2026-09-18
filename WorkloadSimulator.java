public class WorkloadSimulator {
    private Processor processor;

    public WorkloadSimulator(Processor processor) {
        this.processor = processor;
    }

    public double runWorkload(int taskCount) {
        System.out.println("[" + processor.getName() + "] Initializing " + taskCount + " tasks...");
        long startTime = System.currentTimeMillis();
        
        double power = processor.calculateComputePower();
        // Calculate simulated execution delay based on processor compute power
        long simulatedDelay = (long) ((taskCount / 1000.0) / power * 1000); 
        
        try {
            Thread.sleep(simulatedDelay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Simulation interrupted for " + processor.getName());
        }
        
        long endTime = System.currentTimeMillis();
        return (endTime - startTime) / 1000.0; // Convert to seconds
    }
}
