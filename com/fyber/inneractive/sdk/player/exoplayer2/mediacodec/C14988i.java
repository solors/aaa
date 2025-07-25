package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.i */
/* loaded from: classes4.dex */
public final class C14988i implements InterfaceC14986g {

    /* renamed from: a */
    public final int f29406a;

    /* renamed from: b */
    public MediaCodecInfo[] f29407b;

    public C14988i(boolean z) {
        this.f29406a = z ? 1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC14986g
    /* renamed from: a */
    public final boolean mo77337a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC14986g
    /* renamed from: b */
    public final boolean mo77336b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC14986g
    /* renamed from: a */
    public final int mo77339a() {
        if (this.f29407b == null) {
            this.f29407b = new MediaCodecList(this.f29406a).getCodecInfos();
        }
        return this.f29407b.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC14986g
    /* renamed from: a */
    public final MediaCodecInfo mo77338a(int i) {
        if (this.f29407b == null) {
            this.f29407b = new MediaCodecList(this.f29406a).getCodecInfos();
        }
        return this.f29407b[i];
    }
}
