package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.v0 */
/* loaded from: classes8.dex */
public final class C31622v0 implements InterfaceC30688k1 {
    @Override // com.yandex.mobile.ads.impl.InterfaceC30688k1
    @Nullable
    /* renamed from: a */
    public final InterfaceC30595j1 mo28582a(@NotNull Context context, @NotNull RelativeLayout rootLayout, @NotNull C31012o1 listener, @NotNull C29980b1 eventController, @NotNull Intent intent, @NotNull Window window, @Nullable C31942z0 c31942z0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootLayout, "rootLayout");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(window, "window");
        String stringExtra = intent.getStringExtra("extra_browser_url");
        if (stringExtra != null && stringExtra.length() > 0) {
            try {
                C31945z2 c31945z2 = new C31945z2(context);
                Intrinsics.checkNotNullParameter(context, "context");
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setId(1);
                linearLayout.setOrientation(0);
                linearLayout.setBackgroundColor(C31555u7.m28865b());
                return new C31543u0(context, rootLayout, listener, window, stringExtra, c31945z2, linearLayout, C31726w7.m28019c(context), C31726w7.m28018d(context), new r32(new q32()));
            } catch (xd2 unused) {
            }
        }
        return null;
    }
}
