package dao;

import models.Payment;

/**
 * Created by Ramneek on 20/05/2016.
 */
public class PaymentDaoImpl extends Dao<Integer, Payment> {
    public PaymentDaoImpl(){
        super(Integer.class, Payment.class);
    }
}
