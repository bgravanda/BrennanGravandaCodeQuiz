package bsu.comp152;

import java.util.ArrayList;

public abstract class RecordBook {
    private ArrayList<Contact> data;
    protected String Label;

    public RecordBook(String bookName){
        Label = bookName;
        data = new ArrayList<Contact>();
    }

    public abstract Contact findContact(String name);

    public String getRecordBookName(){

        return Label;
    }

}
