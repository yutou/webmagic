package us.codecraft.webmagic.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pro-daitr on 16/12/13.
 */
public class GenSpiderIdUtils {
    private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

    public static long generateDefaultId() {
        return Long.valueOf(sdf.format(new Date()));
    }


    public static void main(String[] args) {
        System.out.println(generateDefaultId());
    }

}
