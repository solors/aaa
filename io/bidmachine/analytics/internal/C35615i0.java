package io.bidmachine.analytics.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* renamed from: io.bidmachine.analytics.internal.i0 */
/* loaded from: classes9.dex */
public final class C35615i0 {

    /* renamed from: d */
    public static final C35616a f96480d = new C35616a(null);

    /* renamed from: e */
    private static final C35615i0 f96481e = new C35615i0(Dispatchers.m16376c(), Dispatchers.m16377b(), Dispatchers.m16378a());

    /* renamed from: a */
    private final CoroutineDispatcher f96482a;

    /* renamed from: b */
    private final CoroutineDispatcher f96483b;

    /* renamed from: c */
    private final CoroutineDispatcher f96484c;

    /* renamed from: io.bidmachine.analytics.internal.i0$a */
    /* loaded from: classes9.dex */
    public static final class C35616a {
        private C35616a() {
        }

        public /* synthetic */ C35616a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C35615i0 m20193a() {
            return C35615i0.f96481e;
        }
    }

    public C35615i0(CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3) {
        this.f96482a = coroutineDispatcher;
        this.f96483b = coroutineDispatcher2;
        this.f96484c = coroutineDispatcher3;
    }

    /* renamed from: b */
    public final CoroutineDispatcher m20195b() {
        return this.f96484c;
    }

    /* renamed from: c */
    public final CoroutineDispatcher m20194c() {
        return this.f96483b;
    }
}
