import java.util.*;

public class task_02 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        HashMap<String, Integer> nameCount = new HashMap<>();

        for (String employee : employees) {
            String[] nameParts = employee.split(" ");
            String firstName = nameParts[0];

            if (nameCount.containsKey(firstName)) {
                int count = nameCount.get(firstName);
                nameCount.put(firstName, count + 1);
            } else {
                nameCount.put(firstName, 1);
            }
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(nameCount.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            String name = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println(name + ": " + count);
            }
        }
    }
}

