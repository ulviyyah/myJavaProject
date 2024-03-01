package school.lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void add(String surname, String number) {
        if (contacts.containsKey(surname)) {
            contacts.get(surname).add(number);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            contacts.put(surname, numbers);
        }
    }

    public List<String> get(String surname) {
        return contacts.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Smith", "1234567890");
        phoneBook.add("Johnson", "9876543210");
        phoneBook.add("Smith", "5555555555");

        System.out.println("Phone numbers for Smith: " + phoneBook.get("Smith"));
        System.out.println("Phone numbers for Johnson: " + phoneBook.get("Johnson"));
        System.out.println("Phone numbers for Williams: " + phoneBook.get("Williams"));
    }
}

