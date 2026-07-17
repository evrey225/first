import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int[] num = { 1, 4, 5, 6, 9, 0, 3, 2, 1};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int res = -1;
        for(int i=0; i < num.length; i++) {
            if (num[i] == x){
                res = i;
                break;
            }
        }
        System.out.println(res);

    }
}