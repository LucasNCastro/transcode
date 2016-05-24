package dao;

import play.db.ebean.Model;

/**
 * Created by Ramneek on 20/05/2016.
 */
public abstract class Dao<I,T> {
    protected final Model.Finder<I,T> finder;
    public Dao(Class<I> idType, Class<T> modelType){
        finder = new Model.Finder<I,T>(idType, modelType);
    }
}
