import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("Напишите", "код", "который", "выводит", "в",
                "консоль", "все", "уникальные", "слова", "из", "списка", "слов", "в", "котором", "могут", "встречаться",
                "дубли", ".", "В", "качестве", "отладочной", "информации", "возьмите", "в", "котором",
                "встречаются", "повторения", ".", "."));

        ListExample.checkOddNumbers(nums);
        SetExample.checkEvenNumbers(nums);
        SetExample.checkWords(words);
        MapExample.checkDoubleWords(words);
    }
}