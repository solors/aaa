package com.yandex.mobile.ads.impl;

import java.util.Set;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class z72 {

    /* renamed from: c */
    static final /* synthetic */ KProperty<Object>[] f88758c = {Reflection.m17039e(new MutablePropertyReference1Impl(z72.class, "status", "getStatus()Lcom/monetization/ads/instream/status/VideoAdStatus;", 0))};
    @NotNull

    /* renamed from: a */
    private final Set<y72> f88759a;
    @NotNull

    /* renamed from: b */
    private final C31957a f88760b;

    /* renamed from: com.yandex.mobile.ads.impl.z72$a */
    /* loaded from: classes8.dex */
    public static final class C31957a extends ObservableProperty<y72> {

        /* renamed from: a */
        final /* synthetic */ z72 f88761a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C31957a(com.yandex.mobile.ads.impl.z72 r2) {
            /*
                r1 = this;
                com.yandex.mobile.ads.impl.y72 r0 = com.yandex.mobile.ads.impl.y72.f88089b
                r1.f88761a = r2
                r1.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.z72.C31957a.<init>(com.yandex.mobile.ads.impl.z72):void");
        }

        @Override // kotlin.properties.ObservableProperty
        protected final void afterChange(@NotNull KProperty<?> property, y72 y72Var, y72 y72Var2) {
            Intrinsics.checkNotNullParameter(property, "property");
            this.f88761a.f88759a.add(y72Var2);
        }
    }

    public z72() {
        Set<y72> m17121h;
        m17121h = C37572z0.m17121h(y72.f88089b);
        this.f88759a = m17121h;
        Delegates delegates = Delegates.f99341a;
        this.f88760b = new C31957a(this);
    }

    /* renamed from: b */
    public final void m26321b() {
        this.f88759a.clear();
        y72 y72Var = y72.f88089b;
        Intrinsics.checkNotNullParameter(y72Var, "<set-?>");
        this.f88760b.setValue(this, f88758c[0], y72Var);
    }

    @NotNull
    /* renamed from: a */
    public final y72 m26324a() {
        return this.f88760b.getValue(this, f88758c[0]);
    }

    /* renamed from: a */
    public final boolean m26323a(@NotNull y72 videoAdStatus) {
        Intrinsics.checkNotNullParameter(videoAdStatus, "videoAdStatus");
        return this.f88759a.contains(videoAdStatus);
    }

    /* renamed from: b */
    public final void m26320b(@NotNull y72 y72Var) {
        Intrinsics.checkNotNullParameter(y72Var, "<set-?>");
        this.f88760b.setValue(this, f88758c[0], y72Var);
    }
}
