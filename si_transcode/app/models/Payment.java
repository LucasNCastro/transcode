package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ramneek on 19/05/2016.
 */
@Entity
@Table(name = "payments")
public class Payment extends Model{
    private int id;
    private Date date;
    private float amount;
    private Account account;
    private Promotion promotion;

    @Id
    @SequenceGenerator(name = "payment_id_seq", sequenceName = "payment_id_seq")
    @GeneratedValue(generator = "payment_id_seq", strategy = GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Column(nullable = false)
    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @ManyToOne(targetEntity = Account.class)
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account user) {
        this.account = account;
    }

    @ManyToOne(targetEntity = Payment.class)
    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }
}
