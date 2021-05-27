package Classes;

import Exceptions.ArabicOrRoman;

import java.io.IOException;

public class Separator {
    public static String[] major() {

        String[] input = Input.input();
        String x = input[0];
        String y = input[2];

        if (x.matches("\\d*")) {
            if (y.matches("\\d*")) {
                return Fork.arabicFork(input);
            }
            try {
                throw new ArabicOrRoman("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно");
            } catch (ArabicOrRoman arabicOrRoman) {
                arabicOrRoman.printStackTrace();
            }
        }
        if (x.matches("X*|V|IV|VI|VII|VIII|IX|I*")) {
            if (y.matches("X*|V|IV|VI|VII|VIII|IX|I*")) {
                return Fork.romanFork(input);
            }
            try {
                throw new ArabicOrRoman("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно");
            } catch (ArabicOrRoman arabicOrRoman) {
                arabicOrRoman.printStackTrace();
            }
        }
        try {
            throw new IOException("Ввод неподходящих чисел");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

}
