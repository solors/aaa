package sg.bigo.ads.common.p922j;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43833o;

/* renamed from: sg.bigo.ads.common.j.a */
/* loaded from: classes10.dex */
public class C43709a {

    /* renamed from: a */
    private static final String f114415a = "a";

    /* renamed from: a */
    public static long m5152a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (j != 0) {
            try {
            } catch (Exception unused) {
                return 0L;
            }
        }
        return ((j ^ Long.valueOf(str).longValue()) ^ Math.abs(String.valueOf(j).hashCode())) >> 20;
    }

    @Nullable
    /* renamed from: b */
    public static byte[] m5149b(@NonNull String str, @NonNull String str2) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str3 = f114415a;
            str4 = "cip error with empty.";
        } else if (TextUtils.isEmpty(str2)) {
            str3 = f114415a;
            str4 = "string error with empty.";
        } else {
            byte[] m4851b = C43833o.m4851b(str, str2, null);
            if (m4851b == null) {
                str3 = f114415a;
                str4 = "cip error with empty content.";
            } else {
                return m4851b;
            }
        }
        C43782a.m5009a(0, str3, str4);
        return null;
    }

    @Nullable
    /* renamed from: a */
    public static String m5151a(@Nullable String str, @NonNull String str2) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str3 = f114415a;
            str4 = "data error with empty.";
        } else if (!TextUtils.isEmpty(str2)) {
            String m4857a = C43833o.m4857a(str, str2);
            String str5 = f114415a;
            C43782a.m5010a(0, 3, str5, "data=" + str + ", hexStringSecKey=" + str2 + ", cryptStr=" + m4857a);
            return m4857a;
        } else {
            str3 = f114415a;
            str4 = "cip error with empty.";
        }
        C43782a.m5009a(0, str3, str4);
        return null;
    }

    @Nullable
    /* renamed from: a */
    public static String m5150a(@NonNull String str, @NonNull String str2, ValueCallback<Exception> valueCallback) {
        String str3;
        String str4;
        if (TextUtils.isEmpty(str)) {
            str3 = f114415a;
            str4 = "cip error with empty.";
        } else if (TextUtils.isEmpty(str2)) {
            str3 = f114415a;
            str4 = "string error with empty.";
        } else {
            String m4856a = C43833o.m4856a(str, str2, valueCallback);
            if (!TextUtils.isEmpty(m4856a)) {
                return m4856a;
            }
            str3 = f114415a;
            str4 = "cip error with empty content.";
        }
        C43782a.m5009a(0, str3, str4);
        return null;
    }
}
