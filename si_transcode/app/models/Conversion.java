package models;

import play.data.validation.Constraints;
import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ramneek on 13/05/2016.
 */
@Entity
@Table(name = "conversions")
public class Conversion extends Model {
    private int id;
    private Date date;
    private int size;
    private String url;
    private Media providedMedia;
    private Media convertedMedia;
    private Account account;

    @Id
    @SequenceGenerator(name = "conversion_id_seq", sequenceName = "conversion_id_seq")
    @GeneratedValue(generator = "conversion_id_seq", strategy = GenerationType.SEQUENCE)
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
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Column(nullable = false)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @ManyToOne(targetEntity = Media.class)
    public Media getProvidedMedia() {
        return providedMedia;
    }

    public void setProvidedMedia(Media providedMedia) {
        this.providedMedia = providedMedia;
    }

    @ManyToOne(targetEntity = Media.class)
    public Media getConvertedMedia() {
        return convertedMedia;
    }

    public void setConvertedMedia(Media convertedMedia) {
        this.convertedMedia = convertedMedia;
    }

    @ManyToOne(targetEntity = Account.class)
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
