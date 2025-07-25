package com.maticoo.sdk.utils;

import android.content.res.Resources;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes6.dex */
public class TimeUtils {
    private static final String PATTERN_YMD = "yyyy-MM-dd";

    private static Locale getSystemLocal() {
        return Resources.getSystem().getConfiguration().getLocales().get(0);
    }

    public static boolean isToday(long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTERN_YMD, getSystemLocal());
            return TextUtils.equals(simpleDateFormat.format(new Date(System.currentTimeMillis())), simpleDateFormat.format(new Date(j)));
        } catch (Exception unused) {
            return false;
        }
    }
}
