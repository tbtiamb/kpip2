package entities;

import javax.persistence.*;

@Entity
@Table(name = "КТО_ГОВОРИТ", schema = "s223552", catalog = "studs")
@IdClass(WhoSpeakEntityPK.class)
public class WhoSpeakEntity {
    private int lang_id;
    private int nation_id;

    public WhoSpeakEntity() {
    }

    public WhoSpeakEntity(int lang_id, int nation_id) {
        this.lang_id = lang_id;
        this.nation_id = nation_id;
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
    @Column(name = "ИД_НАЦИОНАЛЬНОСТИ")
    public int getNation_id() {
        return nation_id;
    }

    public void setNation_id(int nation_id) {
        this.nation_id = nation_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WhoSpeakEntity that = (WhoSpeakEntity) o;

        if (lang_id != that.lang_id) return false;
        if (nation_id != that.nation_id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lang_id;
        result = 31 * result + nation_id;
        return result;
    }
}