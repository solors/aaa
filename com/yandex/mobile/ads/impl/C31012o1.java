package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.o1 */
/* loaded from: classes8.dex */
public final class C31012o1 implements InterfaceC30355g1 {
    @NotNull

    /* renamed from: a */
    private final Activity f83267a;
    @Nullable

    /* renamed from: b */
    private final C30537i8 f83268b;

    public C31012o1(@NotNull Activity activity, @Nullable C30537i8 c30537i8) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f83267a = activity;
        this.f83268b = c30537i8;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30355g1
    /* renamed from: a */
    public final void mo31195a() {
        this.f83267a.finish();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30355g1
    /* renamed from: a */
    public final void mo31193a(int i, @Nullable Bundle bundle) {
        C30537i8 c30537i8 = this.f83268b;
        if (c30537i8 != null) {
            c30537i8.mo28535a(i, bundle);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30355g1
    /* renamed from: a */
    public final void mo31194a(int i) {
        try {
            if (Build.VERSION.SDK_INT != 26) {
                this.f83267a.setRequestedOrientation(i);
            }
        } catch (Exception unused) {
            um0.m28728a(new Object[0]);
        }
    }
}
