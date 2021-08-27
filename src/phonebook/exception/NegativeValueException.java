package phonebook.exception;

public class NegativeValueException extends Exception {

    @Override
    public String toString() {
        return "Ошибка. Число должно быть положительным.";
    }
}
