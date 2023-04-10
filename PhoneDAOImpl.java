package testgroup.PhoneCRUD.phone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PhoneDAOImpl implements PhoneDAO{
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<PhoneModel> allPhones() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from PhoneModel").list();
    }

    @Override
    public List<PhoneModel> searchPhones(String search) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM PhoneModel where name = :search or number = :search");
        query.setParameter("search", search);

        return query.list();
    }

    @Override
    public void add(PhoneModel phone) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(phone);
    }

    @Override
    public void delete(PhoneModel phone) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(phone);
    }

    @Override
    public void edit(PhoneModel phone) {
        Session session = sessionFactory.getCurrentSession();
        session.update(phone);
    }

    @Override
    public PhoneModel getById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(PhoneModel.class, id);
    }
}
