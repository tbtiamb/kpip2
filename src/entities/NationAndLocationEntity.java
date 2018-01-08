package entities;

import javax.persistence.*;

@Entity
@Table(name = "НАЦИОНАЛЬНОСТЬ_И_МЕСТОПОЛОЖЕНИЕ", schema = "s223552", catalog = "studs")
public class NationAndLocationEntity {
    private int nation_id;
    private String nation;
    private String country;
    private String city;

    public NationAndLocationEntity() {
    }

    public NationAndLocationEntity(int nation_id, String nation, String country, String city) {
        this.nation_id = nation_id;
        this.nation = nation;
        this.country = country;
        this.city = city;
    }

    @Id
    @Column(name = "ИД_НАЦИОНАЛЬНОСТИ")
    public int getNation_id() {
        return nation_id;
    }

    public void setNation_id(int nation_id) {
        this.nation_id = nation_id;
    }

    @Basic
    @Column(name = "НАЦИОНАЛЬНОСТЬ")
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "СТРАНА")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "ГОРОД")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NationAndLocationEntity that = (NationAndLocationEntity) o;

        if (nation_id != that.nation_id) return false;
        if (nation != null ? !nation.equals(that.nation) : that.nation != null)
            return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nation_id;
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
