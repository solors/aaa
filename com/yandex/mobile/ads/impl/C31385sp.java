package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.sp */
/* loaded from: classes8.dex */
public final class C31385sp<T extends View> implements InterfaceC30456hd<T> {
    @NotNull

    /* renamed from: a */
    private final List<InterfaceC30456hd<T>> f85320a;

    /* JADX WARN: Multi-variable type inference failed */
    public C31385sp(@NotNull List<? extends InterfaceC30456hd<T>> animators) {
        Intrinsics.checkNotNullParameter(animators, "animators");
        this.f85320a = animators;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30456hd
    /* renamed from: a */
    public final void mo27501a(@NotNull T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        for (InterfaceC30456hd<T> interfaceC30456hd : this.f85320a) {
            interfaceC30456hd.mo27501a(view);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30456hd
    public final void cancel() {
        for (InterfaceC30456hd<T> interfaceC30456hd : this.f85320a) {
            interfaceC30456hd.cancel();
        }
    }
}
