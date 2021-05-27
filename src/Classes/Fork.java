package Classes;

import Utils.RomanToArabic;

public class    Fork {
    public static String[] arabicFork(String[] array) {
        Arabic.calculated(array);

        return array;
    }

    public static String[] romanFork(String[] array) {
        array[0] = String.valueOf(RomanToArabic.romanToArabic(array[0]));
        array[2] = String.valueOf(RomanToArabic.romanToArabic(array[2]));
        Roman.calculated(array);
        return array;
    }

}
