package testgroup.PhoneCRUD.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService{
    private PhoneDAO phoneDAO;

    @Autowired
    public PhoneServiceImpl(PhoneDAO phoneDAO) {
        this.phoneDAO = phoneDAO;
    }

    @Override
    @Transactional
    public List<PhoneModel> allPhones() {
        return phoneDAO.allPhones();
    }

    @Override
    @Transactional
    public List<PhoneModel> searchPhones(String search) {
        return phoneDAO.searchPhones(search);
    }

    @Transactional
    @Override
    public void add(PhoneModel phoneModel) {
        phoneDAO.add(phoneModel);
    }

    @Transactional
    @Override
    public void delete(PhoneModel phoneModel) {
        phoneDAO.delete(phoneModel);
    }

    @Transactional
    @Override
    public void edit(PhoneModel phoneModel) {
        phoneDAO.edit(phoneModel);
    }

    @Transactional
    @Override
    public PhoneModel getById(int id) {
        return phoneDAO.getById(id);
    }
}
