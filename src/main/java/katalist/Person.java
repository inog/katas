package katalist;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String status;
    public enum Status {
        ACTIV, INACTIV;
    };


    public Person(String firstName, String lastName, int age, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
    }

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
