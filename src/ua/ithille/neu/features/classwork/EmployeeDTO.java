package ua.ithille.neu.features.classwork;

import java.util.Objects;

public record EmployeeDTO(String name, String surname, int age) {
}

class EmployeeDTOClassic {
    private final String name;
    private final String surname;
    private final int age;

    EmployeeDTOClassic(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDTOClassic that = (EmployeeDTOClassic) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
}
