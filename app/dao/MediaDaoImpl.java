package dao;

import models.Media;

/**
 * Created by Ramneek on 20/05/2016.
 */
public class MediaDaoImpl extends Dao<Integer, Media> {
    public MediaDaoImpl(){
        super(Integer.class, Media.class);
    }
}
