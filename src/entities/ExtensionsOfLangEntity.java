package entities;

import javax.persistence.*;

@Entity
@Table(name = "РАСШИРЕНИЯ_ЯЗЫКА", schema = "s223552", catalog = "studs")
@IdClass(ExtensionsOfLangEntityPK.class)
public class ExtensionsOfLangEntity {
    private int lang_id;
    private int extensions_id;

    public ExtensionsOfLangEntity() {
    }

    public ExtensionsOfLangEntity(int lang_id, int extensions_id) {
        this.lang_id = lang_id;
        this.extensions_id = extensions_id;
    }

    @Id
    @Column(name = "ИД_ЯЗЫКА")
    public int getLang_id() {
        return lang_id;
    }

    public void setLang_id(int lang_id) {
        this.lang_id = lang_id;
    }

    @Id
    @Column(name = "ИД_РАСШИРЕНИЯ")
    public int getExtensions_id() {
        return extensions_id;
    }

    public void setExtensions_id(int extensions_id) {
        this.extensions_id = extensions_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExtensionsOfLangEntity that = (ExtensionsOfLangEntity) o;

        if (lang_id != that.lang_id) return false;
        if (extensions_id != that.extensions_id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lang_id;
        result = 31 * result + extensions_id;
        return result;
    }
}
