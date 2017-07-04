import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@Getter
@Setter
public class Student {
    private String FirtsName;
    private String lastName;
    private String type;

    public Student(String firtsName, String lastName, String type) {
        FirtsName = firtsName;
        this.lastName = lastName;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return new EqualsBuilder()
                .append(FirtsName, student.FirtsName)
                .append(lastName, student.lastName)
                .append(type, student.type)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(FirtsName)
                .append(lastName)
                .append(type)
                .toHashCode();
    }

    @Override
    public String toString() {
        return "Student{" +
                "FirtsName='" + FirtsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
