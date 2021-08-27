package phonebook.validator;

public class NumberValidator {
    public boolean checkNegative(int number) {
        return number < 0;
    }

    public boolean checkMenuValue(int number) {
        return number >= 1 && number <= 4;
    }
}
