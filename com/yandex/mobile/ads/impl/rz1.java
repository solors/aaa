package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class rz1 {

    /* renamed from: a */
    private static final long f84952a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a */
    public static void m29891a(@NotNull TextView rewardDelayTextView, long j, long j2) {
        Intrinsics.checkNotNullParameter(rewardDelayTextView, "rewardDelayTextView");
        rewardDelayTextView.setText(String.valueOf((int) Math.ceil(((float) (j - j2)) / ((float) f84952a))));
    }
}
