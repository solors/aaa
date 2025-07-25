package com.yandex.mobile.ads.impl;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class td2 implements bt0 {
    @NotNull

    /* renamed from: a */
    private final f41 f85625a;

    public td2(@NotNull f41 weakViewProvider) {
        Intrinsics.checkNotNullParameter(weakViewProvider, "weakViewProvider");
        this.f85625a = weakViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.bt0
    @Nullable
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.bt0
    @Nullable
    public final CheckBox getMuteControl() {
        return this.f85625a.m34233c();
    }

    @Override // com.yandex.mobile.ads.impl.bt0
    @Nullable
    public final ProgressBar getVideoProgress() {
        return this.f85625a.m34231e();
    }
}
