package dao;

import dao.implDao.ImplOptionDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

@Repository("ImplOptionDao")
public abstract class OptionDao<T> implements ImplOptionDao<T> {

    @Override
    public T findById(int id, T t) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        t = (T) HibernateSessionFactoryUtil.getSessionFactory().openSession().get(t.getClass(), id);
        transaction.commit();
        session.close();
        return t;
    }

    @Override
    public void save(T t) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(t);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(T t) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(t);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(T t) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(t);
        transaction.commit();
        session.close();
    }

    @Override
    public List<T> findAll(T t) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<T> ts = (List<T>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from " + t.getClass().getSimpleName()).list();
        transaction.commit();
        session.close();
        return ts;
    }
}
