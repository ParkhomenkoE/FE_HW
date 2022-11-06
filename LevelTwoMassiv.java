package homework.hw2;

public class LevelTwoMassiv {

    public static void main(String[] args) {
        int[] Array1 = {2, 0, 1, 6, 7, 4, 1, 22, 1, 0, 1, 2, 1, 6, 15, 4, 1};
        System.out.println("Задача 3. Уровень 2.");
        printArray(uniqueVal(Array1));
    }
    private static int[] uniqueVal(int[] arrayDef){
        int[] tempArray = new int[arrayDef.length];
        int k = 0;
        boolean isFind = true;
        // сравниваем массив сам с собой
        for (int i = 0; i < arrayDef.length; i++) {
            for (int j = 0; j < arrayDef.length; j++) {
                if ((arrayDef[i]==arrayDef[j])&(i>j)) { // нашел такое же значение, но уже в проверенных ячейках i>j значит пропускаем

                    isFind = true; //нашли
                    break; // и выходим
                } else isFind = false; //такого значения не было
            }
            if (!isFind) { //т.к. такого еще не было
                tempArray[k] = arrayDef[i]; //сохраняем
                k++;// номер следующей ячейки для временного массива
            }
        }
        return tempArray;
    }

    private static void printArray(int[] toprint) {
        for(int number: toprint) {
            System.out.print(number + " ");
        }
    }
}






