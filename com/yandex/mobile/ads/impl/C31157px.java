package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.yandex.mobile.ads.impl.px */
/* loaded from: classes8.dex */
public final class C31157px extends Lambda implements Functions<Long> {

    /* renamed from: b */
    final /* synthetic */ C31243qx f84100b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31157px(C31243qx c31243qx) {
        super(0);
        this.f84100b = c31243qx;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Long invoke() {
        TimeUnit timeUnit;
        timeUnit = this.f84100b.f84574a;
        return Long.valueOf(timeUnit.toMillis(C31243qx.m30200a(this.f84100b)));
    }
}
