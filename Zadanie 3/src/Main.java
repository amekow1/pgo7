import java.util.*;

public class Main {
  public static void main(String[] args) {

    ArrayList<Item>items= new ArrayList<Item>();

    items.add(new Item(1, "Przedmiot 1"));
    items.add(new Item(3, "Przedmiot 2"));
    items.add(new Item(79, "Przedmiot 3"));
    items.add(new Item(2, "Przedmiot 4"));
    items.add(new Item(5, "Przedmiot 5"));
    items.add(new Item(6, "Przedmiot 6"));
    items.add(new Item(22, "Przedmiot 7"));
    items.add(new Item(30, "Przedmiot 8"));
    items.add(new Item(21, "Przedmiot 9 "));
    items.add(new Item(50, "Przedmiot 10"));

    List<Item> subList=items.subList(0, 5);

    Set<Item> itemSet= new LinkedHashSet<>(subList);

    for(Item item: itemSet){
      System.out.println(item);
    }
  }
}
