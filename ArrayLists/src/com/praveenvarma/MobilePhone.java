package com.praveenvarma;

import java.util.ArrayList;

public class MobilePhone {
    private String myContact;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myContact) {
        this.myContact = myContact;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact) {

        if (findContact(contact.getName()) >= 0) {

            System.out.println("Contact already in file...");
            return false;
        }
        myContacts.add(contact);
        return true;
    }


    private int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contacts contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }

        }
        return -1;

    }


    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int pos = findContact(oldContact);
        if (pos < 0) {
            System.out.println("Not Found");
            return false;
        }
        this.myContacts.set(pos, newContact);
        System.out.println("Replaced!");
        return true;

    }

    public boolean removeContact(Contacts ctct) {
        int pos = findContact(ctct);
        if (pos < 0) {
            System.out.println("Not Found");
            return false;
        }
        this.myContacts.remove(pos);
        System.out.println("Deleted!");
        return true;

    }


    public String queryContact(Contacts contact) {
        if (findContact(contact) >= 0) {
            return contact.getContact();
        }
        return null;

    }
    public void printContacts(){
        System.out.println("Contacts list: \n");
        for (int i = 0; i <this.myContacts.size() ; i++) {
            System.out.println(  (i+1) + "."+ this.myContacts.get(i).getName()+"-->"+this.myContacts.get(i).getContact());
        }
    }
    public Contacts queryContact(String name){
        int pos = findContact(name);
        if(pos>=0){
            return this.myContacts
                    .get(pos);
        }
return  null;

    }

}
