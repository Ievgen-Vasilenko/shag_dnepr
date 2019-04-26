package dao;

import models.Add;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import utils.HibernateSessionFactoryUtil;

import java.io.File;
import java.util.List;


public class AddDao extends OptionDao<Add> {

    @Override
    public void delete(Add add) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String folderName = add.getFolder();
        File folder = new File("C:/Users/Wasel/IdeaProjects/diplom/target/diplom/resources/images/" + folderName + "/");
        folder.delete();
        session.delete(add);
        transaction.commit();
        session.close();
    }

    public List<Add> findTen() {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Add> adds = (List<Add>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from " + Add.class.getSimpleName() + " Order By id DESC").setMaxResults(10).list();
        transaction.commit();
        session.close();
        return adds;
    }

    public List<Add> findOptions(int cityOT, int cityDO,
                                 int realtyTypeOT, int realtyTypeDO,
                                 int roomsOT, int roomsDO,
                                 int totalAreaOT, int totalAreaDO
                                 ) {

        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Add> addsFind = (List <Add>) HibernateSessionFactoryUtil.getSessionFactory().openSession()
                .createCriteria(Add.class)
                .add(Restrictions.ge("totalArea", (float)totalAreaOT))
                .add(Restrictions.le("totalArea", (float)totalAreaDO))
                .add(Restrictions.ge("rooms", roomsOT))
                .add(Restrictions.le("rooms", roomsDO))
                .createAlias("realtyType","realtyType")
                .add(Restrictions.ge("realtyType.id", realtyTypeOT))
                .add(Restrictions.le("realtyType.id", realtyTypeDO))
                .createAlias("city","city")
                .add(Restrictions.ge("city.id", cityOT))
                .add(Restrictions.le("city.id", cityDO))
                .list();
        transaction.commit();
        session.close();
        return addsFind;
    }

    public List<Add> findUserAdd(int userId) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        List<Add> addsFind = (List<Add>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("from " + Add.class.getSimpleName() + " WHERE identyUser = " + userId).list();
        transaction.commit();
        session.close();
        return addsFind;
    }
}

