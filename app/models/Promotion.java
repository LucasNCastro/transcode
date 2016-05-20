package models;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.List;

/**
 * Created by Ramneek on 19/05/2016.
 */
@Entity
@Table(name = "promotions")
public class Promotion extends Model {
    private int id;
    @Formats.NonEmpty
    private String name;
    @Min(value = 1)
    private float price;
    @Min(value = 1)
    private int credits;
    private Date createdOn;
    private Date expiredOn;
    private List<Payment> payments;

    @Id
    @SequenceGenerator(name = "promotion_id_seq", sequenceName = "promotion_id_seq")
    @GeneratedValue(generator = "promotion_id_seq", strategy = GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Column(nullable = false, updatable = false)
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Column(nullable = true)
    public Date getExpiredOn() {
        return expiredOn;
    }

    public void setExpiredOn(Date expiredOn) {
        this.expiredOn = expiredOn;
    }

    @OneToMany(targetEntity = Payment.class, mappedBy = "promotion")
    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
