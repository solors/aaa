package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.h */
/* loaded from: classes4.dex */
public final class C14987h implements InterfaceC14986g {
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC14986g
    /* renamed from: a */
    public final int mo77339a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC14986g
    /* renamed from: b */
    public final boolean mo77336b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC14986g
    /* renamed from: a */
    public final MediaCodecInfo mo77338a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.InterfaceC14986g
    /* renamed from: a */
    public final boolean mo77337a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
