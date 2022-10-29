package homework.hw2;
//Задание 2.
//Создать программу, которая определяет четное число или нет. Должен быть метод, который принимает целочисленное значение и в результате работы метод должен вернуть булевую переменную либо true либо false. Задача должна быть решена 2 способами. Первый - при помощи конструкции if-else, второй способ - при помощи конструкции switch case.
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        boolean even;
        int enter;  // створюємо змінну, в яку зберігатимемо введене число
        Scanner input = new Scanner(System.in); //створюється обєкт який приймає ввод з клавіатури

        System.out.println("Bведите любое целое число");
        enter = input.nextInt(); //введене значення передається в змінну enter
        even = even(enter);//в метод передається число enter, яке метод бачить як numer
        System.out.println(even);


    }
    public static boolean even(int numer) {  //сам метод
    int valueInt;
    valueInt = numer/2;
    if (numer ==  valueInt * 2) {
        return true;
    }
    else return false;
    }



}
