import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int[] payments = {255300, 240000, 243000, 156000, 248200};

        int total = 0;
        for (int payment : payments) {
            total += payment;
        }
        System.out.println(Arrays.toString(payments));
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
        System.out.println("-----");

        // Задача 2
        System.out.println("Задача 2");
        int minPayment = 0;
        int maxPayment = 0;

        for (int i = 0; i < payments.length; i++) {
            if (i == 0) {
                maxPayment = payments[i];
                minPayment = payments[i];
            } else if (payments[i] > maxPayment) {
                maxPayment = payments[i];
            } else if (payments[i] < minPayment) {
                minPayment = payments[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей. Максимальная сумма трат за неделю составила " + maxPayment + " рублей");
        System.out.println("-----");

        // Задача 3
        System.out.println("Задача 3");
        float avg = (float)total / payments.length; // общая сумма трат total уже подсчитана в задаче 1
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");
        System.out.println("-----");

        // Задача 4
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int i = 0;
        int j = reverseFullName.length - 1;

        while (i < j) {
            // меняем местами первый элемент с последним, 2-й с предпоследним и т.д.
            char c = reverseFullName[i];
            reverseFullName[i] = reverseFullName[j];
            reverseFullName[j] = c;
            i++;
            j--;
        }

        // Ввывод на печать
        for (char c : reverseFullName) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("-----");
    }
}