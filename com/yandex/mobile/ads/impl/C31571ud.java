package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ud */
/* loaded from: classes8.dex */
public final class C31571ud {
    @NotNull

    /* renamed from: a */
    private final C31810xd f86210a;

    public C31571ud(@NotNull TextView textView, @NotNull C31810xd appCompatTextViewAutoSizeHelper) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(appCompatTextViewAutoSizeHelper, "appCompatTextViewAutoSizeHelper");
        this.f86210a = appCompatTextViewAutoSizeHelper;
    }

    /* renamed from: a */
    public final void m28822a() {
        this.f86210a.m27571a();
    }

    /* renamed from: b */
    public final void m28819b() {
        this.f86210a.m27571a();
    }

    /* renamed from: a */
    public final void m28821a(int i) {
        this.f86210a.m27570a(i);
    }

    /* renamed from: a */
    public final void m28820a(int i, float f) {
        if (this.f86210a.m27564b()) {
            return;
        }
        this.f86210a.m27569a(i, f);
    }
}
