package fr.eletutour.utils.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Classe utilitaire pour les Dates
 *
 * @author ewanletutour
 * @since v1.0
 */
public class DateUtils {

    /**
     * get the date of the day
     * @return today
     */
    public static Date getToday(){
        return new Date();
    }

    /**
     * get the year of a date
     * @param date the input date
     * @return the year
     */
    public static int getDateYear(Date date) {
        return date.getYear() + 1900;
    }

    /**
     * get the month of a date
     * @param date the input date
     * @return the month
     */
    public static int getDateMonth(Date date) {
        return date.getMonth() + 1;
    }

    /**
     * Method to format a date to string with a given format
     * @param date the date to transform
     * @param format the format to be used
     * @return the formated date
     */
    public static String formatDate(Date date, String format){
        return formatDateLocale(date, format, Locale.FRANCE);
    }

    /**
     * Method to format a date to string with a given format and locale
     * @param date the date to transform
     * @param format the format to be used
     * @param locale the local to be used
     * @return the formated date
     */
    public static String formatDateLocale(Date date, String format, Locale locale){
        SimpleDateFormat formatter = new SimpleDateFormat(format, locale);
        return formatter.format(date);
    }
}
