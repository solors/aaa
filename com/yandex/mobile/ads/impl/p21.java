package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
final class p21 extends Lambda implements Functions<Bitmap> {

    /* renamed from: b */
    final /* synthetic */ wg0 f83697b;

    /* renamed from: c */
    final /* synthetic */ bh0 f83698c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p21(wg0 wg0Var, bh0 bh0Var) {
        super(0);
        this.f83697b = wg0Var;
        this.f83698c = bh0Var;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Bitmap invoke() {
        return this.f83697b.mo27906b(this.f83698c);
    }
}
