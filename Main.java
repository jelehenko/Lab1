import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // Считывание шести натуральных чисел
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int a3 = in.nextInt();
        int a4 = in.nextInt();
        int a5 = in.nextInt();
        int a6 = in.nextInt();

        // Сортировка шести переменных по возрастанию
        int t;
        if (a1 > a2) { t = a1; a1 = a2; a2 = t; }
        if (a1 > a3) { t = a1; a1 = a3; a3 = t; }
        if (a1 > a4) { t = a1; a1 = a4; a4 = t; }
        if (a1 > a5) { t = a1; a1 = a5; a5 = t; }
        if (a1 > a6) { t = a1; a1 = a6; a6 = t; }

        if (a2 > a3) { t = a2; a2 = a3; a3 = t; }
        if (a2 > a4) { t = a2; a2 = a4; a4 = t; }
        if (a2 > a5) { t = a2; a2 = a5; a5 = t; }
        if (a2 > a6) { t = a2; a2 = a6; a6 = t; }

        if (a3 > a4) { t = a3; a3 = a4; a4 = t; }
        if (a3 > a5) { t = a3; a3 = a5; a5 = t; }
        if (a3 > a6) { t = a3; a3 = a6; a6 = t; }

        if (a4 > a5) { t = a4; a4 = a5; a5 = t; }
        if (a4 > a6) { t = a4; a4 = a6; a6 = t; }

        if (a5 > a6) { t = a5; a5 = a6; a6 = t; }

        // Проверка условия ромба:
        // четыре меньших расстояния равны (стороны),
        // а два больших удовлетворяют тождеству параллелограмма (диагонали)
        if (a1 == a2 && a2 == a3 && a3 == a4
                && a5 * a5 + a6 * a6 == 4 * a1 * a1) {
            out.println("YES");
        } else {
            out.println("NO");
        }
    }
}