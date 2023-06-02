import java.util.*;

public class task_01 {
    private HashMap<String, List<String>> contacts;

    public task_01() {
        contacts = new HashMap<>();
    }

    public void addNumber(String name, String number) {
        if (contacts.containsKey(name)) {
            List<String> numbers = contacts.get(name);
            numbers.add(number);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            contacts.put(name, numbers);
        }
    }

    public void displayAll() {
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            String name = entry.getKey();
            List<String> numbers = entry.getValue();
            System.out.print(name + ": ");
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i));
                if (i < numbers.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        task_01 phoneBook = new task_01();

        int choice;
        do {
            System.out.println("Введите 1) Добавление номера\n2) Вывод всего");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите фамилию:");
                    String name = scanner.next();
                    System.out.println("Введите номер:");
                    String number = scanner.next();
                    phoneBook.addNumber(name, number);
                    break;
                case 2:
                    phoneBook.displayAll();
                    break;
                default:
                    System.out.println("Некорректный выбор.");
                    break;
            }
        } while (choice != 2);
    }
}
