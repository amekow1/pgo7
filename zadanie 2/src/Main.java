import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    ArrayList<Item> items=new ArrayList<Item>();

    items.add(new Item(3, "Item1"));
    items.add(new Item(12, "Item2"));
    items.add(new Item(30, "item3"));
    items.add(new Item(10, "Item4"));
    items.add(new Item(2, "Item5"));

   for(int i=0; i< items.size();i++){
     Item item=items.get(i);
     item.show();
   }
   System.out.println("==========================");
    HashMap<Integer, String> itemMap  = new HashMap<>();
   for(Item item: items){
     itemMap.put(item.getId(), item.getName());
   }
    for (Map.Entry<Integer, String> entry: itemMap.entrySet()){
      System.out.println("Identyfikator: "+ entry.getKey()+"      "+ "Nazwa: "+ entry.getValue());
    }
  }
}
