import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        wordLength(text);
    }
    static void wordLength(String text){
        String [] word = text.split(" ");
        LinkedList<String> result = new LinkedList<>();
        Map<Integer, List<String>> kit = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            for (String w: word) {
                if (w.length() == i){
                    kit.put(i, Collections.singletonList(w));
                    if (kit.get(i) != null){
                        result.add(w);
                    }
                    kit.put(i, result);
                }
            }
            result = new LinkedList<>();
        }
        System.out.println(kit);
    }
}