public class Person {
    private String name;
    private int pets;

    public Person(String name, int pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public int getPets() {
        return pets;
    }

    public String greeting() {
        return "Hello, my name is " + name + " and I have " + pets + " pets.";
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("gary", 2);

        if (person.getName().equals("gary")) {
            System.out.println("getName: PASS");
        } else {
            System.out.println("getName: FAIL");
        }

        if (person.getPets() == 2) {
            System.out.println("getPet: PASS");
        } else {
            System.out.println("getPet: FAIL");
        }
    }
}
