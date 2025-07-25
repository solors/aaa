package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ia0 implements db1 {

    /* renamed from: c */
    static final /* synthetic */ KProperty<Object>[] f80389c = {Reflection.m17039e(new MutablePropertyReference1Impl(ia0.class, "contentCloseListener", "getContentCloseListener()Lcom/monetization/ads/fullscreen/content/ContentCloseListener;", 0))};
    @Nullable

    /* renamed from: a */
    private t32 f80390a;
    @NotNull

    /* renamed from: b */
    private final xj1 f80391b = yj1.m26873a();

    @Override // com.yandex.mobile.ads.impl.db1
    /* renamed from: a */
    public final void mo29678a(boolean z) {
        t32 t32Var = this.f80390a;
        if (t32Var != null) {
            t32Var.mo29309a(z);
        }
    }

    @Override // com.yandex.mobile.ads.impl.db1
    /* renamed from: c */
    public final void mo29676c() {
        InterfaceC31308rq interfaceC31308rq = (InterfaceC31308rq) this.f80391b.getValue(this, f80389c[0]);
        if (interfaceC31308rq != null) {
            interfaceC31308rq.mo27153f();
        }
    }

    /* renamed from: a */
    public final void m33329a(@Nullable InterfaceC31308rq interfaceC31308rq) {
        this.f80391b.setValue(this, f80389c[0], interfaceC31308rq);
    }

    /* renamed from: a */
    public final void m33330a(@NotNull la0 useCustomCloseListener) {
        Intrinsics.checkNotNullParameter(useCustomCloseListener, "useCustomCloseListener");
        this.f80390a = useCustomCloseListener;
    }
}
