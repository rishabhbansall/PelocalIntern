public class second {
    public static void main(String[] args){
        System.out.println("This is the second file.");

        // Demonstration of getters and setters using Person
        Person p = new Person("Alice", 15);
        System.out.println("Created person: " + p);

        // Use getters
        System.out.println("Name via getter: " + p.getName());
        System.out.println("Age via getter: " + p.getAge());

        // Use setters with valid data
        p.setName("Bob");
        p.setAge(25);
        System.out.println("After setName/setAge: " + p);

        // Attempt to set invalid age and handle the exception
        try {
            p.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception when setting invalid age: " + e.getMessage());
        }

        // Attempt to set invalid name
        try {
            p.setName("  ");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception when setting invalid name: " + e.getMessage());
        }
    }
}
