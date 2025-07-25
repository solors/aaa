package com.inmobi.media;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.ha */
/* loaded from: classes6.dex */
public final class C19303ha extends Lambda implements Function2 {

    /* renamed from: a */
    public static final C19303ha f48304a = new C19303ha();

    public C19303ha() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public final Object mo105910invoke(Object obj, Object obj2) {
        C19289ga _request = (C19289ga) obj;
        long longValue = ((Number) obj2).longValue();
        Intrinsics.checkNotNullParameter(_request, "_request");
        AbstractC19317ia.m60221a(_request, longValue);
        return Unit.f99208a;
    }
}
