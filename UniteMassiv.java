package homework.hw2;

public class UniteMassiv {

    public static void main(String[] args) {

        int[] massiv1 = {2, 3, 1, 6, 7, 4 };
        int[] massiv2 = {20, 1, 33, 2, 55 };
        int[] massiv3 = {2, 0, 1, 6, 7, 4 };
        int[] massiv4 = {20, 1, 0, 2, 55, 6, 7 };

        System.out.println("Задача 1");

        printArray(mergeArray(massiv1, massiv2));
        System.out.println(" ");

        System.out.println("Задача 2");

        printArray(difArray(massiv3, massiv4));
    }
    private static int[] mergeArray(int[] Array1, int[] Array2) {
        int[] tempArray = new int[Array1.length + Array2.length];
        for (int i = 0; i < Array1.length; i++) {
            tempArray[i] = Array1[i];
        }
        for (int i = 0; i < Array2.length; i++) {
            tempArray[i + Array1.length] = Array2[i];
        }
        return tempArray;
    }

    private static int[] difArray(int[] Array1, int[] Array2) {
        int[] tempArray = new int[Array1.length + Array2.length];
        int k = 0;
        boolean isFind = true;
        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array2.length; j++) {
                if (Array1[i] == Array2[j]){
                    isFind = true;
                    break;
                } else isFind = false;
            }
            if (!isFind) {
                tempArray[k] = Array1[i];
                k++;
            }
        }
        for (int i = 0; i < Array2.length; i++) {
            for (int j = 0; j < Array1.length; j++) {
                if (Array2[i] == Array1[j]){
                    isFind = true;
                    break;
                } else isFind = false;
            }
            if (!isFind) {
                tempArray[k] = Array2[i];
                k++;
            }
        }
        int[] tempArrayShort = new int[k];
        for (int i = 0; i < tempArrayShort.length; i++) {
            tempArrayShort[i] = tempArray[i];
        }
        return tempArrayShort;
    }
    private static void printArray(int[] toprint) {
        for(int number: toprint) {
            System.out.print(number + " ");
        }
    }

}
