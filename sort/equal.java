package sort;

import java.util.Objects;

public class equal implements Cloneable{

    private Integer id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        equal equal = (equal) o;
        return Objects.equals(id, equal.id) && Objects.equals(name, equal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public equal(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        equal a = new equal(128,"a");
        //sort.equal b = null;

        equal b = (equal) a.clone();

        System.out.println(a);
        System.out.println(b);

    }


}
