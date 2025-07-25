package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.om */
/* loaded from: classes8.dex */
public final class C31052om {
    @NotNull

    /* renamed from: a */
    private final Handler f83552a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30456hd<TextView> f83553b;

    public /* synthetic */ C31052om(Context context) {
        this(context, new Handler(Looper.getMainLooper()), C31221qm.m30273a(context));
    }

    /* renamed from: a */
    public final void m30959a() {
        this.f83552a.removeCallbacksAndMessages(null);
        this.f83553b.cancel();
    }

    /* renamed from: a */
    public final void m30958a(@NotNull TextView callToActionView) {
        Intrinsics.checkNotNullParameter(callToActionView, "callToActionView");
        this.f83552a.postDelayed(new rx1(callToActionView, this.f83553b), 2000L);
    }

    public C31052om(@NotNull Context context, @NotNull Handler handler, @NotNull InterfaceC30456hd<TextView> callToActionAnimator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(callToActionAnimator, "callToActionAnimator");
        this.f83552a = handler;
        this.f83553b = callToActionAnimator;
    }
}
