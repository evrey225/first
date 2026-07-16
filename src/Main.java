import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = sc.nextInt();
        try {
            int res = x/z;
            System.out.println(res);
        }
        catch (Exception e){
            System.out.println("На нуль ділити не можна");
        }
    }
}