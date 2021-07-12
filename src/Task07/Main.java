package Task07;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Item> items = new ArrayList<>(); // Предметы
        items.add(new Item("Ноутбук", 3, 200));
        items.add(new Item("Принтер", 4, 300));
        items.add(new Item("Смартфон", 1, 150));


        Safe safe = new Safe(4); // Объём сейфа
        safe.makeAllSets(items);


        System.out.println("Наилучший этот набор предметов: ");
        System.out.println(safe.getBestItems());
        System.out.println("Максимальная ценность предметов в сейфе: " + safe.getPrice());
    }

}
