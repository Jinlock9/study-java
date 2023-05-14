package ch2.ch2_17;

public class Main {
    public static void main(String[] args) {
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("Bruce Lee");
        System.out.println(employeeLee.getEmployeeId());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("Steve Kim");
        System.out.println(employeeKim.getEmployeeId());

        System.out.println(Employee.getSerialNum());
        Employee.setSerialNum(2000);
        System.out.println(Employee.getSerialNum());
        System.out.println(employeeLee.getSerialNum());
    }
}
