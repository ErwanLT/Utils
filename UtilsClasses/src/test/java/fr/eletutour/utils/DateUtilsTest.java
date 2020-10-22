package fr.eletutour.utils;

import fr.eletutour.CommonForTest;
import fr.eletutour.utils.dates.DateFormatConstantes;
import fr.eletutour.utils.dates.DateUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

public class DateUtilsTest extends CommonForTest {

    private Date date;

    @Before
    public void init(){
        date = new Date(1603359506000L);
    }

    @Test
    public void getDateYearTest(){
        assertThat(DateUtils.getDateYear(date)).isEqualTo(2020);
    }

    @Test
    public void getDateMonthTest(){
        assertThat(DateUtils.getDateMonth(date)).isEqualTo(10);
    }

    @Test
    public void getTodayTest(){
        Date d = DateUtils.getToday();
        Date today = new Date();
        assertThat(d.getYear()).isEqualTo(today.getYear());
        assertThat(d.getMonth()).isEqualTo(today.getMonth());
        assertThat(d.getDate()).isEqualTo(today.getDate());
    }

    @Test
    public void formatDateTest(){
        assertThat(DateUtils.formatDate(date, DateFormatConstantes.DATE_FORMAT_DD_MM_YYYY)).isEqualTo("22/10/2020");
        assertThat(DateUtils.formatDate(date, DateFormatConstantes.DATE_FORMAT_DD_EEEE_d_MMM_yyyy)).isEqualTo("jeudi, 22 oct. 2020");
    }

    @Test
    public void formatDateLocaleTest(){
        assertThat(DateUtils.formatDateLocale(date, DateFormatConstantes.DATE_FORMAT_DD_EEEE_d_MMM_yyyy, Locale.ENGLISH)).isEqualTo("Thursday, 22 Oct 2020");
        assertThat(DateUtils.formatDateLocale(date, DateFormatConstantes.DATE_FORMAT_DD_EEEE_d_MMM_yyyy, Locale.CHINA)).isEqualTo("星期四, 22 10月 2020");
    }
}
