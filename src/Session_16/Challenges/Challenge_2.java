package Session_16.Challenges;

import java.util.Objects;

public class Challenge_2 {
    public class Person {
        private String name;
        private int age;
        private String email;


        public Person(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person other = (Person) obj;
            return age == other.age && Objects.equals(name, other.name);
        }


        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }


        @Override
        public String toString() {
            return name + " (" + age + "), " + email;
        }


        public static void main(String[] args) {
            Person person1 = new Person("Alice", 30, "alice@example.com");
            Person person2 = new Person("Alice", 30, "alice123@example.com");
            Person person3 = new Person("Bob", 25, "bob@example.com");

            System.out.println("person1 equals person2? " + person1.equals(person2)); // true
            System.out.println("person1 hashCode == person2 hashCode? " + (person1.hashCode() == person2.hashCode())); // true

            System.out.println("person1 equals person3? " + person1.equals(person3)); // false
            System.out.println("person1 hashCode == person3 hashCode? " + (person1.hashCode() == person3.hashCode())); // probably false
        }
    }
}
