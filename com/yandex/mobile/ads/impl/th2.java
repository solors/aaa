package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
final class th2 extends Lambda implements Functions<Unit> {

    /* renamed from: b */
    final /* synthetic */ sh2 f85689b;

    /* renamed from: c */
    final /* synthetic */ VideoAd f85690c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th2(sh2 sh2Var, VideoAd videoAd) {
        super(0);
        this.f85689b = sh2Var;
        this.f85690c = videoAd;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Unit invoke() {
        this.f85689b.f85253a.onAdPrepared(this.f85690c);
        return Unit.f99208a;
    }
}
