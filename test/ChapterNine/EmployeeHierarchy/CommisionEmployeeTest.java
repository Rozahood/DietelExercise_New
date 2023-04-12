package ChapterNine.EmployeeHierarchy;

import static org.junit.jupiter.api.Assertions.*;

class CommisionEmployeeTest {
    public static void main(String[] args) {
        CommisionEmployee employee = new CommisionEmployee("Royalpriesthood","Oviomaigho",
                                                    "123-33-543",100000,.08);
        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name entails",employee.getFirstName());
        System.out.printf("%s %s%n", "Last name entails",employee.getLastName());
        System.out.printf("%s %s%n", "Social security number entails",employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales entails",employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate entails",employee.getCommissionRate());
        employee.setGrossSales(50000);
        employee.setCommissionRate(.1);
        System.out.printf("%n%s:%n%n %s%n","Updated employee information obtained by toString",employee);
    }
}