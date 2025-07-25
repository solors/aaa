package com.inmobi.media;

import kotlin.collections._Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.A6 */
/* loaded from: classes6.dex */
public final class C18852A6 extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ int[] f47090a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18852A6(int[] iArr) {
        super(1);
        this.f47090a = iArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean m17340L;
        C18945H1 event = (C18945H1) obj;
        Intrinsics.checkNotNullParameter(event, "event");
        m17340L = _Arrays.m17340L(this.f47090a, event.f47304a);
        return Boolean.valueOf(m17340L);
    }
}
