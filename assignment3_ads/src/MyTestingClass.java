import java.util.Objects;
import java.util.Random;

public class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass(String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTestingClass that = (MyTestingClass) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        System.out.print(result);
        return result;
    }
}
