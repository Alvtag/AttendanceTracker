package attendancetracker.alvinc.com.myapplication;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by alvinfong on 2017-03-22.
 */

public class Utils {
    private static final SecureRandom random = new SecureRandom();

    public static String nextId() {
        return new BigInteger(130, random).toString(32);
    }
}
