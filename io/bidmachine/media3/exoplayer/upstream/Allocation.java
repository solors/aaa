package io.bidmachine.media3.exoplayer.upstream;

import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public final class Allocation {
    public final byte[] data;
    public final int offset;

    public Allocation(byte[] bArr, int i) {
        this.data = bArr;
        this.offset = i;
    }
}
