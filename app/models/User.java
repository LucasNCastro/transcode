package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Ramneek on 13/05/2016.
 */
@Entity
@Table(name = "user_account")
public class User extends Model {
    private int id;
    private String name;
    private String email;
    private String password;
    private Date lastLogin;
    private List<Conversion> conversions;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(nullable = false, length = 1024)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @OneToMany(targetEntity = Conversion.class, mappedBy = "user")
    public List<Conversion> getMedias() {
        return conversions;
    }

    public void setMedias(List<Conversion> conversions) {
        this.conversions = conversions;
    }
}
