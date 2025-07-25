package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C14761B;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14821b;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15092k;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.b */
/* loaded from: classes4.dex */
public final class RunnableC15021b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f29486a;

    /* renamed from: b */
    public final /* synthetic */ long f29487b;

    /* renamed from: c */
    public final /* synthetic */ long f29488c;

    /* renamed from: d */
    public final /* synthetic */ C15027f f29489d;

    public RunnableC15021b(C15027f c15027f, C15092k c15092k, int i, int i2, C15014o c15014o, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        this.f29489d = c15027f;
        this.f29486a = obj;
        this.f29487b = j;
        this.f29488c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14761B c14761b = this.f29489d.f29512b;
        AbstractC14821b.m77531a(this.f29487b);
        C15027f.m77303a(this.f29489d, this.f29488c);
        IAlog.m76529a("%s AdaptiveMediaSourceEventListener onLoadCompleted called.", c14761b.m77639a());
    }
}
