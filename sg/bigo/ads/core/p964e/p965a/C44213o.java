package sg.bigo.ads.core.p964e.p965a;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: sg.bigo.ads.core.e.a.o */
/* loaded from: classes10.dex */
public final class C44213o {

    /* renamed from: a */
    private static Pattern f116045a = Pattern.compile("((\\d{1,2})|(100))%");

    /* renamed from: b */
    private static Pattern f116046b = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");

    /* renamed from: a */
    public static boolean m3665a(String str) {
        if (!TextUtils.isEmpty(str) && f116045a.matcher(str).matches()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3664b(String str) {
        if (!TextUtils.isEmpty(str) && f116046b.matcher(str).matches()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m3663c(String str) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split(":");
        if (split.length != 3) {
            return -1;
        }
        try {
            return (Integer.parseInt(split[0]) * 60 * 60 * 1000) + (Integer.parseInt(split[1]) * 60 * 1000) + ((int) (Float.parseFloat(split[2]) * 1000.0f));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static int m3662d(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str.replace("%", ""));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
