package sg.bigo.ads.common.utils;

import android.os.SystemClock;
import sg.bigo.ads.common.p941x.C43906a;

/* renamed from: sg.bigo.ads.common.utils.r */
/* loaded from: classes10.dex */
public final class C43837r {

    /* renamed from: a */
    private static C43838a f114681a = null;

    /* renamed from: b */
    private static long f114682b = 1619452800;

    /* renamed from: sg.bigo.ads.common.utils.r$a */
    /* loaded from: classes10.dex */
    static class C43838a {

        /* renamed from: a */
        private final long f114683a;

        /* renamed from: b */
        private final long f114684b = SystemClock.elapsedRealtime();

        public C43838a(long j) {
            this.f114683a = j;
        }

        /* renamed from: a */
        public final long m4816a() {
            return this.f114683a + (SystemClock.elapsedRealtime() - this.f114684b);
        }
    }

    /* renamed from: a */
    public static long m4819a() {
        long currentTimeMillis = System.currentTimeMillis() - C43906a.m4634e();
        if (currentTimeMillis > 0) {
            return currentTimeMillis;
        }
        C43906a.m4631f();
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public static long m4817b() {
        C43838a c43838a = f114681a;
        if (c43838a == null) {
            return System.currentTimeMillis();
        }
        return c43838a.m4816a();
    }

    /* renamed from: a */
    public static void m4818a(long j) {
        if (j < f114682b) {
            return;
        }
        C43838a c43838a = new C43838a(j * 1000);
        if (f114681a == null) {
            f114681a = c43838a;
        } else if (c43838a.m4816a() > f114681a.m4816a()) {
            f114681a = c43838a;
        }
    }
}
