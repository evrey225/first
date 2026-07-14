import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        if (st >= 18 ) {
        System.out.println("Доступ дозволено");}
        else{
        System.out.println("Доступ заборонено");}
    }
}