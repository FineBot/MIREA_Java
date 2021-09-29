package Exc_5;


import java.util.Scanner;


public class main {
    static void n2(int n) {
        System.out.println("Задание 2");
        System.out.print("1 ");
        n2(n, 2);
    }

    static void n2(int n, int i) {
        System.out.print(i + " ");
        if (i < n) {
            i++;
            n2(n, i);
        }
    }

    static void n3(int a, int b) {
        if (b < a) {
            System.out.print(a + " ");
            a--;
            n3(a, b);
        } else if (a < b) {
            System.out.print(a + " ");
            a++;
            n3(a, b);
        } else {
            System.out.print(a);
        }
    }

    static int getSum(int digit) {
        int sum = 0;
        while (digit > 0) {
            sum += digit % 10;
            digit /= 10;
        }
        return sum;
    }

    static void n4(int k, int s, int count, int i) {
        if ((k + i) / k == 10) {
            System.out.println(count);
        } else {
            if (getSum(k + i) == s)
                count++;
            i++;
            n4(k, s, count, i);
        }
    }

    static int n5(int digit, int sum) {
        sum += digit % 10;
        digit /= 10;
        if (digit > 0) {
            sum = n5(digit, sum);
        }
        return sum;
    }

    static void n6(int n, int i, int count) {
        if (n % i == 0) {
            count++;
        }
        if (count > 2) {
            System.out.println("NO");
        } else {
            if (i < n) {
                i++;
                n6(n, i, count);
            } else {
                System.out.println("YES");
            }
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k =0;

        n2(11);

        System.out.println("");
        System.out.println("Задание 3");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        n3(a, b);

        System.out.println("");
        System.out.println("Задание 4");
        k = scanner.nextInt();
        int s = scanner.nextInt();
        n4((int) Math.pow(10, k - 1), s, 0, 0);

        System.out.println("");
        System.out.println("Задание 5");
        k = scanner.nextInt();
        System.out.println(n5(k, 0));

        System.out.println("");
        System.out.println("Задание 6");
        k = scanner.nextInt();
        n6(k, 1, 0);
    }
}
