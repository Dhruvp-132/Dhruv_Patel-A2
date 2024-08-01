public class Person {
    private String name;
    private int age;
    private String email;

    public Person() {
        this.name = "Dhruv";
        this.age = 20;
        this.email = "Melbourne@gmail.com";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters and setters
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

    public String getAddress() {
        return email;
    }

    public void setAddress(String address) {
        this.email = address;
    }
}
