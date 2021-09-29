package Exc_6;

import java.util.ArrayList;
import java.util.Comparator;



class testClass implements Comparator {

    String getRandName(){
        int b=0;
        String str="";
        b=(int)((Math.random())*15);
        switch (b)
        {
            case 1: str="Марк"; break;
            case 2: str="Дмитрий"; break;
            case 3: str="Ярослав"; break;
            case 4: str="Владимир"; break;
            case 5: str="Александр"; break;
            case 6: str="Никита"; break;
            case 7: str="Ашот"; break;
            case 8: str="Антон"; break;
            case 9: str="Алексей"; break;
            case 10: str="Алик"; break;
            case 11: str="Валерий"; break;
            case 12: str="Пётр"; break;
            case 13: str="Михаил"; break;
            case 14: str="Марк"; break;
            case 0: str="Боб"; break;
        }

        b=(int)((Math.random())*15);
        switch (b)
        {
            case 1: str+=" Кузнецов"; break;
            case 2: str+=" Федоров"; break;
            case 3: str+=" Иванов"; break;
            case 4: str+=" Рабинович"; break;
            case 5: str+=" Романов"; break;
            case 6: str+=" Бугаев"; break;
            case 7: str+=" Огурцов"; break;
            case 8: str+=" Цветов"; break;
            case 9: str+=" Зозо"; break;
            case 10: str+=" Шубин"; break;
            case 11: str+=" Трубецкой"; break;
            case 12: str+=" Гагарин"; break;
            case 13: str+=" Мишустин"; break;
            case 14: str+=" Каламецев"; break;
            case 0: str+=" Корнилов"; break;
        }
        return str;
    }
    ArrayList<Student> array= new ArrayList<Student>();

    public static void insertionSort(ArrayList<Student> array) {
        for (int i = 1; i < array.size(); i++) {
            Student current = array.get(i);
            int j = i - 1;
            while (j >= 0 && current.mark < array.get(j).mark) {
                array.set(j+1,array.get(j)) ;
                j--;
            }
            array.set(j+1,current);
        }
    }
    testClass() {
        for (int i = 0; i < 15; i++) {
            array.add(new Student((int) ((Math.random()) * 100),getRandName()));
        }

    }
    public String toString() {
        String buff = "";
        for (int i = 0; i < array.size(); i++) {
            buff += " " + array.get(i);
        }
        return buff;
    }
    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}


public class main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        testClass first = new testClass();
        testClass.insertionSort(first.array);
        System.out.println(first.toString());

        System.out.println("");
        System.out.println("Задание 2");
        SortingStudentByGPA second = new SortingStudentByGPA();
        second.sort();

        System.out.println("");
        System.out.println("Задание 3");
        WithMergeSort third = new WithMergeSort();
        System.out.println("Первый массив:");
        System.out.println(third.array.toString());
        System.out.println("Второй массив:");
        System.out.println(third.array2.toString());
        System.out.println("После сортировки слиянием:");
        System.out.println(third.sort());
    }
}
