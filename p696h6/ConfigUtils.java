package p696h6;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: h6.b */
/* loaded from: classes6.dex */
public class ConfigUtils {

    /* renamed from: a */
    private static final AtomicLong f91349a = new AtomicLong();

    /* renamed from: a */
    public static long m23678a() {
        return f91349a.get();
    }

    /* renamed from: b */
    public static void m23677b(long j) {
        f91349a.set(j);
    }
}
