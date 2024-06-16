import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<Car> cars= new ArrayList<Car>();

    cars.add (new Car("Corsa", 2000));
    cars.add (new Car("Astra", 2004));
    cars.add (new Car("Insignia", 2020));
    cars.add (new Car("Mokka", 2024));
    cars.add (new Car("Crossland", 2013));
    cars.add (new Car("Grandland", 2007));
    cars.add (new Car("Zafira", 1999));
    cars.add (new Car("Golf", 2023));
    cars.add (new Car("Corsa", 2001));
    cars.add (new Car("Vivaro", 2002));

  for (Car car : cars){
    System.out.println(car.year);
  }
    Collections.sort(cars);

  System.out.println("-----------------------");

  for (Car car : cars){
    System.out.println(car.year);
  }
  }
}
