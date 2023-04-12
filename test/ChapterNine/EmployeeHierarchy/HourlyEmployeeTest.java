package ChapterNine.EmployeeHierarchy;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee("Royalpriesthood","Ewomaoghene",
                                                "197-34-87",8,10,000);
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name entails",employee.getFirstName());
        System.out.printf("%s %s%n", "Last name entails",employee.getLastName());
        System.out.printf("%s %s%n", "Social security number entails",employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Hours are",employee.getHours());
        System.out.printf("%s %.2f%n", "Wages is",employee.getWages());
        System.out.printf("%s %.2f%n", "Earnings entails",employee.earning());
            employee.setHours(9);
            employee.setWages(500);
        System.out.printf("%n%s:%n%n %s%n","Updated employee information obtained by toString",employee);
    }
}