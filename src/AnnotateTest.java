import java.util.Objects;

public class AnnotateTest {
    private String name = "Test For Annotation";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnnotateTest that = (AnnotateTest) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Annotation Testing {" +
                "name='" + name + '\'' +
                '}';
    }
}
