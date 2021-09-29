package Exc_6;

import java.util.ArrayList;
import java.util.Comparator;

class Student{
    int mark;
    String name;
    public Student(int mark,String name){
        this.mark=mark;
        this.name=name;
    }
    public String toString(){
        return this.mark+" - "+this.name+";";
    }
}

public class SortingStudentByGPA {
    ArrayList<Student> array= new ArrayList<Student>();

    public int Comparator(Student first, Student second) {
        return first.mark==second.mark?(0):(
                first.mark>second.mark?(1):(-1)
        );
    }

    public void quickSort(int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = array.get((leftMarker + rightMarker) / 2);
        do {
            while (Comparator(array.get(leftMarker), pivot)==1) {
                leftMarker++;
            }
            while (Comparator(array.get(rightMarker),pivot)==-1) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student tmp = array.get(leftMarker);
                    array.set(leftMarker,array.get(rightMarker));
                    array.set(rightMarker,tmp);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(leftBorder, rightMarker);
        }
    }

    SortingStudentByGPA(){
        int b;
        String str="";
        for (int i = 0; i < 15; i++)
        {

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
            array.add(new Student((int)((Math.random())*100),str));
            System.out.println(array.get(i).toString());
        }

    }
    public void sort(){
        quickSort(0, 14);
        System.out.print("\n\nSorted array\n");
        for (int i=0;i<15;i++)
        {
            System.out.println(array.get(i).toString());
        }
    }


}
