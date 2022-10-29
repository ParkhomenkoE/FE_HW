package homework.hw2;
//Создать программу, которая на экран выводить рекомендацию на основании того, сколько часов осталось до сна, если известно, что спать надо ложиться в 22 часа. Причем сообщения необходимо формировать по следующим строгим правилам
import java.util.Scanner;

public class Clock {

    public static void main(String[] args) {

        int enter;  // створюємо змінну, в яку зберігатимемо введене число
        Scanner input = new Scanner(System.in); //створюється обєкт який приймає ввод з клавіатури

        System.out.println("Bведите время");
        enter = input.nextInt();
        alarm(enter);

    }

    public static void alarm (int time) {

        if ((time > 23 ) | (time < 0)) {
            System.out.println(" Введите целое число от 0 д до 23");
            return;
        }
        int different = 22 - time;
        if (different > 16) {
            System.out.println("Сейчас самое время спать");
            return;
        }
        if ((different >10) | (different == 16)) {
            System.out.println("Не переживайте, до сна больше 10 часов");
            return;

        }
        if ((different < 7) & (different > 3)) {
            System.out.println("До сна осталось меньше 7 часов");
            return;
        }
        if (different < 1) {
            System.out.println("Время ложиться спать. Конец дня!");
        }
        switch (different) {
            case 3: {
                System.out.println("До сна 3 часа, если вы голодные, то надо успеть перекусить");
                break;
            }
            case 2: {
                System.out.println("До сна 2 часа, завершайте выполнение текущей работы");
                break;
            }
            case 1: {
                System.out.println("До сна 1 час, посмотрите перед сном что-то интересное или почитайте");
                break;
            }
            default: {
                System.out.println(" До сна осталось " + different + " часов" );
            }
        }
    }
}
