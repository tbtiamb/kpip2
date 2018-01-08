package entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "АВТОРЫ", schema = "s223552", catalog = "studs")
public class AutorsEntity {
    private int autor_id;
    private String firstName;
    private String secondName;
    private Date dateOfBirth;
    private Date dateOfDeath;

    public AutorsEntity() {}

    public AutorsEntity(int autor_id, String firstName, String secondName, Date dateOfBirthday, Date dateOfDeath) {
        this.autor_id = autor_id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirthday;
        this.dateOfDeath = dateOfDeath;
    }

    @Id
    @Column(name = "ИД_АВТОРА")
    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    @Basic
    @Column(name = "ИМЯ")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    @Basic
    @Column(name = "ФАМИЛИЯ")
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Basic
    @Column(name = "ДАТА_РОЖДЕНИЯ")
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "ДАТА_СМЕРТИ")
    public Date getDateOfDeath() {
        return dateOfDeath;
    }

    public void setDateOfDeath(Date dateOfDeath) {
        this.dateOfDeath = dateOfDeath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutorsEntity that = (AutorsEntity) o;

        if (autor_id != that.autor_id) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (secondName != null ? !secondName.equals(that.secondName) : that.secondName != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null) return false;
        if (dateOfDeath != null ? !dateOfDeath.equals(that.dateOfDeath) : that.dateOfDeath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = autor_id;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (dateOfDeath != null ? dateOfDeath.hashCode() : 0);
        return result;
    }
}
