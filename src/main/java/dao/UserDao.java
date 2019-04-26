package dao;

import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class UserDao extends OptionDao<User> {

    public List<User> findUserLogin(String login) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<User> users = (List<User>) HibernateSessionFactoryUtil.getSessionFactory().openSession()
                .createCriteria(User.class)
                .add(Restrictions.eq("login", login)).list();
        transaction.commit();
        session.close();
        return users;
    }

}
