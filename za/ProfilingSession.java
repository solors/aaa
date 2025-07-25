package za;

import androidx.collection.ArrayMap;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: za.d */
/* loaded from: classes8.dex */
public final class ProfilingSession {
    @NotNull

    /* renamed from: d */
    public static final C45233b f118916d = new C45233b(null);
    @NotNull

    /* renamed from: a */
    private final C45232a f118917a = new C45232a();
    @NotNull

    /* renamed from: b */
    private final C45232a f118918b = new C45232a();
    @NotNull

    /* renamed from: c */
    private final ArrayMap<String, C45232a> f118919c = new ArrayMap<>();

    /* compiled from: ProfilingSession.kt */
    @Metadata
    /* renamed from: za.d$a */
    /* loaded from: classes8.dex */
    private static final class C45232a {

        /* renamed from: a */
        private long f118920a;

        /* renamed from: b */
        private int f118921b;

        /* renamed from: a */
        public final void m578a(long j) {
            this.f118920a += j;
        }

        /* renamed from: b */
        public final void m577b(long j) {
            m578a(j);
            this.f118921b++;
        }

        /* renamed from: c */
        public final long m576c() {
            return this.f118920a;
        }

        /* renamed from: d */
        public final long m575d() {
            int i = this.f118921b;
            if (i == 0) {
                return 0L;
            }
            return this.f118920a / i;
        }

        /* renamed from: e */
        public final int m574e() {
            return this.f118921b;
        }

        /* renamed from: f */
        public final void m573f() {
            this.f118920a = 0L;
            this.f118921b = 0;
        }
    }

    /* compiled from: ProfilingSession.kt */
    @Metadata
    /* renamed from: za.d$b */
    /* loaded from: classes8.dex */
    public static final class C45233b {
        private C45233b() {
        }

        public /* synthetic */ C45233b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final long m571b(long j) {
            return j / 1000;
        }
    }

    /* renamed from: a */
    public final void m584a() {
        this.f118917a.m573f();
        this.f118918b.m573f();
        for (Map.Entry<String, C45232a> entry : this.f118919c.entrySet()) {
            entry.getValue().m573f();
        }
    }

    @NotNull
    /* renamed from: b */
    public final Map<String, Object> m583b() {
        HashMap hashMap = new HashMap();
        hashMap.put("view obtaining - total count", Integer.valueOf(this.f118917a.m574e()));
        hashMap.put("view obtaining - total time (µs)", Long.valueOf(C45234e.m569b(f118916d.m571b(this.f118917a.m576c()))));
        for (Map.Entry<String, C45232a> entry : this.f118919c.entrySet()) {
            String key = entry.getKey();
            C45232a value = entry.getValue();
            if (value.m574e() > 0) {
                hashMap.put("blocking view obtaining for " + key + " - count", Integer.valueOf(value.m574e()));
                hashMap.put("blocking view obtaining for " + key + " - avg time (µs)", Long.valueOf(C45234e.m569b(f118916d.m571b(value.m575d()))));
            }
        }
        if (this.f118918b.m574e() > 0) {
            hashMap.put("long view requests - count", Integer.valueOf(this.f118918b.m574e()));
            hashMap.put("long view requests - avg time (µs)", Long.valueOf(C45234e.m569b(f118916d.m571b(this.f118918b.m575d()))));
        }
        return hashMap;
    }

    /* renamed from: c */
    public final boolean m582c() {
        if (this.f118918b.m574e() > 0) {
            return true;
        }
        for (Map.Entry<String, C45232a> entry : this.f118919c.entrySet()) {
            if (entry.getValue().m574e() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void m581d(@NotNull String viewName, long j) {
        Intrinsics.checkNotNullParameter(viewName, "viewName");
        this.f118917a.m577b(j);
        ArrayMap<String, C45232a> arrayMap = this.f118919c;
        C45232a c45232a = arrayMap.get(viewName);
        if (c45232a == null) {
            c45232a = new C45232a();
            arrayMap.put(viewName, c45232a);
        }
        c45232a.m577b(j);
    }

    /* renamed from: e */
    public final void m580e(long j) {
        this.f118917a.m577b(j);
    }

    /* renamed from: f */
    public final void m579f(long j) {
        this.f118917a.m578a(j);
        if (j >= 1000000) {
            this.f118918b.m577b(j);
        }
    }
}
