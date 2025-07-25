package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class yd2 {
    @NotNull

    /* renamed from: a */
    private final hh1 f88181a;

    public yd2(@NotNull hh1 processNameProvider) {
        Intrinsics.checkNotNullParameter(processNameProvider, "processNameProvider");
        this.f88181a = processNameProvider;
    }

    /* renamed from: a */
    public final void m26940a() {
        String str;
        String m33551a = this.f88181a.m33551a();
        if (m33551a != null) {
            str = C37690r.m16602L0(m33551a, ":", "");
        } else {
            str = null;
        }
        if (str != null && str.length() > 0) {
            try {
                WebView.setDataDirectorySuffix(str);
            } catch (Throwable unused) {
            }
        }
    }
}
