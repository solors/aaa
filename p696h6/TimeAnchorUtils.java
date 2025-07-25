package p696h6;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: h6.i */
/* loaded from: classes6.dex */
public class TimeAnchorUtils {

    /* renamed from: a */
    private static final AtomicLong f91354a = new AtomicLong(0);

    /* renamed from: b */
    private static final AtomicLong f91355b = new AtomicLong(0);

    /* renamed from: c */
    private static final AtomicLong f91356c = new AtomicLong(0);

    /* renamed from: a */
    public static long m23664a() {
        return f91355b.get();
    }

    /* renamed from: b */
    public static long m23663b() {
        return f91356c.get();
    }

    /* renamed from: c */
    public static void m23662c() {
        f91355b.set(System.currentTimeMillis() - f91354a.get());
    }

    /* renamed from: d */
    public static void m23661d() {
        f91356c.set(System.currentTimeMillis() - f91354a.get());
    }

    /* renamed from: e */
    public static void m23660e() {
        f91354a.set(System.currentTimeMillis());
    }
}
