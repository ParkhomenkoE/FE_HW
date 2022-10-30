package homework.hw2;

public class Massiv {
    public static void main(String[] args) {

        float way = 0;
        int time = 0;
        while (way < 15) {
            time = time + 30;
           way = (float) ((time * 42) /3600);
            System.out.println("Время движения автобуса = " + time + " cек");
            System.out.println("Пройденное расстояние = " + way + " км");

        }
        System.out.println("Общее время движения автобуса = " + (time/60) + " мин");


        int[] arrayInts1 = {12, 1, 32, 90, 10, 11, 30, 49, 33, 34, 27, 7, 21};
        int countOdd = 0;
        for (int index = 0; index < arrayInts1.length; index++) {   //перебираем каждую ячейку массива
            if ((arrayInts1[index]/2) * 2 != arrayInts1[index]) {     //определяем четное число или нет
                countOdd++;         //считаем нечетные числа, для определения длины массива нечетных чисел
            }
        }
        int[] arrayOdd = new int[countOdd];  // создали новый массив длиной равной количеству нечетных чисел
        countOdd = 0;   //обнуляем счетчик нечетных чисел
        int maxValue = 0;  // объявили переменную, которой присвоили ноль, с ней будем сравнивать нечетные числа
        for (int index = 0; index < arrayInts1.length; index++) {  // перебираем массив в поиске нечтных чисел
            if ((arrayInts1[index]/2) * 2 != arrayInts1[index]) {
                arrayOdd[countOdd] = arrayInts1[index];   //заполняем новый массив найденными нечетными числами
                System.out.println(arrayOdd[countOdd]);  // выводим на печать массив
                if (maxValue < arrayOdd[countOdd]) {    //сравниваем найденное нечетное число с предыдущим максимальным
                    maxValue = arrayOdd[countOdd];  //запоминаем максимальное нечетное число
                }
                countOdd++; //увеличиваем счетчик индекса нового массива на единицу

            }
        }
        System.out.println("Cамое большое нечетное число " + maxValue );

    }

}
