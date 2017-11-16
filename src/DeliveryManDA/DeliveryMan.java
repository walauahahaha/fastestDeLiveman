/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DeliveryManDA;

/**
 *
 * @author hp
 */
public class DeliveryMan {
    private int ID;
    private String Name;
    private String IC;
    private String Gender;
    private String ContactNo;
    private String Address;
    private String Email;

    public DeliveryMan() {
       
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }


    public DeliveryMan(int ID, String Name, String IC, String Gender, String ContactNo, String Address, String Email) {
        this.ID = ID;
        this.Name = Name;
        this.IC = IC;
        this.Gender = Gender;
        this.ContactNo = ContactNo;
        this.Address = Address;
        this.Email = Email;
    }
}
