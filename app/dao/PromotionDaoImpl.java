package dao;

import models.Promotion;

/**
 * Created by Ramneek on 20/05/2016.
 */
public class PromotionDaoImpl extends Dao<Integer, Promotion> {
    public PromotionDaoImpl(){
        super(Integer.class, Promotion.class);
    }
}