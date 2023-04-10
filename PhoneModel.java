package testgroup.PhoneCRUD.phone;

import javax.persistence.*;

@Entity
@Table(name = "phones")
public class PhoneModel {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "number")
    private long number;

    public PhoneModel()
    {
    }

    public PhoneModel(int id,String name,long number)
    {
        this.id = id;
        this.name=name;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name = '" + name + '\'' +
                ", number = " + number;
    }
}
