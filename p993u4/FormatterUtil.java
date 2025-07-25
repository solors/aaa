package p993u4;

import android.content.Context;
import com.p552ot.pubsub.p553a.C26485b;
import java.util.Locale;

/* renamed from: u4.h */
/* loaded from: classes6.dex */
public class FormatterUtil {
    /* renamed from: a */
    public static String m3006a(Context context, long j) {
        return m3005b(context, j, Locale.US);
    }

    /* renamed from: b */
    public static String m3005b(Context context, long j, Locale locale) {
        return m3004c(context, j, false, locale);
    }

    /* renamed from: c */
    private static String m3004c(Context context, long j, boolean z, Locale locale) {
        String str;
        String format;
        if (context == null) {
            return "";
        }
        float f = (float) j;
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "KB";
        } else {
            str = C26485b.f69244a;
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "MB";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "GB";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "TB";
        }
        if (f > 900.0f) {
            f /= 1024.0f;
            str = "PB";
        }
        if (f < 1.0f) {
            format = String.format(locale, "%.2f", Float.valueOf(f));
        } else if (f < 10.0f) {
            if (z) {
                format = String.format(locale, "%.1f", Float.valueOf(f));
            } else {
                format = String.format(locale, "%.2f", Float.valueOf(f));
            }
        } else if (f < 100.0f) {
            if (z) {
                format = String.format(locale, "%.0f", Float.valueOf(f));
            } else {
                format = String.format(locale, "%.2f", Float.valueOf(f));
            }
        } else {
            format = String.format(locale, "%.0f", Float.valueOf(f));
        }
        return String.format("%s%s", format, str);
    }
}
