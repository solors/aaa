package com.inmobi.media;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.W5 */
/* loaded from: classes6.dex */
public final class C19148W5 extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ C19161X5 f47899a;

    /* renamed from: b */
    public final /* synthetic */ Context f47900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19148W5(C19161X5 c19161x5, Context context) {
        super(1);
        this.f47899a = c19161x5;
        this.f47900b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C19071Q5 it = (C19071Q5) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        C19161X5 c19161x5 = this.f47899a;
        c19161x5.m60561a(this.f47900b, c19161x5.f47959a, it);
        return Unit.f99208a;
    }
}
