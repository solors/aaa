package com.yandex.mobile.ads.impl;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.xh */
/* loaded from: classes8.dex */
public final class C31823xh<T extends View> implements InterfaceC30456hd<T> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC30456hd
    /* renamed from: a */
    public final void mo27501a(@NotNull T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Drawable background = view.getBackground();
        if (background instanceof TransitionDrawable) {
            ((TransitionDrawable) background).startTransition(500);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30456hd
    public final void cancel() {
    }
}
