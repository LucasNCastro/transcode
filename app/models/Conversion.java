package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Ramneek on 13/05/2016.
 */
@Entity
public class Conversion extends Model {
    private int id;
    private Date date;
    private int size;
    private String url;
    private Media providedMedia;
    private Media convertedMedia;
    private User user;

    @Id
    @GeneratedValue
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

    @OneToOne(targetEntity = Media.class)
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
