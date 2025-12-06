package src.encapsulation;

public class PersonEncapsulation {
    static class Person {
        private String name;
        private int age;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }
        public void setAge(int age) {
            if (age > 0) this.age = age;
            else System.out.println("Invalid age, must be > 0");
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Anita");
        p.setAge(-5); // invalid, will be handled
        p.setAge(28);
        System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
    }
}

