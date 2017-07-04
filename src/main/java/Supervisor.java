import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

@Setter
@Getter
public class Supervisor {
    private String FirtsName;
    private String lastName;
    private String type;

    public Supervisor(String firtsName, String lastName, String type) {
        FirtsName = firtsName;
        this.lastName = lastName;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Supervisor that = (Supervisor) o;

        return new EqualsBuilder()
                .append(FirtsName, that.FirtsName)
                .append(lastName, that.lastName)
                .append(type, that.type)
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
        return "Supervisor{" +
                "FirtsName='" + FirtsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
