package HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstName {

    public static void main(String[] args) {

           List<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон","Рим");
        cities.stream().filter(s->s.length()==6).forEach(s -> System.out.println(s));

    }
}
