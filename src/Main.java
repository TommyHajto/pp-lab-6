import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Adam Pacha", 30000, 1, "2022-01-01", "Worker");
        Worker worker2 = new Worker("Jacek Placek", 32000, 1, "2022-02-01", "Worker");
        Worker worker3 = new Worker("Maciek Konik", 31000, 2, "2022-03-01", "Worker");
        Manager manager = new Manager("Agnieszka Tuniemieszka", 50000, 3, "2022-04-01", "Manager");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " has code: " + employee.hashCode());
        }

        System.out.println(worker1.getName() + " equals " + worker2.getName() + ": " + worker1.equals(worker2));
        System.out.println(worker1.getName() + " equals " + worker3.getName() + ": " + worker1.equals(worker3));
        System.out.println(worker1.getName() + " equals " + manager.getName() + ": " + worker1.equals(manager));
    }
}
