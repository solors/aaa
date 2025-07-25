package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.AbstractC15023a;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15092k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c */
/* loaded from: classes4.dex */
public final class C14848c extends AbstractC15023a {

    /* renamed from: i */
    public byte[] f28356i;

    /* renamed from: j */
    public int f28357j;

    /* renamed from: k */
    public volatile boolean f28358k;

    /* renamed from: l */
    public final String f28359l;

    /* renamed from: m */
    public byte[] f28360m;

    public C14848c(InterfaceC15089h interfaceC15089h, C15092k c15092k, C15014o c15014o, int i, Object obj, byte[] bArr, String str) {
        super(3, i, -9223372036854775807L, -9223372036854775807L, c15014o, interfaceC15089h, c15092k, obj);
        this.f28356i = bArr;
        this.f28359l = str;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15107z
    /* renamed from: a */
    public final boolean mo77227a() {
        return this.f28358k;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15107z
    /* renamed from: b */
    public final void mo77226b() {
        this.f28358k = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.AbstractC15023a
    /* renamed from: c */
    public final long mo77304c() {
        return this.f28357j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15107z
    public final void load() {
        try {
            this.f29501h.mo77234a(this.f29494a);
            int i = 0;
            this.f28357j = 0;
            while (i != -1 && !this.f28358k) {
                byte[] bArr = this.f28356i;
                if (bArr == null) {
                    this.f28356i = new byte[16384];
                } else if (bArr.length < this.f28357j + 16384) {
                    this.f28356i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f29501h.read(this.f28356i, this.f28357j, 16384);
                if (i != -1) {
                    this.f28357j += i;
                }
            }
            if (!this.f28358k) {
                this.f28360m = Arrays.copyOf(this.f28356i, this.f28357j);
            }
        } finally {
            AbstractC15133z.m77161a(this.f29501h);
        }
    }
}
