package com.chartboost.sdk.impl;

import kotlin.Tuples;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.c0 */
/* loaded from: classes3.dex */
public final class C9752c0 {

    /* renamed from: a */
    public static final C9752c0 f21760a = new C9752c0();

    /* renamed from: a */
    public final Tuples m81945a(C10372y0 appRequest, C9673a7 params, Function2 loadOpenRTBAd, Function2 loadAdGet) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadOpenRTBAd, "loadOpenRTBAd");
        Intrinsics.checkNotNullParameter(loadAdGet, "loadAdGet");
        if (appRequest.m79989c() != null) {
            return new Tuples(loadOpenRTBAd, params);
        }
        return new Tuples(loadAdGet, params);
    }
}
