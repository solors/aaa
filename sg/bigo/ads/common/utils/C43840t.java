package sg.bigo.ads.common.utils;

/* renamed from: sg.bigo.ads.common.utils.t */
/* loaded from: classes10.dex */
public final class C43840t {

    /* renamed from: a */
    private static boolean f114685a = false;

    /* renamed from: a */
    public static void m4812a(String str) {
        if (f114685a) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static boolean m4810b() {
        return f114685a;
    }

    /* renamed from: a */
    public static void m4811a(boolean z) {
        f114685a = z;
    }

    /* renamed from: a */
    public static boolean m4813a() {
        return false;
    }
}
