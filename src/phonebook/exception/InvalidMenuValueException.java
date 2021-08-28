package phonebook.exception;

public class InvalidMenuValueException extends Exception {

    @Override
    public String toString() {
        return "Некорректный ввод!";
    }

}
