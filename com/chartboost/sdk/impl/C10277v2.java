package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.C10277v2;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.CacheSpan;
import java.util.Comparator;
import java.util.TreeSet;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.chartboost.sdk.impl.v2 */
/* loaded from: classes3.dex */
public final class C10277v2 implements CacheEvictor {

    /* renamed from: a */
    public final long f23350a;

    /* renamed from: b */
    public final InterfaceC10280b f23351b;

    /* renamed from: c */
    public final Functions f23352c;

    /* renamed from: d */
    public final InterfaceC38501j f23353d;

    /* renamed from: e */
    public long f23354e;

    /* renamed from: com.chartboost.sdk.impl.v2$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10280b {
        /* renamed from: c */
        void mo80278c(String str);
    }

    /* renamed from: com.chartboost.sdk.impl.v2$c */
    /* loaded from: classes3.dex */
    public static final class C10281c extends Lambda implements Functions {
        public C10281c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: a */
        public final TreeSet invoke() {
            return (TreeSet) C10277v2.this.f23352c.invoke();
        }
    }

    public C10277v2(long j, InterfaceC10280b evictUrlCallback, Functions treeSetFactory) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(evictUrlCallback, "evictUrlCallback");
        Intrinsics.checkNotNullParameter(treeSetFactory, "treeSetFactory");
        this.f23350a = j;
        this.f23351b = evictUrlCallback;
        this.f23352c = treeSetFactory;
        m14554a = LazyJVM.m14554a(new C10281c());
        this.f23353d = m14554a;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanAdded(Cache cache, CacheSpan span) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(span, "span");
        m80321a().add(span);
        this.f23354e += span.length;
        m80319a(cache, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanRemoved(Cache cache, CacheSpan span) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(span, "span");
        m80321a().remove(span);
        this.f23354e -= span.length;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.Listener
    public void onSpanTouched(Cache cache, CacheSpan oldSpan, CacheSpan newSpan) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(oldSpan, "oldSpan");
        Intrinsics.checkNotNullParameter(newSpan, "newSpan");
        onSpanRemoved(cache, oldSpan);
        onSpanAdded(cache, newSpan);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onStartFile(Cache cache, String key, long j, long j2) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(key, "key");
        if (j2 != -1) {
            m80319a(cache, j2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public boolean requiresCacheSpanTouches() {
        return true;
    }

    /* renamed from: com.chartboost.sdk.impl.v2$a */
    /* loaded from: classes3.dex */
    public static final class C10278a extends Lambda implements Functions {

        /* renamed from: b */
        public static final C10278a f23355b = new C10278a();

        /* renamed from: com.chartboost.sdk.impl.v2$a$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C10279a extends FunctionReferenceImpl implements Function2 {

            /* renamed from: b */
            public static final C10279a f23356b = new C10279a();

            public C10279a() {
                super(2, AbstractC10309w2.class, "compare", "compare(Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)I", 1);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Integer mo105910invoke(CacheSpan p0, CacheSpan p1) {
                int m80202b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                Intrinsics.checkNotNullParameter(p1, "p1");
                m80202b = AbstractC10309w2.m80202b(p0, p1);
                return Integer.valueOf(m80202b);
            }
        }

        public C10278a() {
            super(0);
        }

        /* renamed from: a */
        public static final int m80317a(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Number) tmp0.mo105910invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.jvm.functions.Functions
        /* renamed from: a */
        public final TreeSet invoke() {
            final C10279a c10279a = C10279a.f23356b;
            return new TreeSet(new Comparator() { // from class: o0.s
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C10277v2.C10278a.m80317a(c10279a, obj, obj2);
                }
            });
        }
    }

    /* renamed from: a */
    public final void m80319a(Cache cache, long j) {
        while (this.f23354e + j > this.f23350a && !m80321a().isEmpty()) {
            CacheSpan cacheSpan = (CacheSpan) m80321a().first();
            String str = cacheSpan.key;
            C9763c7.m81922a("evictCache() - " + str, (Throwable) null, 2, (Object) null);
            cache.removeSpan(cacheSpan);
            InterfaceC10280b interfaceC10280b = this.f23351b;
            String key = cacheSpan.key;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            interfaceC10280b.mo80278c(key);
        }
    }

    public /* synthetic */ C10277v2(long j, InterfaceC10280b interfaceC10280b, Functions functions, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, interfaceC10280b, (i & 4) != 0 ? C10278a.f23355b : functions);
    }

    /* renamed from: a */
    public final TreeSet m80321a() {
        return (TreeSet) this.f23353d.getValue();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheEvictor
    public void onCacheInitialized() {
    }
}
