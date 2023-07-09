
public class Person {

    private String name;    // The Persons Name

    private String phoneNumber;        // The Persons Phone Number

    private String address;        // The Persons Address

    public Person(String name, String phoneNumber, String address) {

        this.name = name;

        this.phoneNumber = phoneNumber;

        this.address = address;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setidnumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;

    }

    public void setdepartmen(String adress) {

        this.address = adress;

    }

    public String getName() {

        return name;

    }

    public String getphoneNumber() {

        return phoneNumber;

    }

    public String getaddress() {

        return address;

    }
    
    @Override
    public String toString()
    {
      return "Name : " + name +"\n"+ " Address:  "+ phoneNumber+"\n" + "PhoneNumber:  " + address; 
    }

}
