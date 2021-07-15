package org.ocm.exo;

import org.ocm.exo.utils.InputValidation;
import org.ocm.exo.utils.StringValidation;

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

        InputValidation.validateEmail("amazon@amazon.com");
        InputValidation.validateEmail("amazon@amazon@aws.com");

        StringValidation.validateLength("Test");
        StringValidation.validateLength("本田茂");

        StringValidation.regExFileName("file&name");
        StringValidation.regExFileName("file-name.zip");
    }
}
