package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C30767l4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.m4 */
/* loaded from: classes8.dex */
public final class C30829m4 {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30699k4 f82034a;
    @NotNull

    /* renamed from: b */
    private final C30767l4 f82035b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30829m4(InterfaceC30699k4 interfaceC30699k4) {
        this(interfaceC30699k4, C30767l4.C30768a.m32352a());
        int i = C30767l4.f81682e;
    }

    /* renamed from: a */
    public final void m32104a() {
        String mo28365a = this.f82034a.mo28365a();
        if (mo28365a != null && mo28365a.length() != 0) {
            this.f82035b.m32357a(mo28365a);
        }
    }

    /* renamed from: b */
    public final void m32103b() {
        String mo28365a = this.f82034a.mo28365a();
        if (mo28365a != null && mo28365a.length() != 0) {
            this.f82035b.m32355b(mo28365a);
        }
    }

    public C30829m4(@NotNull InterfaceC30699k4 adIdProvider, @NotNull C30767l4 adIdStorage) {
        Intrinsics.checkNotNullParameter(adIdProvider, "adIdProvider");
        Intrinsics.checkNotNullParameter(adIdStorage, "adIdStorage");
        this.f82034a = adIdProvider;
        this.f82035b = adIdStorage;
    }
}
