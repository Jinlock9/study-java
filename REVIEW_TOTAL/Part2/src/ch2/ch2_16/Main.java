package ch2.ch2_16;

public class Main {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("Bruce Lee");
        System.out.println(employeeLee.getEmployeeId());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("Steve Kim");
        System.out.println(employeeKim.getEmployeeId());

        System.out.println(Employee.serialNum);
    }
}
