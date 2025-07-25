package sg.bigo.ads.common.p932t;

import android.util.Log;
import com.ironsource.C21114v8;
import sg.bigo.ads.common.utils.C43840t;

/* renamed from: sg.bigo.ads.common.t.a */
/* loaded from: classes10.dex */
public final class C43782a {
    /* renamed from: a */
    public static void m5010a(int i, int i2, String str, String str2) {
        if (m5011a(i)) {
            if (i == 0) {
                str2 = C21114v8.C21123i.f54137d + str + "] " + str2;
            }
            Log.println(i2, "BigoAds", str2);
        }
    }

    /* renamed from: b */
    public static void m5007b(String str, String str2) {
        m5010a(0, 5, str, str2);
    }

    /* renamed from: a */
    public static void m5009a(int i, String str, String str2) {
        m5010a(i, 6, str, str2);
    }

    /* renamed from: a */
    public static void m5008a(String str, String str2) {
        m5010a(0, 4, str, str2);
    }

    /* renamed from: a */
    private static boolean m5011a(int i) {
        C43840t.m4813a();
        return C43840t.m4810b() ? i == 2 || i == 1 : i == 2;
    }
}
