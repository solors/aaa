package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.qn */
/* loaded from: classes8.dex */
public final class C31223qn {
    @Nullable

    /* renamed from: a */
    private C31442tf f84436a;

    /* renamed from: a */
    public final void m30260a(@NotNull View view, @NotNull String assetName) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        C31442tf c31442tf = this.f84436a;
        if (c31442tf != null) {
            c31442tf.m29198a(view, assetName);
        }
    }

    /* renamed from: a */
    public final void m30259a(@NotNull C31442tf listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f84436a = listener;
    }
}
