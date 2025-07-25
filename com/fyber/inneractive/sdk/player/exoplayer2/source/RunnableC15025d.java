package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C14761B;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14821b;
import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15092k;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.d */
/* loaded from: classes4.dex */
public final class RunnableC15025d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object f29503a;

    /* renamed from: b */
    public final /* synthetic */ long f29504b;

    /* renamed from: c */
    public final /* synthetic */ long f29505c;

    /* renamed from: d */
    public final /* synthetic */ IOException f29506d;

    /* renamed from: e */
    public final /* synthetic */ C15027f f29507e;

    public RunnableC15025d(C15027f c15027f, C15092k c15092k, int i, int i2, C15014o c15014o, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        this.f29507e = c15027f;
        this.f29503a = obj;
        this.f29504b = j;
        this.f29505c = j2;
        this.f29506d = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14761B c14761b = this.f29507e.f29512b;
        AbstractC14821b.m77531a(this.f29504b);
        C15027f.m77303a(this.f29507e, this.f29505c);
        IAlog.m76529a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", c14761b.m77639a(), this.f29506d);
    }
}
