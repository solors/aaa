package p636d7;

import java.util.Calendar;

/* renamed from: d7.b */
/* loaded from: classes5.dex */
public class DateUtil {
    /* renamed from: a */
    public static double m25711a(long j, long j2) {
        return ((float) (j2 - j)) / 3600000.0f;
    }

    /* renamed from: b */
    public static boolean m25710b(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar2.setTimeInMillis(j2);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return true;
        }
        return false;
    }
}
