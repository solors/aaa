package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.n */
/* loaded from: classes3.dex */
public abstract class AbstractC10057n {
    /* renamed from: a */
    public static final void m81049a(C9733b7 c9733b7, Function1 isSuccess, Function2 isError) {
        Intrinsics.checkNotNullParameter(c9733b7, "<this>");
        Intrinsics.checkNotNullParameter(isSuccess, "isSuccess");
        Intrinsics.checkNotNullParameter(isError, "isError");
        if (c9733b7.m82018b() == null) {
            isSuccess.invoke(c9733b7);
        } else {
            isError.mo105910invoke(c9733b7, c9733b7.m82018b());
        }
    }
}
