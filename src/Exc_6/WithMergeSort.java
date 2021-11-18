package Exc_6;


import java.util.ArrayList;

public class WithMergeSort {
    String getRandName() {
        int b = 0;
        String str = "";
        b = (int) ((Math.random()) * 15);
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
        return str;
    }

    ArrayList<Student> array = new ArrayList<Student>();
    ArrayList<Student> array2 = new ArrayList<Student>();

    public int Comparator(Student first, Student second) {
        return first.mark==second.mark?(0):(
                first.mark>second.mark?(1):(-1)
        );
    }

    WithMergeSort() {
        for (int i = 0; i < 7; i++)
            array.add(new Student((int) ((Math.random()) * 100), getRandName()));

        for (int i = 0; i < 7; i++)
            array2.add(new Student((int) ((Math.random()) * 100), getRandName()));
    }

    public ArrayList<Student> sort(){
        ArrayList<Student> buffArray=new ArrayList<Student>();
        for(int i = 0;i<array.size();i++)
            buffArray.add(new Student(0,"0"));

        ArrayList<Student> buffArray2=new ArrayList<Student>();
        for(int i = 0;i<array2.size();i++)
            buffArray2.add(new Student(0,"0"));

        ArrayList<Student> mergesortInner1=mergesortInner(array,buffArray,0,array.size());
        ArrayList<Student> mergesortInner2=mergesortInner(array2,buffArray2,0,array2.size());

        return mergeArray(mergesortInner1,mergesortInner2);
    }

    public ArrayList<Student> mergesortInner(ArrayList<Student> buffer1, ArrayList<Student> buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        ArrayList<Student> sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        ArrayList<Student> sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        ArrayList<Student> result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            if(Comparator(sorted1.get(index1),sorted2.get(index2))==-1){
                result.set(destIndex++,sorted1.get(index1++));
            }else{
                result.set(destIndex++,sorted2.get(index2++));

            }


        }
        while (index1 < middle) {
            result.set(destIndex++,sorted1.get(index1++));
        }
        while (index2 < endIndex) {
            result.set(destIndex++,sorted2.get(index2++));
        }
        return result;
    }

    public ArrayList<Student> mergeArray(ArrayList<Student> array,ArrayList<Student> array2) {

        ArrayList<Student> arrayC = new ArrayList<Student>();
        for (int i = 0; i < array.size() + array2.size(); i++)
            arrayC.add(new Student(0, "0"));

        int positionA = 0, positionB = 0;

        for (int i = 0; i < arrayC.size(); i++) {
            if (positionA == array.size()) {
                arrayC.set(i, array.get(i - positionA));
                positionB++;
            } else if (positionB == array2.size()) {
                arrayC.set(i, array2.get(i - positionB));
                positionA++;
            } else if (array.get(i - positionA).mark < array2.get(i - positionB).mark) {
                arrayC.set(i, array.get(i - positionA));
                positionB++;
            } else {
                arrayC.set(i, array2.get(i - positionB));
                positionA++;
            }
        }
        return arrayC;
    }
}
