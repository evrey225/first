import java.util.Scanner;
import java.util.ArrayList;
class Main {
public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(3);
    list.add("Brovary");
    list.add("Kyiv");
    list.add("Odessa");
    Scanner sc = new Scanner(System.in);
    String cityadd = sc.next();
    list.add(cityadd);
    System.out.println(list);
}
}