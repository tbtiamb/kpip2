package entities;

import javax.persistence.*;

@Entity
@Table(name = "РАСШИРЕНИЯ", schema = "s223552", catalog = "studs")
public class ExtensionsEntity {
    private int extension_id;
    private String extension;

    public ExtensionsEntity() {
    }

    public ExtensionsEntity(int extension_id, String extension) {
        this.extension_id = extension_id;
        this.extension = extension;
    }

    @Id
    @Column(name = "ИД_РАСШИРЕНИЯ")
    public int getExtension_id() {
        return extension_id;
    }

    public void setExtension_id(int extension_id) {
        this.extension_id = extension_id;
    }

    @Basic
    @Column(name = "РАСШИРЕНИЕ")
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExtensionsEntity that = (ExtensionsEntity) o;

        if (extension_id != that.extension_id) return false;
        if (extension != null ? !extension.equals(that.extension) : that.extension != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = extension_id;
        result = 31 * result + (extension != null ? extension.hashCode() : 0);
        return result;
    }
}
