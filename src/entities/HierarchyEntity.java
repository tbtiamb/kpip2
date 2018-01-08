package entities;

import javax.persistence.*;

@Entity
@Table(name = "ИЕРАРХИЯ", schema = "s223552", catalog = "studs")
public class HierarchyEntity {
    private int element;
    private Integer level;

    public HierarchyEntity() {
    }

    public HierarchyEntity(int element, Integer level) {
        this.element = element;
        this.level = level;
    }

    @Id
    @Column(name = "ЭЛЕМЕНТ")
    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    @Basic
    @Column(name = "УРОВЕНЬ")
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HierarchyEntity that = (HierarchyEntity) o;

        if (element != that.element) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = element;
        result = 31 * result + (level != null ? level.hashCode() : 0);
        return result;
    }
}
