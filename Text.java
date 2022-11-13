package homework.hw2;

import java.util.Arrays;
// Задание 1.
//Дан произвольный текст. Создать метод, который на вход принимает данных текст,
// на выходе отдает массив, который будет содержать слова длинной больше 7 символов,
// причем первая и последняя буква должны быть изменены на большие.
//Например дан текст: "Это предложение содержит какие-то слова с большой длиной".
// В результате работы метод должен отдать массив такого вида:
//["ПредложениЕ", "СодержиТ", "Какие-тО", "БольшоЙ"]

public class Text {

    public static void main(String[] args) {
        String text = "Это предложение содержит какие-то слова с большой длиной";
        printStringArray(moreSevenWordArray(text));
        String text1 = "Привет этот дивный мир";
        reverse(text1);

    }

    public static String[] moreSevenWordArray(String text) {
        String[] array = text.split(" ");
        String[] tempArray = new String[array.length];
        int t = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > 7) {
                //tempArray[t] = array[i];
                String play = array[i];
                tempArray[t] = sideUpperCase(play);
                t++;
            }
        }
        //printStringArray(tempArray);
        String[] tempArrayShort = new String[t];
        for (int i = 0; i < tempArrayShort.length; i++) {
            tempArrayShort[i] = tempArray[i]; 
        }
        //printStringArray(tempArrayShort);

        return tempArrayShort;
    }

    public static void printStringArray(String[] toprint) {
        for (String number : toprint) {
            System.out.print(number + " ");
        }
        System.out.println(" ");

    }
    public static String sideUpperCase(String word) {
        String tempString;
        String firstLetter;
        String lastLetter;
        firstLetter = word.substring(0,1);
        lastLetter = word.substring(word.length()-1,word.length());
        tempString = word.substring(1,word.length()-1);
        firstLetter = firstLetter.toUpperCase();
        lastLetter = lastLetter.toUpperCase();

        //System.out.println(firstLetter + tempString + lastLetter);

        return firstLetter + tempString + lastLetter;


    }
    public static String reverse(String text) {
        String tempReserve = text.substring(text.length() - 1, text.length());
        for (int i = text.length()-1; 0 < i; i--) {
            tempReserve = tempReserve + text.substring(i - 1, i);

        }
        System.out.println(tempReserve);
        return tempReserve;
    }


}