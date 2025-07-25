package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.b6 */
/* loaded from: classes8.dex */
public final class C29994b6 implements InterfaceC30261eo {
    @NotNull

    /* renamed from: a */
    private final C31953z5 f77124a;

    /* renamed from: b */
    private final int f77125b;

    public C29994b6(@NotNull C31953z5 adPod, int i) {
        Intrinsics.checkNotNullParameter(adPod, "adPod");
        this.f77124a = adPod;
        this.f77125b = i;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30261eo
    /* renamed from: a */
    public final boolean mo26971a() {
        if (this.f77124a.m26375a() <= this.f77125b) {
            return true;
        }
        return false;
    }
}
