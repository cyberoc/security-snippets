package org.ocm.exo;

import org.ocm.exo.utils.InputValidation;

public class Main {

    public static void main(String[] args) {
        InputValidation.validateInt("10");
        InputValidation.validateInt("NaN");

        InputValidation.validateDate("06/06/2016");
        InputValidation.validateDate("13/13/2013");

        InputValidation.validateURL("https://www.google.com");
        InputValidation.validateURL("ftp://www.google.com");

        InputValidation.validateFutureDay(2020, 12, 12);
        InputValidation.validateFutureDay(2020, 1, 1);
    }
}
