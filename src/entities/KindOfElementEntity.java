package entities;

import javax.persistence.*;

@Entity
@Table(name = "ВИД_ЭЛЕМЕНТА", schema = "s223552", catalog = "studs")
public class KindOfElementEntity {
    private int kind_id;
    private String kind;
    private String subkind;

    public KindOfElementEntity() {
    }

    public KindOfElementEntity(int kind_id, String kind, String subkind) {
        this.kind_id = kind_id;
        this.kind = kind;
        this.subkind = subkind;
    }

    @Id
    @Column(name = "ИД_ВИДА")
    public int getKind_id() {
        return kind_id;
    }

    public void setKind_id(int kind_id) {
        this.kind_id = kind_id;
    }

    @Basic
    @Column(name = "ВИД")
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Basic
    @Column(name = "ПОДВИД")
    public String getSubkind() {
        return subkind;
    }

    public void setSubkind(String subkind) {
        this.subkind = subkind;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KindOfElementEntity that = (KindOfElementEntity) o;

        if (kind_id != that.kind_id) return false;
        if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
        if (subkind != null ? !subkind.equals(that.subkind) : that.subkind != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = kind_id;
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        result = 31 * result + (subkind != null ? subkind.hashCode() : 0);
        return result;
    }
}
