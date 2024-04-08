package be.entity;

import javax.persistence.*;

@Entity
public class User {

    @Column(name = "UserId")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Column (name = "FirstName")
    private String firstName;

    @Column(name="LastName")
    private String lastName;

    @Column(name = "Address")
    private String addres;

    @Column(name = "City")
    private String city;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}

