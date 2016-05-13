package models;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ramneek on 13/05/2016.
 */
@Entity
public class PriceSchema {
    private int id;
    private float price;
    private List<Media> medias;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @OneToMany(targetEntity = Media.class, mappedBy = "priceSchema")
    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(Media media) {
        this.medias = medias;
    }
}
