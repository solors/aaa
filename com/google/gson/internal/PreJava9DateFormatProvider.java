package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes5.dex */
public class PreJava9DateFormatProvider {
    /* renamed from: a */
    private static String m66192a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException("Unknown DateFormat style: " + i);
                }
                return "MMM d, y";
            }
            return "MMMM d, y";
        }
        return "EEEE, MMMM d, y";
    }

    /* renamed from: b */
    private static String m66191b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "M/d/yy";
                    }
                    throw new IllegalArgumentException("Unknown DateFormat style: " + i);
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    /* renamed from: c */
    private static String m66190c(int i) {
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "h:mm a";
                }
                throw new IllegalArgumentException("Unknown DateFormat style: " + i);
            }
            return "h:mm:ss a";
        }
        return "h:mm:ss a z";
    }

    public static DateFormat getUSDateFormat(int i) {
        return new SimpleDateFormat(m66192a(i), Locale.US);
    }

    public static DateFormat getUSDateTimeFormat(int i, int i2) {
        return new SimpleDateFormat(m66191b(i) + " " + m66190c(i2), Locale.US);
    }
}
