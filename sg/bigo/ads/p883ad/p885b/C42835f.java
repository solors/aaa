package sg.bigo.ads.p883ad.p885b;

import androidx.annotation.NonNull;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: sg.bigo.ads.ad.b.f */
/* loaded from: classes10.dex */
public final class C42835f {
    /* renamed from: a */
    public static int m6521a(@NonNull String str, int i) {
        if (i <= 0) {
            return 0;
        }
        String format = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis() / 86400000));
        return Math.abs((str + format).hashCode()) % i;
    }

    /* renamed from: b */
    public static String m6520b(@NonNull String str) {
        return (m6521a(str, 901) + 100) + "K";
    }

    /* renamed from: c */
    public static String m6519c(@NonNull String str) {
        return "4." + (m6521a(str, 7) + 3);
    }

    /* renamed from: a */
    public static String m6522a(@NonNull String str) {
        return (m6521a(str, 100) + 1) + "M+";
    }
}
