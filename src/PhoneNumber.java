import java.util.ArrayList;
import java.util.HashMap;

public class PhoneNumber {
    private ArrayList<String> phoneNumber;
    private HashMap <String, ArrayList <String>> tableOfPhones;
    PhoneNumber(String person, String phoneNumber) {
      this.phoneNumber = new ArrayList<String>();
      addPhone(person, phoneNumber);
    }
    void addPhone (String person, String phoneNumber) {
      tableOfPhones = new HashMap<>();
      this.phoneNumber.add(phoneNumber);
      this.tableOfPhones.put(person,this.phoneNumber);
    }
    public ArrayList <String> getPhoneList  (String person) {
        return this.tableOfPhones.get(person);
    }
}
