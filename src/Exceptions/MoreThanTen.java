package Exceptions;

import java.io.IOException;

public class MoreThanTen extends IOException {
    public MoreThanTen(String message) {
        super(message);
    }

}
