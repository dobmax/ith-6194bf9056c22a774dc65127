package ua.ithillel.collections.list.homework.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private final List<Record> records = new ArrayList<>();

    public void add(Record record) {
        records.add(record);
    }

    public void add(String name, String phoneNumber) {
        add(new Record(name, phoneNumber));
    }

    public Record find(String name) {
        for (Record record: records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }

        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> foundRecords = new ArrayList<>();

        for (Record record: records) {
            if (record.getName().equals(name)) {
                foundRecords.add(record);
            }
        }

        return foundRecords;
    }

}
