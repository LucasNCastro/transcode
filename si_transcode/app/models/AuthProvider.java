package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ramneek on 19/05/2016.
 */
@Entity
@Table(name = "auth_providers")
public class AuthProvider extends Model {
    private int id;
    private String name;
    private List<Account> accounts;

    @Id
    @SequenceGenerator(name = "auth_provider_id_seq", sequenceName = "auth_provider_id_seq")
    @GeneratedValue(generator = "auth_provider_id_seq", strategy = GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(targetEntity = Account.class, mappedBy = "authProvider")
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setUsers(List<Account> accounts) {
        this.accounts = accounts;
    }
}
