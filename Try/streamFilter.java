import java.util.*;
import java.util.stream.Collectors;

public class streamFilter {
    
    public static void main(String[] args) {
        // Example 1: Filter numbers greater than 25000
        System.out.println("=== Example 1: Filter Salaries Greater Than 25000 ===");
        filterSalariesAboveThreshold();
        
        // Example 2: Filter and collect specific conditions
        System.out.println("\n=== Example 2: Filter Even Numbers ===");
        filterEvenNumbers();
        
        // Example 3: Filter objects based on properties
        System.out.println("\n=== Example 3: Filter Employee Objects ===");
        filterEmployeesByDepartment();
    }
    
    // Example 1: Filter numbers based on a condition
    public static void filterSalariesAboveThreshold() {
        List<Integer> salaries = Arrays.asList(15000, 20000, 30000, 40000, 25000);
        
        List<Integer> filteredSalaries = salaries.stream()
                .filter(salary -> salary > 25000)
                .collect(Collectors.toList());
        
        System.out.println("Original Salaries: " + salaries);
        System.out.println("Salaries > 25000: " + filteredSalaries);
    }
    
    // Example 2: Filter even numbers and transform them
    public static void filterEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)  // Square the even numbers
                .collect(Collectors.toList());
        
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Even Numbers (Squared): " + evenNumbers);
    }
    
    // Example 3: Filter Employee objects based on department
    public static void filterEmployeesByDepartment() {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 50000),
                new Employee("Bob", "HR", 40000),
                new Employee("Charlie", "IT", 60000),
                new Employee("Diana", "Finance", 55000),
                new Employee("Eve", "IT", 45000)
        );
        
        List<Employee> itEmployees = employees.stream()
                .filter(emp -> emp.getDepartment().equals("IT"))
                .collect(Collectors.toList());
        
        System.out.println("All Employees: " + employees);
        System.out.println("IT Department Employees: " + itEmployees);
    }
    
    // Employee class for Example 3
    static class Employee {
        private String name;
        private String department;
        private double salary;
        
        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
        
        public String getDepartment() {
            return department;
        }
        
        @Override
        public String toString() {
            return name + " (" + department + ", $" + salary + ")";
        }
    }
}

