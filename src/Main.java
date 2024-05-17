import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Alice", 3000.0, 1);
        Worker worker2 = new Worker("Bob", 3200.0, 2);
        Worker worker3 = new Worker("Charlie", 2800.0, 3);
        Worker worker4 = new Worker("David", 3500.0, 4);
        Manager manager = new Manager("Eve", 5000.0, 5);

        Worker[] workers = {worker1, worker2, worker3, worker4};

        for (Worker worker : workers) {
            System.out.println("Salary: " + worker.getSalary());
            worker.work();
        }

        System.out.println("Salary: " + manager.getSalary());
        manager.work();
    }
}
