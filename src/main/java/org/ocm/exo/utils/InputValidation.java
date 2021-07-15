package org.ocm.exo.utils;

import org.apache.commons.validator.routines.DateValidator;
import org.apache.commons.validator.routines.IntegerValidator;
import org.apache.commons.validator.routines.UrlValidator;

import java.time.LocalDate;
import java.util.Date;

public class InputValidation {

    public static void validateInt(String n) {
        IntegerValidator intValidator = new IntegerValidator();
        Integer res = intValidator.validate(n);
        if (res != null) {
            System.out.printf("Value %s IS valid number%n", n);
        } else {
            System.out.printf("Value %s IS NOT valid number%n", n);
        }
    }

    public static void validateDate(String d) {
        DateValidator dateValidator = new DateValidator();
        Date date = dateValidator.validate(d);
        if (date != null) {
            System.out.printf("Value %s IS a valid date%n", d);
        } else {
            System.out.printf("Value %s IS NOT valid date%n", d);
        }
    }

    public static void validateURL(String u) {
        String[] schemes = {"http","https"};
        UrlValidator urlValidator = new UrlValidator(schemes);
        if (urlValidator.isValid(u)) {
            System.out.printf("Value %s IS a valid URL%n", u);
        } else {
            System.out.printf("Value %s IS NOT valid URL%n", u);
        }
    }

    public static void validateFutureDay(int year, int month, int day){
        LocalDate ld = LocalDate.of(year, month, day);
        if (LocalDate.now().isAfter(ld)) {
            System.out.printf("Value %s IS a valid date - after today%n", ld);
        } else {
            System.out.printf("Value %s IS NOT valid date - before today%n", ld);
        }
    }

}
