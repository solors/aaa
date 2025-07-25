package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class o80 extends AbstractC31651vf<n80, bh0> {
    @Override // com.yandex.mobile.ads.impl.AbstractC31651vf
    /* renamed from: a */
    public final C31034of mo28323a(Object obj, String name) {
        bh0 value = (bh0) obj;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return AbstractC31651vf.m28322a(name, "feedback", new n80(value));
    }
}
