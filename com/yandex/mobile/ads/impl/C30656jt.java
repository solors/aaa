package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.jt */
/* loaded from: classes8.dex */
public final class C30656jt {
    @NotNull

    /* renamed from: a */
    private final ph1 f81079a;

    public /* synthetic */ C30656jt() {
        this(new ph1());
    }

    /* renamed from: a */
    public final void m32780a(@NotNull TextView countDownProgress, long j, long j2) {
        Intrinsics.checkNotNullParameter(countDownProgress, "countDownProgress");
        this.f81079a.getClass();
        countDownProgress.setText(ph1.m30657a(j - j2));
    }

    public C30656jt(@NotNull ph1 progressDisplayTimeFormatter) {
        Intrinsics.checkNotNullParameter(progressDisplayTimeFormatter, "progressDisplayTimeFormatter");
        this.f81079a = progressDisplayTimeFormatter;
    }
}
