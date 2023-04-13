// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;

public class programm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = input.nextInt();

        int triangleNumber = 0;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
            factorial *= i;
        }

        System.out.println("Треугольное число 1 + 2 + ... + " + n + " = " + triangleNumber);
        System.out.println("n! = " + factorial);
    }
}