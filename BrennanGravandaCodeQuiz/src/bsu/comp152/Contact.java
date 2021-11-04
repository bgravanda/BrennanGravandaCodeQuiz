package bsu.comp152;

public class Contact {

    private int contactId;
    private String name;
    private String phoneNum;
    private String notes;
    private static int nextID = 1000;


    public Contact(String name, String num, String info){
        nextID++;
        this.contactId = nextID;
        this.name = name;
        phoneNum = num;
        notes = info;
    }

    public int getContactId() {
        return contactId;
    }


    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getNotes() {
        return notes;
    }

}
