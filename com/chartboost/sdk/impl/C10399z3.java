package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.z3 */
/* loaded from: classes3.dex */
public final class C10399z3 {

    /* renamed from: a */
    public final Context f23665a;

    /* renamed from: b */
    public final C9728b4 f23666b;

    public C10399z3(Context context, C9728b4 displayMeasurement) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        this.f23665a = context;
        this.f23666b = displayMeasurement;
    }

    /* renamed from: a */
    public final int m79813a() {
        Integer m82131b = AbstractC9670a4.m82131b(this.f23665a);
        Intrinsics.checkNotNullExpressionValue(m82131b, "getOpenRTBDeviceType(...)");
        return m82131b.intValue();
    }

    /* renamed from: b */
    public final String m79812b() {
        String m82129d = AbstractC9670a4.m82129d(this.f23665a);
        Intrinsics.checkNotNullExpressionValue(m82129d, "getType(...)");
        return m82129d;
    }

    /* renamed from: c */
    public final boolean m79811c() {
        return AbstractC9766c8.m81906c(this.f23665a, this.f23666b);
    }
}
