package com.fyber.inneractive.sdk.player.exoplayer2;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15093l;
import io.bidmachine.media3.exoplayer.dash.DashMediaSource;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.c */
/* loaded from: classes4.dex */
public final class C14822c {

    /* renamed from: a */
    public final C15093l f28249a = new C15093l();

    /* renamed from: b */
    public final long f28250b = 15000 * 1000;

    /* renamed from: c */
    public final long f28251c = 30000 * 1000;

    /* renamed from: d */
    public final long f28252d = 2500000;

    /* renamed from: e */
    public final long f28253e = DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;

    /* renamed from: f */
    public int f28254f;

    /* renamed from: g */
    public boolean f28255g;

    /* renamed from: a */
    public final void m77530a(boolean z) {
        this.f28254f = 0;
        this.f28255g = false;
        if (z) {
            C15093l c15093l = this.f28249a;
            synchronized (c15093l) {
                c15093l.m77244a(0);
            }
        }
    }
}
