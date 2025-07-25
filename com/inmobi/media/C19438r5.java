package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.r5 */
/* loaded from: classes6.dex */
public final class C19438r5 extends Lambda implements Function1 {

    /* renamed from: a */
    public final /* synthetic */ Function1 f48612a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19438r5(C19013M c19013m) {
        super(1);
        this.f48612a = c19013m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C18952H8 it = (C18952H8) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f48612a.invoke(it.f47317c);
        return Unit.f99208a;
    }
}
