package katalist;

public class Person {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String status;
    public enum Status {
        ACTIVE, INACTIVE
    }


    public Person(int id, String firstName, String lastName, int age, String status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
    }

    public int getId() {return id; }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getStatus() {return status; }
}
