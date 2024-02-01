package collections;

import java.util.ArrayList;
import java.util.List;

public class Languages {
    public static void main(String[] args) {

        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");

       
        System.out.println("Original List:");
        printList(programmingLanguages);
        programmingLanguages.set(2, "C#");
        programmingLanguages.add(1, "Ruby");
        programmingLanguages.remove("Java");
        System.out.println("\nModified List:");
        printList(programmingLanguages);
    }
    private static void printList(List<String> list) {
        for (String language : list) {
            System.out.println(language);
        }
    }
}
