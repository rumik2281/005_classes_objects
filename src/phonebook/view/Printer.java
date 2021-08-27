package phonebook.view;

public class Printer {

    public void printMenu() {
        String MENU_STRING = "Что вы хотите изменить?\n1. Имя\n2. Фамилия\n3. Возраст\n4. Номер телефона\n";
        System.out.printf("%s", MENU_STRING);
    }

}
