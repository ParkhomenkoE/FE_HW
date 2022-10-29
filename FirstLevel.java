package homework.hw2;
// Задание 1.
//Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные valueOne и valueTwo.
public class FirstLevel {
    public static void main(String[] args) {
        System.out.println("rtyu");

        int valueOne = -1;
        int valueTwo = 11;
        int nearTen, delta1, delta2;

        if (valueOne <= 10) {
            delta1 = 10 - valueOne;
        }
        else {
            delta1 = valueOne - 10;
        }
        if (valueTwo <= 10) {
            delta2 = 10 - valueTwo;
        }
        else {
            delta2 = valueTwo - 10;
        }
        if (delta1 > delta2) {
            nearTen = valueTwo;
        }
        else {
            nearTen = valueOne;
        }

        System.out.println(nearTen);
    }

}
