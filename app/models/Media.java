package models;

import org.hibernate.validator.constraints.Length;
import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.*;
import javax.validation.Constraint;
import java.util.List;

/**
 * Created by Ramneek on 13/05/2016.
 */
@Entity
@Table(name = "medias")
public class Media extends Model{
    private int id;
    private String type;

    private List<Conversion> providedMediaConversions;
    private List<Conversion> convertedMediaConversions;

    @Id
    @SequenceGenerator(name = "media_id_seq", sequenceName = "media_id_seq")
    @GeneratedValue(generator = "media_id_seq", strategy = GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(length = 10)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @OneToMany(targetEntity = Conversion.class, mappedBy = "providedMedia")
    public List<Conversion> getProvidedMediaConversions() {
        return providedMediaConversions;
    }

    public void setProvidedMediaConversions(List<Conversion> providedMediaConversions) {
        this.providedMediaConversions = providedMediaConversions;
    }

    @OneToMany(targetEntity = Conversion.class, mappedBy = "convertedMedia")
    public List<Conversion> getConvertedMediaConversions() {
        return convertedMediaConversions;
    }

    public void setConvertedMediaConversions(List<Conversion> convertedMediaConversions) {
        this.convertedMediaConversions = convertedMediaConversions;
    }


}
