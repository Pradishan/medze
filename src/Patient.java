import pradee.MedzeUtil;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

// patient section
public class Patient implements Serializable{
    private String e_no,name,gender,blood,contact,allergy;
    private Date date = null;

    public String getE_no() {
        return e_no;
    }

    public void setE_no(String e_no) {
        this.e_no = e_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(String dob1) throws ParseException {
        SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
        this.date = sfd.parse(String.valueOf(dob1));
    }

    public String getContact() {

        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        try {
            return e_no+" | "+name+" | "+ MedzeUtil.age(date)+" | "+gender+" | "+blood+" | "+contact+" | "+allergy;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
