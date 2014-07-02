package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zhangyb on 14-6-30.
 */
public class dateUtils {
    private static String format = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) {
        showToday();
    }

    public static void showToday() {
        SimpleDateFormat fmt = new SimpleDateFormat(format);
        System.out.println(fmt.format(new Date()));
    }
}
