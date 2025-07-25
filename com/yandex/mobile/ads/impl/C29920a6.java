package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.a6 */
/* loaded from: classes8.dex */
public final class C29920a6 implements InterfaceC31326s1 {

    /* renamed from: a */
    private final long f76716a;

    public C29920a6(@NotNull List<C30296f6> adPodItems) {
        Intrinsics.checkNotNullParameter(adPodItems, "adPodItems");
        long j = 0;
        for (C30296f6 c30296f6 : adPodItems) {
            j += c30296f6.m34215a();
        }
        this.f76716a = j;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31326s1
    /* renamed from: a */
    public final long mo29886a() {
        return this.f76716a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31326s1
    /* renamed from: a */
    public final long mo29885a(long j) {
        return this.f76716a;
    }
}
