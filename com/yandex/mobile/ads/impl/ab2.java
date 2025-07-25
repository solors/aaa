package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ab2 implements c82 {
    @NotNull

    /* renamed from: a */
    private final ya2 f76752a;

    public ab2(@NotNull ya2 videoViewProvider) {
        Intrinsics.checkNotNullParameter(videoViewProvider, "videoViewProvider");
        this.f76752a = videoViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.c82
    /* renamed from: a */
    public final boolean mo35339a() {
        View view = this.f76752a.getView();
        if (view != null && !cc2.m35250d(view) && cc2.m35257a(view, 50)) {
            return true;
        }
        return false;
    }
}
