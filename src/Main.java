import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        for (int a = 10; a >= 0; a--) {
            System.out.println("Итерация цикла " + a);
        }
        for (int b = 0; b < 17; b++)
            if (b % 2 == 0) {
                System.out.println("Итерация цикла " + b);
            }
        for (int i = 10; i >=-10; i--) {
            System.out.println("Интерация цикла " + i);
        }
        for (int i = 1904; i < 2096; i= i+4) {
            System.out.println(i + " год является високосным");
        }
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Интерация цикла " + i);
        }
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Интерация цикла " + i);
        }
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {

            total = total + total/100;
            total = total + accumulation;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }


    }
}
