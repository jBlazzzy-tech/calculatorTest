package Classes;
import Exceptions.ArabicOrRoman;
import Utils.ArabicToRoman;

import java.io.IOException;

public class Roman {

    public static void calculated(String[] array) {
        int x = Integer.parseInt(array[0]);
        int y = Integer.parseInt(array[2]);
        String operator = array[1];
        if (x >= 11 || y >= 11) {
            try {
                throw new ArabicOrRoman("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно");
            } catch (ArabicOrRoman arabicOrRoman) {
                arabicOrRoman.printStackTrace();
            }
        } else {
            switch (operator) {
                case "+":
                    int answer0 = x + y;
                    System.out.println(ArabicToRoman.arabicToRoman(answer0));
                    break;
                case "-":
                    int answer1 = x - y;
                    System.out.println(ArabicToRoman.arabicToRoman(answer1));
                    break;
                case "*":
                    int answer2 = x * y;
                    System.out.println(ArabicToRoman.arabicToRoman(answer2));
                    break;
                case "/":
                    int answer3 = x / y;
                    System.out.println(ArabicToRoman.arabicToRoman(answer3));
                    break;
                default:
                    try {
                        throw new IOException("Не соответствует одной из вышеописанных арифметических операций");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        }

    }

}