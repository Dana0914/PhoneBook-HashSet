package phonebookpractice;

import java.util.Objects;

public class Contact {
    private String name;
    private String number;
    private String group;
    public Contact(String name, String number, String group) {
        this.name = name;
        this.number = number;
        this.group = group;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact other = (Contact)  obj;
        return Objects.equals(name, other.name)
                && Objects.equals(number, other.number)
                && Objects.equals(group, other.group);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, number, group);
    }
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public String getGroup() {
        return group;
    }
}
