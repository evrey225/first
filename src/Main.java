import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
/*1.напиши в ньому програму, яка виводить у консоль "Hello, World!".*
        System.out.println("Hello world");

/* 2. В main класі створи:
- Змінні типу String, int, double, boolean.
- Виведи значення цих змінних у консоль.*/
        int x = 42;
        float y = 2;
        double z = 1.1;
        boolean b = true;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(b);
/*Створи перевірку віку:
- Якщо вік менше 18 — виведи "Доступ заборонено".
- Якщо від 18 і більше — виведи "Доступ дозволено".
 Використай if-else конструкцію.*/
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        if (st >= 18 ) {
            System.out.println("Доступ дозволено");}
        else{
            System.out.println("Доступ заборонено");}
/*Створи перевірку дня тижня:
- Створи змінну з назвою дня тижня (наприклад, "Monday").
- Використай switch-case, щоб вивести "Робочий день" або "Вихідний день".*/
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пʼятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Баба не чує 9 чи 10");
        }
/*Створи цикл for, який виводить числа від 1 до 5 у консоль.*/
            for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                }
/*Напишіть метод, який реалізує лінійний пошук елемента в масиві цілих чисел.
Якщо такий елемент є в масиві, то поверніть його індекс, якщо ні — метод повинен
повернути число - «-1». Використовуй оператори порівняння.*/
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
/*Створи в уже створеному проєкті новий клас Calculator.
- Додай до нього метод add, який приймає два числа і повертає їхню суму (використай return).
- Виклич цей метод у методі main і виведи результат. */
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = cl.add(num1, num2);
        System.out.println(result);
/*Створи масив з п'яти імен студентів. Пройдися по ньому циклом і виведи кожне ім'я в консоль.*/
        String[] students = {"Іван", "Марія", "Олег", "Софія", "Андрій"};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
/*Створи список (ArrayList) з трьома містами. Додай ще одне місто до списку і виведи весь список у консоль.*/
        ArrayList<String> list = new ArrayList<>(3);
        list.add("Brovary");
        list.add("Kyiv");
        list.add("Odessa");
        Scanner sc = new Scanner(System.in);
        String cityadd = sc.next();
        list.add(cityadd);
        System.out.println(list);
/*твори метод, який ділить два числа. Використай try-catch, щоб обробити помилку ділення на нуль і вивести
повідомлення "На нуль ділити не можна".*/
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
/*Створи перевірку очікуваного і фактичного значення:
- Створи дві змінні: expected = "Login successful" і actual = "Login successful".
- Додай умову, яка перевіряє, чи збігаються ці значення, і виводить "Тест пройдено" або "Тест не пройдено".*/
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String z = sc.next();
        if (x.equals(z)) {
            System.out.println("Тест пройдено");
        } else {
            System.out.println("Тест не пройдено");
        }
    }
}



