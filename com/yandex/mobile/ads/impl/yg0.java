package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class yg0 {

    /* renamed from: a */
    private final Context f88213a;

    public yg0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f88213a = context.getApplicationContext();
    }

    @NotNull
    /* renamed from: a */
    public final String m26914a(int i, int i2) {
        Context context = this.f88213a;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int m35260a = cc2.m35260a(context, i);
        Context context2 = this.f88213a;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        int m35260a2 = cc2.m35260a(context2, i2);
        um0.m28728a(new Object[0]);
        if (m35260a < 320 && m35260a2 < 240) {
            if (m35260a < 160 && m35260a2 < 160) {
                return "small";
            }
            return "medium";
        }
        return "large";
    }
}
