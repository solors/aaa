package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C14761B;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14821b;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.e */
/* loaded from: classes4.dex */
public final class RunnableC15026e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f29508a;

    /* renamed from: b */
    public final /* synthetic */ long f29509b;

    /* renamed from: c */
    public final /* synthetic */ C15027f f29510c;

    public RunnableC15026e(C15027f c15027f, int i, C15014o c15014o, int i2, Object obj, long j) {
        this.f29510c = c15027f;
        this.f29508a = obj;
        this.f29509b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14761B c14761b = this.f29510c.f29512b;
        AbstractC14821b.m77531a(this.f29509b);
        IAlog.m76529a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", c14761b.m77639a());
    }
}
