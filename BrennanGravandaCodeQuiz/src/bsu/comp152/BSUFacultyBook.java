package bsu.comp152;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BSUFacultyBook extends RecordBook{
    private Scanner finder;
    private String person;
    private ArrayList<Contact>allContacts;
    public BSUFacultyBook(String bookName){
        super(bookName);


    }


    @Override
    public Contact findContact(String name) {
        for (var currentSearch : allContacts){
            if (currentSearch.getName() == person);
            System.out.println(currentSearch.getName());
            System.out.println(currentSearch.getPhoneNum());
            System.out.println(currentSearch.getContactId());
            System.out.println(currentSearch.getNotes());
            return currentSearch;
        }

        return null;
    }

    public void LoadData(){
        allContacts = new ArrayList<Contact>();
        var filename = "Contacts.txt";
        var filePath = Paths.get(filename);
        List<String> allLines = null;
        try {
            allLines = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(var line : allLines){
            var splitLine = line.split(",");
            var name = splitLine[0];
            var number= splitLine[1];
            var info = splitLine[2];
            var contact = new Contact(name,number,info);
            allContacts.add(contact);
        }
        System.out.println("enter the name of a person to search");
        finder= new Scanner(System.in);
        person = finder.toString();
        findContact(person);

    }
}
