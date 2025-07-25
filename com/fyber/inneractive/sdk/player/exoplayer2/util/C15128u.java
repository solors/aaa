package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14821b;
import com.fyber.inneractive.sdk.player.exoplayer2.C15018s;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.u */
/* loaded from: classes4.dex */
public final class C15128u implements InterfaceC15115h {

    /* renamed from: a */
    public boolean f29824a;

    /* renamed from: b */
    public long f29825b;

    /* renamed from: c */
    public long f29826c;

    /* renamed from: d */
    public C15018s f29827d = C15018s.f29478d;

    /* renamed from: a */
    public final void m77174a(long j) {
        this.f29825b = j;
        if (this.f29824a) {
            this.f29826c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC15115h
    /* renamed from: b */
    public final long mo77172b() {
        long j = this.f29825b;
        if (this.f29824a) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f29826c;
            C15018s c15018s = this.f29827d;
            if (c15018s.f29479a == 1.0f) {
                int i = AbstractC14821b.f28247a;
                long j2 = -9223372036854775807L;
                if (elapsedRealtime != -9223372036854775807L) {
                    j2 = 1000 * elapsedRealtime;
                }
                return j + j2;
            }
            return j + (elapsedRealtime * c15018s.f29481c);
        }
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC15115h
    /* renamed from: a */
    public final C15018s mo77173a(C15018s c15018s) {
        if (this.f29824a) {
            m77174a(mo77172b());
        }
        this.f29827d = c15018s;
        return c15018s;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.InterfaceC15115h
    /* renamed from: a */
    public final C15018s mo77175a() {
        return this.f29827d;
    }
}
