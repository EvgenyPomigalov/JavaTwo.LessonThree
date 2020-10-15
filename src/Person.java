import java.util.ArrayList;
import java.util.HashMap;

public class Person {
    private HashMap <String, ArrayList <String>> tableOfPhones;
    private ArrayList<String> phoneNumber;
    public String name;
    public PhoneNumber phone;
    public String email;
   Person (String name, String phone, String email) {
        this.name = name;
        this.phone = new PhoneNumber(name, phone);
    }

    public String getPhone(){
      return phone.getPhoneList(this.name).toString();
    }

    public void addPhone(String phone){
        this.phone = new PhoneNumber(this.name, phone);
    }
}
