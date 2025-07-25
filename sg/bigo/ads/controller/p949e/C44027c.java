package sg.bigo.ads.controller.p949e;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sg.bigo.ads.controller.e.c */
/* loaded from: classes10.dex */
public final class C44027c {

    /* renamed from: c */
    private static final C44027c f115475c = new C44027c();
    @Nullable

    /* renamed from: a */
    Map<String, Long> f115476a;

    /* renamed from: b */
    public final AtomicInteger f115477b = new AtomicInteger(0);

    private C44027c() {
    }

    /* renamed from: a */
    public static C44027c m4183a() {
        return f115475c;
    }

    /* renamed from: b */
    public final void m4180b() {
        Map<String, Long> map = this.f115476a;
        if (map != null) {
            map.clear();
        }
        this.f115477b.set(1);
    }

    /* renamed from: a */
    public final boolean m4182a(@Nullable String str) {
        return m4181a(this.f115476a, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m4181a(Map<String, Long> map, String str) {
        Long l;
        return map == null || str == null || (l = map.get(str)) == null || SystemClock.elapsedRealtime() - l.longValue() > 600000;
    }
}
