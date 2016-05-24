package dao;

import models.Conversion;

/**
 * Created by Ramneek on 20/05/2016.
 */
public class ConversionDaoImpl extends Dao<Integer, Conversion> {
    public ConversionDaoImpl(){
        super(Integer.class, Conversion.class);
    }
}
