package ch2.ch2_18;

public class Company {
    // Singleton Pattern ===============================================================================================
    private static Company instance = new Company();
    private Company() {}

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
    // =================================================================================================================
}
