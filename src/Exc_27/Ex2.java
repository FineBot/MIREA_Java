package Exc_27;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {
    public Ex2() {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println("Введите строку:");
        n=sc.nextLine();
        Pattern pattern=Pattern.compile("^(a(b(c(d(e(f(g(h(i(j(k(l(m(n(o(p(q(r(s(t(u(v(w(x(y(1(8(3(4(0)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)?)$");
        Matcher matcher=pattern.matcher(n);
        if(matcher.find())
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
