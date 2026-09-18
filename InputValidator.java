public class InputValidator {
    public static int validateTaskInput(String userInput) {
        try {
            int taskCount = Integer.parseInt(userInput.trim());
            if (taskCount <= 0) {
                throw new IllegalArgumentException("Task count must be greater than zero.");
            }
            return taskCount;
        } catch (Exception e) {
            System.out.println("Input Error: Invalid number detected. Defaulting to a safe workload of 1000 tasks.");
            return 1000;
        }
    }
}
