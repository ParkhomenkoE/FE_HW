package lesson.homework;

public class Main {
    public static void main(String[] args) {
        // локальная переменная
        /*byte
                short
                        int
                                long*/
        //byte byteValue = 120;
        byte value = 127;
        short shortValue = 32535;
        int intValue = 2_000_000_000;
        long peopleCountInEarth = 800L;

        /*
        * 
        * First level: 
        */

        /*First level: Задание 1.
        В методе main инициализировать все целочисленные примитивные типы 
        и вывести их в консоль в примерном виде "Переменная с типом 
        <Здесь вы выводите название типа переменной>
        и названием <Здесь вы выводите название вашей переменной>
        имеет значение равное <Здесь вы выводите значение вашей переменной>"
        */
        System.out.println("Задание 1");
        //щоб кілька разів не писать одне й те саме зробимо кілька змінних для строчок
        String message1 = "Переменная с типом ";
        String message2 = " и названием ";
        String message3 = " имеет значение равное ";
        //а так як змінні вже є вище  просто використаємо їх
        System.out.println(message1+"byte"+message2+"value"+message3);
        System.out.println(value); //Виводимо значення самої змінної
        //... аналогічно для кожної
        System.out.println(message1+"short"+message2+"shortValue"+message3);
        System.out.println(shortValue);
        System.out.println(message1+"int"+message2+"intValue"+message3);
        System.out.println(intValue);
        System.out.println(message1+"long"+message2+"peopleCountInEarth"+message3);
        System.out.println(peopleCountInEarth);

        /*Задание 2.
        Напишите программу, которая выводит на экран сумму двух чисел.
        54 + 16
        */
        System.out.println("Задание 2");
        System.out.println(54+16); // шоб не об'являть змінну - просто виконуємо операції зразу "на друк"
        
        /*Задание 3.
        Напишите программу, которая выводит на экран результат деления двух чисел.
        50/3
        */
        System.out.println("Задание 3");
        System.out.println(50/3); // тут непонятно, треба Float чи можна й так - цілочисленне
        
        /*Задание 4.
        Напишите программу, которая выводит на экран значение переменной типа int  
        в квадрате (n* n). Предварительно объявите эту переменную и задайте ее значение.
        */
        System.out.println("Задание 4");
        int toSqrt = 5; //створюємо змінну
        System.out.println(toSqrt*toSqrt);// виконуємо оперцію сразу в друк на консоль

        /*
        Second level: Объявите 10 переменных типа int со значениями 
        0,1, 2, 3, 4, 5, 6, 7, 8, 9. Объявите ещё одну переменную int
        и сохраните в неё сумму этих переменных, деленную на 10. Получается, 
        у вас будет среднее арифметическое этих чисел в одной переменной. 
        Распечатайте её через println. 
        */
        System.out.println("Second level");
        int zero = 0, one = 1, two = 2, three = 3, four = 4, five = 5, six = 6,
        seven = 7, eight = 8, nine = 9; 
        int avge; //об'являємо, але пока нічого не присваюємо
        avge = (zero+one+two+three+four+five+six+seven+eight+nine)/10; //присваєюмо результат математичної операції
        System.out.println(avge); // і друкуємо його

    }
}