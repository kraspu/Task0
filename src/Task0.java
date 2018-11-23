/**
 *    date: 18 nov 2018
 *  author: kraspu [Pavlo Krasovskyi]
 */

// Каждое задание реализовать как отдельный метод. Исходные данные метод принимает как аргументы.
// Результат возвращает через return либо печатает в консоль.

public class Task0 {

    public static void main(String[] args) {     //HowTo: Раскомментируйте строку с нужным методом!!!

//        System.out.println(met1(2));
//        System.out.println(met2(1,3,5,2));
//        met3(1,4,4);
//        met4(0);
//        System.out.println(met5(5.,4.,4.));
//        met6(-6);
//        met7(3,3);
//        met8(3,4,5);
//        met9(4,3,4,4);
//        met10(5);
//        met11(12);
//        met12(3,3,3);
//        met13(2,5);
//        System.out.println(met14(2,4));
//        System.out.println(met15(3));
//        System.out.println(met16(8.5,3.0));
//        System.out.println(met17(6));
        met18(123);
//        met19(2,4);
    }

//     Задание №1. Основные операторы
//     Дана сторона квадрата a. Найдите его площадь S = a * a.
    static double met1(double a) {
        return a * a;
    }

//     Задание №2. Основные операторы
//     Скорость первого автомобиля V1 км/ч, второго – V2 км/ч, расстояние между ними S км.
//     Определите расстояние между ними через T часов, если автомобили первоначально
//     движутся навстречу друг другу. Данное расстояние равно модулю разности начального
//     расстояния и общего пути, проделанного автомобилями, общий путь = время * суммарная
//     скорость. Значения V1, V2, S, T – задает пользователь.
//     Метод Math.abs() возвращает модуль числа:
//     Math.abs(-2); // 2
    static double met2(double v1, double v2, double s, double t) {
        return Math.abs(s - t * (v1 + v2));
    }

//     Задание №3. Основные операторы
//     Найдите корни квадратного уравнения A * x * x + B * x + C = 0, заданного своими
//     коэффициентами A, B, C (коэффициент A не равен 0), если известно, что дискриминант
//     уравнения положителен. Выведите значение корней на экран. Корни квадратного уравнения
//     находятся по формуле:
//     x1 = (-B + √D) / (2 * A),
//     x2 = (-B - √D) / (2 * A),
//     где D – дискриминант, равный B * B - 4 * A * C.
//     Метод Math.sqrt() возвращает квадратный корень числа:
//     Math.sqrt(9); // 3
    static void met3(double a, double b, double c){
        double x1;
        double x2;
        double d;
        d = Math.sqrt(b * b - 4 * a * c);
        if (d >= 0) {
            x1 = (-b + d) / (2 * a);
            x2 = (-b - d) / (2 * a);
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        } else System.out.println(" d < 0");
    }

//    Задание №4. Операторы сравнения. Условные операторы
//    Дано целое число. Если оно является положительным, то прибавьте к нему 1; если
//    отрицательным, то вычтите из него 2; если нулевым, то замените его на 10. Выведите
//    полученное число.
    static void met4(int a){
        if (a > 0) {
            System.out.println("a > 0, thus a = " + (++a));
        }
        else if (a < 0) {
            System.out.println("a < 0, thus a = " + (a - 2));
        }
        else
            System.out.println("a = " + 10);
    }

//    Задание №5. Операторы сравнения. Условные операторы
//    Даны три числа. Не используя логические операторы, найдите сумму двух наибольших из них.
    static double met5(double a, double b, double c){
        double sum;
        sum = (a >= b) ? ((b >= c) ? (a + b) : (a + c))
                           : ((a >= c) ? (b + a) : (b + c));
        return sum;
    }

//    Задание №6. Операторы сравнения. Условные операторы
//    Дано целое число. Не используя логические операторы, определите и выведите его
//    строку-описание вида:
//      – «нулевое число»;
//      – «положительное четное число»;
//      – «положительное нечетное число»;
//      – «отрицательное четное число»;
//      – «отрицательное нечетное число».
    static void met6(int a){
        String str;
        if (a == 0) {
            System.out.println("нулевое число");
            return;
        }
        if (a % 2 == 0) {
            str = (a > 0) ? "положительное четное число" : "отрицательное четное число";
        }
        else {
            str = (a > 0) ? "положительное нечетное число" : "отрицательное нечетное число";
        }
        System.out.println(str);
    }

//    Задание №7. Логические операторы. Условные операторы
//    Даны два целых числа: A, B. Проверьте истинность высказывания: «Справедливы
//    неравенства A > 2 и B ≤ 3».
    static void met7 (int a, int b) {
        System.out.println("A > 2 и B ≤ 3: " + ((a > 2) && (b <= 3)));
    }

//    Задание №8. Логические операторы. Условные операторы
//    Даны три целых числа: A, B, C. Проверьте истинность высказывания: «Справедливо двойное
//    неравенство A < B < C».
    static void met8 (int a, int b, int c) {
    System.out.println("A < B < C: " + ((a < b) && (b < c)));
    }

//    Задание №9. Логические операторы. Условные операторы
//    Даны четыре целых числа, одно из которых отлично от трех других, равных между собой.
//    Определите порядковый номер числа, отличного от остальных.
    static void met9 (int a1, int a2, int a3, int a4) {
        int index;
        index = (a1 != a2) ?
                ((a1 != a3) ? 1 : 2) :
                ((a1 != a3) ? 3 : 4);
        System.out.println("The different element has index = " + index);
    }

//    Задание №10. Условные операторы
//    Дано целое число K. Выведите строку-описание оценки, соответствующей числу K (1 –
//    «плохо», 2 – «неудовлетворительно», 3 – «удовлетворительно», 4 – «хорошо», 5 –
//    «отлично»). Если K не лежит в диапазоне 1–5, то вывести строку «ошибка».
    static void met10 (int k) {
        switch (k) {
            case 1:
                System.out.println("плохо");
                break;
            case 2:
                System.out.println("неудовлетворительно");
                break;
            case 3:
                System.out.println("удовлетворительно");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 5:
                System.out.println("отлично");
                break;
            default:
                System.out.println("ошибка");
                break;
        }
    }

//      Задание №11. Условные операторы
//      Дан номер месяца – целое число в диапазоне 1-12 (1 – январь, 2 – февраль и т.д.). Выведите
//      название соответствующего времени года (зима, весна, лето, осень).
    static void met11 (int m) {
        switch (m) {
            case 1: case 2: case 12:
            System.out.println("зима");
            break;
        case 3: case 4: case 5:
            System.out.println("весна");
            break;
        case 6: case 7: case 8:
            System.out.println("лето");
            break;
        case 9: case 10: case 11:
            System.out.println("осень");
            break;
        default:
            System.out.println("ошибка");
            break;
        }
    }

//    Задание №12. Условные операторы
//    Арифметические действия над числами пронумерованы следующим образом: 1 – сложение, 2
//    – вычитание, 3 – умножение, 4 – деление. Дан номер действия N (целое число в диапазоне
//    1–4) и вещественные числа A и B (В не равно 0). Выполните над числами указанное действие
//    и выведите результат.
    static void met12 (int x, double a, double b) {
        switch (x) {
            case 1:
                System.out.println("a + b = " + (a + b));
                break;
            case 2:
                System.out.println("a - b = " + (a - b));
                break;
            case 3:
                System.out.println("a x b = " + (a * b));
                break;
            case 4:
                if (b != 0) System.out.println("a / b = " + (a / b));
                else System.out.println("/ by zero");
                break;
            default:
                System.out.println("ошибка");
                break;
        }
    }

//    Задание №13. Циклы (for)
//    Даны два целых числа A и B (A < B). Выведите в порядке возрастания все целые числа,
//    расположенные между A и B (включая сами числа A и B), а также количество N этих чисел.
    static void met13(int a, int b) {
        int count = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
                count++;
            }
            System.out.println("\nCount of numbers is " + count);
        }
        else System.out.println("A must be less B");
    }

//    Задание №14. Циклы (for)
//    Даны два целых числа A и B (A < B). Найдите сумму всех целых чисел от A до B
//    включительно.
    static int met14(int a, int b) {
        int sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                 sum += i;
            }
            return sum;
        }
        else {
            System.out.println("A must be less B");
            return sum;
        }
    }

//    Задание №15. Циклы (for)
//    Дано целое число N (N > 0). Найдите произведение N! = 1 * 2 * … * N.
    static int met15(int n) {
        if (n > 0) {
            int fact;
            fact = 1;
            for (int i = 0; i < n; i++)
                fact *= (i + 1);
            return fact;
        }
        else return -1;
    }

//    Задание №16. Циклы (while)
//    Даны положительные числа A и B (A > B). На отрезке длины A размещено максимально
//    возможное количество отрезков длины B (без наложений). Не используя операции умножения
//    и деления, найдите длину незанятой части отрезка A.
    static double met16(double a, double b) {
        if (a > b) {
        while (a >= b) {
            a -= b;
        }
        return a;}
        else return -1;
    }

//    Задание №17. Циклы (while)
//    Дано целое число N (N > 1). Найдите наименьшее целое число K, при котором выполняется
//    неравенство 3 * K > N.
    static int met17(int n) {
        if (n > 1) {
        int k;
        k = 0;
        while (3 * ++k <= n) ;
        return k;}
        else return -1;
    }

//    Задание №18. Циклы (while)
//    Дано целое число N (>0). Используя операции деления нацело и взятия остатка от деления,
//    выведите все его цифры, начиная с самой правой (разряда единиц).
    static void met18(int n) {
        if (n > 0) {
            while (n > 0) {
                System.out.print(n % 10);
                n = (n - n % 10) / 10;
            }
        }

        // ниже закоментен код перевода числа в двоичное число (не внимательно прочитал задание! =) )
//        if (n > 0) {
//            int x;
//            String temp;
//            temp = "";
//            while (n != 0) {
//                x = n % 2;
//                temp = x + temp;
//                n /= 2;
//            }
//            System.out.print(temp);
//        }
    }

//    Задание №19. Циклы
//    Даны целые числа A и B (A < B). Выведите все целые числа от A до B включительно; при этом
//    число A должно выводиться 1 раз, число A + 1 должно выводиться 2 раза и т.д.
    static void met19(int a, int b) {
        if (a < b) {
            for (int i = 0; i < (b - a + 1); i++) {
                for (int j = 1; j <= (i + 1); j++)
                System.out.print(a + i + " ");

            }
        }
        else System.out.println("A must be less B");
    }


}
