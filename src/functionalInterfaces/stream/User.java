package functionalInterfaces.stream;


import java.util.List;

public class User {
    private String name;
    private Specialty specialty;
    private int age;
    private Long salary;
    private List<Integer> phoneNumber;


    public User(String name, Specialty specialty, int age, Long salary, List<Integer> phoneNumber) {
        this.name = name;
        this.specialty = specialty;
        this.age = age;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public List<Integer> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<Integer> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", specialty=" + specialty +
                ", age=" + age +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
