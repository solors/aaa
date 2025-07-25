package com.fyber.inneractive.sdk.player.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15092k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.fyber.inneractive.sdk.player.cache.g */
/* loaded from: classes4.dex */
public final class C14753g implements InterfaceC15089h {

    /* renamed from: a */
    public Uri f27966a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final long mo77234a(C15092k c15092k) {
        new CountDownLatch(1);
        new AtomicReference();
        this.f27966a = c15092k.f29706a;
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final int read(byte[] bArr, int i, int i2) {
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final Uri mo77235a() {
        return this.f27966a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final void close() {
    }
}
