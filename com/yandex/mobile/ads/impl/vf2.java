package com.yandex.mobile.ads.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
final class vf2 extends Lambda implements Functions<Unit> {

    /* renamed from: b */
    final /* synthetic */ wf2 f86732b;

    /* renamed from: c */
    final /* synthetic */ String f86733c = "Cannot load bidder token. Token generation failed";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf2(wf2 wf2Var) {
        super(0);
        this.f86732b = wf2Var;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Unit invoke() {
        this.f86732b.f87250a.onBidderTokenFailedToLoad(this.f86733c);
        return Unit.f99208a;
    }
}
