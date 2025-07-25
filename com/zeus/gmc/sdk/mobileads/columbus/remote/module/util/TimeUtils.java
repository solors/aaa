package com.zeus.gmc.sdk.mobileads.columbus.remote.module.util;

import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes8.dex */
public class TimeUtils {
    public static final int FIFTEEN_MINUTES_IN_MS = 900000;
    public static int HALF_DAY_IN_MS = 43200000;
    public static int ONE_DAY_IN_MS = 86400000;
    public static int ONE_HOUR_IN_MS = 3600000;
    public static int ONE_MINUTE_IN_MS = 60000;
    public static int ONE_SECOND_IN_MS = 1000;
    public static int ONE_WEEK_IN_MS = 604800000;
    public static int THIRTY_SECONDS_IN_MS = 30000;

    private TimeUtils() {
    }

    public static boolean expired(long j, long j2) {
        if (Math.abs(System.currentTimeMillis() - j) > j2) {
            return true;
        }
        return false;
    }

    public static String formatDate(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
        } catch (Exception unused) {
            return "";
        }
    }

    public static String formatTime(long j) {
        int i = (j > ONE_WEEK_IN_MS ? 1 : (j == ONE_WEEK_IN_MS ? 0 : -1));
        if (i >= 0) {
            return String.format("%.2f", Double.valueOf(j / ONE_WEEK_IN_MS)) + POBNativeConstants.NATIVE_IMAGE_WIDTH;
        }
        int i2 = (j > ONE_DAY_IN_MS ? 1 : (j == ONE_DAY_IN_MS ? 0 : -1));
        if (i2 >= 0 && i < 0) {
            return String.format("%.2f", Double.valueOf(j / ONE_DAY_IN_MS)) + "d";
        }
        int i3 = (j > ONE_HOUR_IN_MS ? 1 : (j == ONE_HOUR_IN_MS ? 0 : -1));
        if (i3 >= 0 && i2 < 0) {
            return String.format("%.2f", Double.valueOf(j / ONE_HOUR_IN_MS)) + "h";
        }
        int i4 = (j > ONE_MINUTE_IN_MS ? 1 : (j == ONE_MINUTE_IN_MS ? 0 : -1));
        if (i4 >= 0 && i3 < 0) {
            return String.format("%.2f", Double.valueOf(j / ONE_MINUTE_IN_MS)) + "m";
        } else if (j >= ONE_SECOND_IN_MS && i4 < 0) {
            return String.format("%.2f", Double.valueOf(j / ONE_SECOND_IN_MS)) + "s";
        } else {
            return String.format("%.2f", Double.valueOf(j)) + "ms";
        }
    }

    public static String getCurrentDateString() {
        return formatDate(System.currentTimeMillis());
    }

    public static boolean inToday(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long j2 = ONE_DAY_IN_MS + timeInMillis;
        if (timeInMillis > j || j >= j2) {
            return false;
        }
        return true;
    }
}
