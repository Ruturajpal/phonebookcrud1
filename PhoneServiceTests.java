
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import testgroup.PhoneCRUD.phone.PhoneDAO;
import testgroup.PhoneCRUD.phone.PhoneModel;
import testgroup.PhoneCRUD.phone.PhoneServiceImpl;
//import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class PhoneServiceTests {
    @Mock
    private PhoneDAO phoneDAO;

    @InjectMocks
    private PhoneServiceImpl phoneService;

     PhoneModel phoneModel1 = new PhoneModel(1, "Andy", 672183);
     PhoneModel phoneModel2 = new PhoneModel(2, "Liza", 612839);
     PhoneModel phoneModel3 = new PhoneModel(3, "Sanjey", 634211);
     
    @Test
    public void getPhones() {
        List<PhoneModel> phoneList = new ArrayList<>();
        phoneList.add(phoneModel1);
        phoneList.add(phoneModel2);
        when(phoneService.allPhones()).thenReturn(phoneList);
        List<PhoneModel> result = phoneService.allPhones();
        assertEquals(2, result.size());
    }

    @Test
    public void getPhone() {
        when(phoneDAO.getById(3)).thenReturn(phoneModel3);
        PhoneModel result = phoneService.getById(3);
        assertEquals(3, result.getId());
        assertEquals("Sanjey", result.getName());
    }

    @Test
    public void deletePhone() {
        phoneService.delete(phoneModel3);
        verify(phoneDAO, times(1)).delete(phoneModel3);
    }

}
