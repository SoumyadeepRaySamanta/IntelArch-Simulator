public class Processor {
    private String name;
    private int cores;
    private int threads;
    private double baseClockGhz;
    private int architecture; // 32 or 64

    public Processor(String name, int cores, int threads, double baseClockGhz, int architecture) {
        this.name = name;
        this.cores = cores;
        this.threads = threads;
        this.baseClockGhz = baseClockGhz;
        this.architecture = architecture;
    }

    public String getName() { 
        return name; 
    }

    // 64-bit architecture handles larger data chunks per cycle
    public double calculateComputePower() {
        double bitMultiplier = (architecture == 32) ? 1.0 : 1.5;
        return cores * threads * baseClockGhz * bitMultiplier;
    }
}
