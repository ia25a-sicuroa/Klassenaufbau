package exercise2;

public class Patient {

    //TODO: Declare Private Attributes
    private String id;
    private String name;
    private int age;


    //TODO: Create Constructor
    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //TODO: Add Getter and Setter Methods


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //TODO: Add toString Method
    public String toString() {

        return "Mein Name ist " + name + " ich bin " + age + " jahre alt " +" und meine id ist " + id;
    }

}
