package entities;

import javax.persistence.*;

@Entity
@Table(name = "ВОЗМОЖНОСТИ", schema = "s223552", catalog = "studs")
public class CapabilitiesEntity {
    private int capability_id;
    private String capability;
    private String version;

    public CapabilitiesEntity() {
    }

    public CapabilitiesEntity(int capability_id, String capability, String version) {
        this.capability_id = capability_id;
        this.capability = capability;
        this.version = version;
    }

    @Id
    @Column(name = "ИД_ВОЗМОЖНОСТИ")
    public int getCapability_id() {
        return capability_id;
    }

    public void setCapability_id(int capability_id) {
        this.capability_id = capability_id;
    }

    @Basic
    @Column(name = "ВОЗМОЖНОСТЬ")
    public String getCapability() {
        return capability;
    }

    public void setCapability(String capability) {
        this.capability = capability;
    }

    @Basic
    @Column(name = "ВЕРСИЯ")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CapabilitiesEntity that = (CapabilitiesEntity) o;

        if (capability_id != that.capability_id) return false;
        if (capability != null ? !capability.equals(that.capability) : that.capability != null) return false;
        if (version != null ? !version.equals(that.version) : that.version != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = capability_id;
        result = 31 * result + (capability != null ? capability.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        return result;
    }
}
