package Classes;

import java.util.Objects;

public class Person {

    private String name;
    private String lastName;
    private Integer age;
    private String neighborhood;
    private Integer dni;
    private String ocupation;
    private Integer kitNumber;

    public Person() {
    }

    public Person(String name, String lastName, Integer age, String neighborhood, Integer dni, String ocupation) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.neighborhood = neighborhood;
        this.dni = dni;
        this.ocupation = ocupation;
        this.kitNumber = null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", neighborhood='" + neighborhood + '\'' +
                ", dni=" + dni +
                ", ocupation='" + ocupation + '\'' +
                ", kitNumber=" + kitNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public Integer getKitNumber() {
        return kitNumber;
    }

    public void setKitNumber(Integer kitNumber) {
        this.kitNumber = kitNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Person person = (Person) object;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }
}
