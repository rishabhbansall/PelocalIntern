public class Person {
    private String name;
    private int age;

    // No-arg constructor
    public Person() {
        this.name = "";
        this.age = 0;
    }

    // All-arg constructor (uses setters to enforce validation)
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with validation (non-null, non-empty)
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation (must be >= 0)
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age cannot be negative");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

