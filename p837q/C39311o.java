package p837q;

import ae.KMarkers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1003v.C44473c;
import p804nd.C38513v;

/* compiled from: Parameters.kt */
@Metadata
/* renamed from: q.o */
/* loaded from: classes2.dex */
public final class C39311o implements Iterable<Tuples<? extends String, ? extends C39314c>>, KMarkers {
    @NotNull

    /* renamed from: c */
    public static final C39313b f103362c = new C39313b(null);
    @NotNull

    /* renamed from: d */
    public static final C39311o f103363d = new C39311o();
    @NotNull

    /* renamed from: b */
    private final Map<String, C39314c> f103364b;

    /* compiled from: Parameters.kt */
    @Metadata
    /* renamed from: q.o$a */
    /* loaded from: classes2.dex */
    public static final class C39312a {
        @NotNull

        /* renamed from: a */
        private final Map<String, C39314c> f103365a;

        public C39312a(@NotNull C39311o c39311o) {
            Map<String, C39314c> m17285D;
            m17285D = C37559r0.m17285D(c39311o.f103364b);
            this.f103365a = m17285D;
        }

        @NotNull
        /* renamed from: a */
        public final C39311o m13027a() {
            return new C39311o(C44473c.m2849b(this.f103365a), null);
        }
    }

    /* compiled from: Parameters.kt */
    @Metadata
    /* renamed from: q.o$b */
    /* loaded from: classes2.dex */
    public static final class C39313b {
        private C39313b() {
        }

        public /* synthetic */ C39313b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Parameters.kt */
    @Metadata
    /* renamed from: q.o$c */
    /* loaded from: classes2.dex */
    public static final class C39314c {
        @Nullable

        /* renamed from: a */
        private final Object f103366a;
        @Nullable

        /* renamed from: b */
        private final String f103367b;

        @Nullable
        /* renamed from: a */
        public final String m13026a() {
            return this.f103367b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C39314c) {
                C39314c c39314c = (C39314c) obj;
                if (Intrinsics.m17075f(this.f103366a, c39314c.f103366a) && Intrinsics.m17075f(this.f103367b, c39314c.f103367b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i;
            Object obj = this.f103366a;
            int i2 = 0;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            String str = this.f103367b;
            if (str != null) {
                i2 = str.hashCode();
            }
            return i3 + i2;
        }

        @NotNull
        public String toString() {
            return "Entry(value=" + this.f103366a + ", memoryCacheKey=" + this.f103367b + ')';
        }
    }

    public /* synthetic */ C39311o(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    @NotNull
    /* renamed from: c */
    public final Map<String, String> m13029c() {
        Map<String, String> m17284j;
        if (isEmpty()) {
            m17284j = C37559r0.m17284j();
            return m17284j;
        }
        Map<String, C39314c> map = this.f103364b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C39314c> entry : map.entrySet()) {
            String m13026a = entry.getValue().m13026a();
            if (m13026a != null) {
                linkedHashMap.put(entry.getKey(), m13026a);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    /* renamed from: d */
    public final C39312a m13028d() {
        return new C39312a(this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C39311o) && Intrinsics.m17075f(this.f103364b, ((C39311o) obj).f103364b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f103364b.hashCode();
    }

    public final boolean isEmpty() {
        return this.f103364b.isEmpty();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<Tuples<? extends String, ? extends C39314c>> iterator() {
        Map<String, C39314c> map = this.f103364b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, C39314c> entry : map.entrySet()) {
            arrayList.add(C38513v.m14532a(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @NotNull
    public String toString() {
        return "Parameters(entries=" + this.f103364b + ')';
    }

    private C39311o(Map<String, C39314c> map) {
        this.f103364b = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C39311o() {
        /*
            r1 = this;
            java.util.Map r0 = kotlin.collections.C37554o0.m17366j()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p837q.C39311o.<init>():void");
    }
}
