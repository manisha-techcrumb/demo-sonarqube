public class BadCode {
    public static void main(String[] args) {
        String unusedVar = "This is unused"; // Unused variable (issue)
        System.out.println("Hello");
    }
}
public class BadCode {
    public static void main(String[] args) {
        String unusedVar = "This is unused"; // Unused variable

        int x = 10 / 0; // Division by zero (bug)

        if (true) {
            if (true) {
                if (true) {
                    if (true) {
                        if (true) {
                            System.out.println("Too deep");
                        }
                    }
                }
            }
        }

        try {
            int a = 5 / 0;
        } catch (Exception e) {
            // Empty catch block
        }

        String password = "admin123"; // Hardcoded secret
    }
}

