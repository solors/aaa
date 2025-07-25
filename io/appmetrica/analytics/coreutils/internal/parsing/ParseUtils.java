package io.appmetrica.analytics.coreutils.internal.parsing;

import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class ParseUtils {
    public static final int NEGATIVE_INT = -1;
    public static final int ZERO = 0;

    @Nullable
    public static Integer intValueOf(@Nullable String str) {
        if (str != null) {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    @Nullable
    public static Float parseFloat(String str) {
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int parseInt(String str, int i) {
        if (str != null) {
            try {
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return Integer.parseInt(str);
    }

    public static int parseIntOrNegative(String str) {
        return parseInt(str, -1);
    }

    public static int parseIntOrZero(String str) {
        return parseInt(str, 0);
    }

    public static long parseLong(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    @Nullable
    public static Integer parseInt(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    public static Long parseLong(String str) {
        try {
            return Long.valueOf(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
