package Exc_24;
import java.util.Scanner;
public class Ex2 implements LabClassUI {

    @Override
    public void setNameandSort() throws EmptyLineException,IncorrectFormatException {
        int[] mark = new int[15];
        String[] name = new String[15];

        for (int i = 0; i < 15; i++) {
            String str = "";
            mark[i] = (int) ((Math.random()) * 100);
            int b = (int) ((Math.random()) * 15);
            switch (b) {
                case 1:
                    str = "Марк";
                    break;
                case 2:
                    str = "Дмитрий";
                    break;
                case 3:
                    str = "Ярослав";
                    break;
                case 4:
                    str = "Владимир";
                    break;
                case 5:
                    str = "Александр";
                    break;
                case 6:
                    str = "Никита";
                    break;
                case 7:
                    str = "Ашот";
                    break;
                case 8:
                    str = "Антон";
                    break;
                case 9:
                    str = "Алексей";
                    break;
                case 10:
                    str = "Алик";
                    break;
                case 11:
                    str = "Валерий";
                    break;
                case 12:
                    str = "Пётр";
                    break;
                case 13:
                    str = "Михаил";
                    break;
                case 14:
                    str = "Марк";
                    break;
                case 0:
                    str = "Боб";
                    break;
            }

            b = (int) ((Math.random()) * 15);
            switch (b) {
                case 1:
                    str += " Кузнецов";
                    break;
                case 2:
                    str += " Федоров";
                    break;
                case 3:
                    str += " Иванов";
                    break;
                case 4:
                    str += " Рабинович";
                    break;
                case 5:
                    str += " Романов";
                    break;
                case 6:
                    str += " Бугаев";
                    break;
                case 7:
                    str += " Огурцов";
                    break;
                case 8:
                    str += " Цветов";
                    break;
                case 9:
                    str += " Зозо";
                    break;
                case 10:
                    str += " Шубин";
                    break;
                case 11:
                    str += " Трубецкой";
                    break;
                case 12:
                    str += " Гагарин";
                    break;
                case 13:
                    str += " Мишустин";
                    break;
                case 14:
                    str += " Каламецев";
                    break;
                case 0:
                    str += " Корнилов";
                    break;
            }
            name[i] = str;
            System.out.print(mark[i] + " " + name[i] + "\n");
        }
        System.out.print("\n\nSorted array\n");
        for (int i = 0; i < 15; i++) {
            System.out.println(mark[i] + " " + name[i]);
        }
        Scanner myScanner = new Scanner(System.in);
        String class1 = null;

        System.out.println("Кого вы хотите найти?");
        class1 = myScanner.nextLine();
        if (class1 == "") {
            throw new EmptyLineException("Your Line is Empty!");
        }
        int flag=-1;
        for (int i = 0; i < 15; i++) {
            if(name[i].contentEquals(class1)){
                flag=i;
            }
        }
        if (flag==-1){
                throw new IncorrectFormatException("Not found");
            }else{
            System.out.print(mark[flag] + " " + name[flag] + "\n");

        }
        }
    }





