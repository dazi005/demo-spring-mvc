package iunsuccessful.demo.common.utils;

import java.util.Date;
import java.util.Random;

/**
 * @author LiQZ on 2016/4/11.
 */
public class DataUtils {

    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Date date = new Date(1460345907000L);
//        Instant.now(Clock.)
//        System.out.println(DateFormat.);
    }

}
