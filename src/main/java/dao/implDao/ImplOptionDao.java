package dao.implDao;

import java.util.List;

public interface ImplOptionDao<T> {

    T findById(int id, T t);

    void save(T t);

    void update(T t);

    void delete(T t);

    List<T> findAll(T t);
}
