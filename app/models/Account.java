package models;

import play.data.validation.Constraints;
import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Ramneek on 13/05/2016.
 */
@Entity
@Table(name = "accounts")
public class Account extends Model {
    private int id;
    @Constraints.Required
    private String name;
    @Constraints.Required
    @Constraints.Email
    private String email;
    private String password;
    private Date lastLogin;
    private Date createdOn;
    private float memoryLeft;
    private List<Conversion> conversions;
    private List<Payment> payments;
    private AuthProvider authProvider;


    @Id
    @SequenceGenerator(name="id_seq", sequenceName="user_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false, unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(nullable = false, unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(nullable = true, length = 1024)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(nullable = false, updatable = false)
    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Column(nullable = false, updatable = false)
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public float getMemoryLeft() {
        return memoryLeft;
    }

    public void setMemoryLeft(float memoryLeft) {
        this.memoryLeft = memoryLeft;
    }

    @OneToMany(targetEntity = Conversion.class, mappedBy = "account")
    public List<Conversion> getConversions() {
        return conversions;
    }

    public void setConversions(List<Conversion> conversions) {
        this.conversions = conversions;
    }

    @OneToMany(targetEntity = Payment.class, mappedBy = "account")
    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    @ManyToOne(targetEntity = AuthProvider.class)
    public AuthProvider getAuthProvider() {
        return authProvider;
    }

    public void setAuthProvider(AuthProvider authProvider) {
        this.authProvider = authProvider;
    }
}
