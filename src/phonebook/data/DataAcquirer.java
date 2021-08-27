package phonebook.data;

import phonebook.exception.InputDataTypeException;
import phonebook.exception.InvalidMenuValueException;
import phonebook.exception.NegativeValueException;
import phonebook.validator.NumberValidator;
import phonebook.view.Printer;

import java.io.IOException;
import java.util.Scanner;

public class DataAcquirer {
    private final Scanner scan = new Scanner(System.in);
    private final NumberValidator numberValidator = new NumberValidator();

    public int getIntegerNumber() throws NegativeValueException, InputDataTypeException {

        int number;
        try {
            number = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            throw new InputDataTypeException();
        }
        if (numberValidator.checkNegative(number)) {
            throw new NegativeValueException();
        }
        return number;
    }

    public int getMenuValue() throws NegativeValueException, InputDataTypeException, InvalidMenuValueException {
        int number = getIntegerNumber();
        if (!numberValidator.checkMenuValue(number)) {
            throw new InvalidMenuValueException();
        }
        return number;
    }

    public int getChoice() throws InvalidMenuValueException, NegativeValueException, InputDataTypeException {
        Printer printer = new Printer();
        printer.printMenu();
        int choice = 0;
        try {
            choice = getMenuValue();
        } catch (InvalidMenuValueException e) {
            getChoice();
        }
        return choice;
    }

    public String getString() {
        return scan.nextLine();
    }

}

