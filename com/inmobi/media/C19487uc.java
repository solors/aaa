package com.inmobi.media;

import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.uc */
/* loaded from: classes6.dex */
public final class C19487uc extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ AbstractC19515wc f48728a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19487uc(AbstractC19515wc abstractC19515wc) {
        super(0);
        this.f48728a = abstractC19515wc;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        AbstractC19515wc abstractC19515wc = this.f48728a;
        return new RunnableC19445rc(abstractC19515wc, abstractC19515wc.f48853i);
    }
}
