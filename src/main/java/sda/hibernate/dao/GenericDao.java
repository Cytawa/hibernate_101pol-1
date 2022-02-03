package sda.hibernate.dao;

public interface GenericDao<T> {
    T findById (int id);
    void insertObject (T t);
    void deleteObject (T t);
    void deleteObject (int id);
    public void updateObject (T t, int id);
    public <List> T;




}
