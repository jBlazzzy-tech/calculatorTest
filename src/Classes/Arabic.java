package Classes;

import Exceptions.MoreThanTen;

import java.io.IOException;

public class Arabic {

    public static void calculated(String[] array) {
        int x = Integer.parseInt(array[0]);
        int y = Integer.parseInt(array[2]);
        String operator = array[1];
        if (x >= 11 || y >= 11) {
            try {
                throw new MoreThanTen("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более");
            } catch (MoreThanTen moreThanTen) {
                moreThanTen.printStackTrace();
            }
        } else {
            switch (operator) {
                case "+":
                    System.out.println(x + y);
                    break;
                case "-":
                    System.out.println(x - y);
                    break;
                case "*":
                    System.out.println(x * y);
                    break;
                case "/":
                    System.out.println(x / y);
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
