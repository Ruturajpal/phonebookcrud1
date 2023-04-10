package testgroup.PhoneCRUD.phone;

import java.util.List;

public interface PhoneDAO {
    List<PhoneModel> allPhones();
    List<PhoneModel> searchPhones(String search);
    void add(PhoneModel phoneModel);
    void delete(PhoneModel phoneModel);
    void edit(PhoneModel phoneModel);
    PhoneModel getById(int id);
}
