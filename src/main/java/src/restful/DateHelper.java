package src.restful;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Svirin2-DA on 10.12.2018.
 */
public class DateHelper {

    public static String getTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

}
