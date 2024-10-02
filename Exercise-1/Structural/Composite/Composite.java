//Balam Ruchith Balaji
 

import java.util.ArrayList;
import java.util.List;

// Component class representing an Employee in an organization
class Worker {
    private String fullName;
    private String role;
    private List<Worker> teamMembers;

    public Worker(String fullName, String role) {
        this.fullName = fullName;
        this.role = role;
        teamMembers = new ArrayList<>();
    }

    // Add a subordinate
    public void add(Worker worker) {
        teamMembers.add(worker);
    }

    // Remove a subordinate
    public void remove(Worker worker) {
        teamMembers.remove(worker);
    }

    // Get list of subordinates
    public List<Worker> getTeamMembers() {
        return teamMembers;
    }

    @Override
    public String toString() {
        return "Worker: [Name=" + fullName + ", Role=" + role + "]";
    }
}

// Main class to demonstrate Composite Pattern
public class OrganizationStructure {
    public static void main(String[] args) {
        Worker ceo = new Worker("Alice", "CEO");

        Worker salesHead = new Worker("Robert", "Head of Sales");
        Worker marketingHead = new Worker("Sophia", "Head of Marketing");

        Worker marketingStaff1 = new Worker("Laura", "Marketing Specialist");
        Worker marketingStaff2 = new Worker("Jim", "Marketing Specialist");

        Worker salesExecutive1 = new Worker("Richard", "Sales Executive");
        Worker salesExecutive2 = new Worker("Tom", "Sales Executive");

        // Forming the organization structure
        ceo.add(salesHead);
        ceo.add(marketingHead);

        salesHead.add(salesExecutive1);
        salesHead.add(salesExecutive2);

        marketingHead.add(marketingStaff1);
        marketingHead.add(marketingStaff2);

        // Print all employees of the organization
        System.out.println(ceo);
        for (Worker headEmployee : ceo.getTeamMembers()) {
            System.out.println(headEmployee);
            for (Worker employee : headEmployee.getTeamMembers()) {
                System.out.println(employee);
            }
        }
    }
}
