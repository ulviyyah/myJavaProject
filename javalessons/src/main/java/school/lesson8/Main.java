package school.lesson8;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] wordsArray = {"apple", "banana", "apple", "orange", "banana", "grape", "apple", "kiwi", "orange", "pineapple"};

        // Создаем карту для хранения слов и их количества
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Перебираем каждое слово в массиве и увеличиваем счетчик для этого слова
        for (String word : wordsArray) {
            // Если слово уже присутствует в карте, увеличиваем его счетчик
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // Если слово встречается впервые, добавляем его в карту с начальным счетчиком 1
                wordCountMap.put(word, 1);
            }
        }

        // Выводим уникальные слова и количество их вхождений
        System.out.println("Уникальные слова и количество их вхождений:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
