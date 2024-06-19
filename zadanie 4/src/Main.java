import java.util.Scanner;
public class Main {
   private static int[] tablica = new int[10];

  public static int readNumber() throws NegativeNumberException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbę");
    int number = scanner.nextInt();

    if (number < 0) {
      throw new NegativeNumberException("Negative numbers are not allowed");

    }return number;
  }
  public static void fillArray(){
    for( int i=0; i< tablica.length;i++){
      try {
        tablica[i]=readNumber();
      }catch (NegativeNumberException e){
        System.out.println("Wyjatek  " + e.getMessage());
        tablica[i]=0;
      }

    }

  }
  public static void main(String[] args) {
    fillArray();
    System.out.println("Zawartość tablicy:");
    for (int value : tablica) {
      System.out.println(value);
    }
  }
}



