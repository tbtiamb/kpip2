package entities;

import javax.persistence.*;

@Entity
@Table(name = "ЭЛЕМЕНТ", schema = "s223552", catalog = "studs")
public class ElementEntity {
    private int element_id;
    private String name;
    private Boolean status;
    private Long numberOfSpeakers;

    public ElementEntity() {
    }

    public ElementEntity(int element_id, String name, Boolean status, Long numberOfSpeakers) {
        this.element_id = element_id;
        this.name = name;
        this.status = status;
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Id
    @Column(name = "ИД_ЭЛЕМЕНТА")
    public int getElement_id() {
        return element_id;
    }

    public void setElement_id(int element_id) {
        this.element_id = element_id;
    }

    @Basic
    @Column(name = "НАЗВАНИЕ")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "СОСТОЯНИЕ")
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Basic
    @Column(name = "ЧИСЛО_ГОВОРЯЩИХ")
    public Long getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(Long numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElementEntity that = (ElementEntity) o;

        if (element_id != that.element_id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (numberOfSpeakers != null ? !numberOfSpeakers.equals(that.numberOfSpeakers) : that.numberOfSpeakers != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = element_id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (numberOfSpeakers != null ? numberOfSpeakers.hashCode() : 0);
        return result;
    }
}
