package Exc_12;

import java.lang.StringBuilder;
import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

public class Ex5 {
    public Ex5() {

        ArrayList<String> arrstr = new ArrayList<String>();
        try (FileReader reader = new FileReader("notes3.txt")) {
            String str = "";
            char k;
            int c;
            while ((c = reader.read()) != -1) {
                if ((Character.isLetter((char) c))) {
                    str += (char) c;
                } else {
                    if (str.length() > 0) {
                        arrstr.add(str);
                        str = "";
                    }
                }
            }


            char n = ' ';
            char m = ' ';
            String str1;
            Boolean flag = false;
            for (int i = 0; i < arrstr.size(); i++) {
                n = arrstr.get(i).toLowerCase().charAt(arrstr.get(i).length() - 1);
                flag = false;
                for (int j = i + 1; j < arrstr.size(); j++) {
                    m = arrstr.get(j).toLowerCase().charAt(0);
                    if (m == n) {
                        str1 = arrstr.get(i + 1);
                        arrstr.set(i + 1, arrstr.get(j));
                        arrstr.set(j, str1);
                        flag = true;
                    }
                    if (flag) {
                        break;
                    }

                }

            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        for (int i = 0; i < arrstr.size(); i++) {
            System.out.println(arrstr.get(i));
        }
    }
}
