package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class hd2 {

    /* renamed from: a */
    private final int f80044a;

    /* renamed from: b */
    private final int f80045b;

    public hd2(int i, int i2) {
        this.f80044a = i;
        this.f80045b = i2;
    }

    /* renamed from: a */
    public final void m33573a(@NotNull View volumeControl, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(volumeControl, "volumeControl");
        if (z) {
            i = this.f80044a;
        } else {
            i = this.f80045b;
        }
        volumeControl.setBackground(ContextCompat.getDrawable(volumeControl.getContext(), i));
    }
}
