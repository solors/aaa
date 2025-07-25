package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.d61;
import com.yandex.mobile.ads.impl.j61;
import com.yandex.mobile.ads.impl.x11;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class i61 implements d61.InterfaceC30146a, p52 {
    @NotNull

    /* renamed from: a */
    private final j61.InterfaceC30603a f80336a;
    @NotNull

    /* renamed from: b */
    private final wg0 f80337b;
    @NotNull

    /* renamed from: c */
    private final AtomicInteger f80338c;

    public i61(@NotNull x11.RunnableC31787a.C31788a listener, @NotNull wg1 imageProvider, int i) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        this.f80336a = listener;
        this.f80337b = imageProvider;
        this.f80338c = new AtomicInteger(i);
    }

    @Override // com.yandex.mobile.ads.impl.d61.InterfaceC30146a
    /* renamed from: a */
    public final void mo33360a() {
        if (this.f80338c.decrementAndGet() == 0) {
            this.f80336a.mo27696a(this.f80337b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.p52
    /* renamed from: b */
    public final void mo28830b() {
        if (this.f80338c.decrementAndGet() == 0) {
            this.f80336a.mo27696a(this.f80337b);
        }
    }
}
