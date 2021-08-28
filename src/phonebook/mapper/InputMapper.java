package phonebook.mapper;

import phonebook.data.DataAcquirer;
import phonebook.entity.Person;
import phonebook.exception.InputDataTypeException;
import phonebook.exception.InvalidMenuValueException;
import phonebook.exception.NegativeValueException;
import phonebook.view.Printer;

import java.util.Random;
import java.util.Scanner;

public class InputMapper {


    public Person toEntity(String[] args) {
        var person = new Person(new Random().nextInt(100_000));
        person.setFirstname(args[1]);
        person.setLastname(args[2]);
        person.setAge(Integer.parseInt(args[3]));
        person.setPhoneNumber(args[4]);
        return person;
    }


}
