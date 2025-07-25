package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.bm */
/* loaded from: classes8.dex */
public final class C30034bm {
    @NotNull

    /* renamed from: a */
    private final Context f77358a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C30034bm(android.content.Context r3) {
        /*
            r2 = this;
            android.content.Context r0 = r3.getApplicationContext()
            java.lang.String r1 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C30034bm.<init>(android.content.Context):void");
    }

    @Nullable
    /* renamed from: a */
    public final Bitmap m35459a(@NotNull bh0 imageValue) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        j32 m31633c = n91.f82636c.m31632a(this.f77358a).m31633c();
        String m35470f = imageValue.m35470f();
        Bitmap m33047a = m31633c.m33047a(m35470f);
        if (m33047a != null && m33047a.getWidth() == 1 && m33047a.getHeight() == 1) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(m33047a, imageValue.m35469g(), imageValue.m35475a(), false);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
            m31633c.mo31631a(m35470f, createScaledBitmap);
            return createScaledBitmap;
        }
        return m33047a;
    }

    public C30034bm(@NotNull Context context, @NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f77358a = appContext;
    }
}
