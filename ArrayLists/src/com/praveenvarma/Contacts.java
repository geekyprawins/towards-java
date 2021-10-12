package com.praveenvarma;

public class Contacts {
    private String name;
    private String contact;

    public Contacts(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public static Contacts createContact(String name, String contact) {

        return new Contacts(name, contact);
    }
}
