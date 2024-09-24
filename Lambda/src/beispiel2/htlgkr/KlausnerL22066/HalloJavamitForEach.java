package beispiel2.htlgkr.KlausnerL22066;

import java.util.Arrays;
import java.util.List;

public class HalloJavamitForEach {

    public static List<String> list = Arrays.asList("Java", "C#", "Kotlin", "JavaScript");

    public static void main(String[] args){
        for(String s : list){
            System.out.println(list);
        }

        list.forEach(s -> System.out.println(s));

        list.forEach(System.out::println);

    }

}
