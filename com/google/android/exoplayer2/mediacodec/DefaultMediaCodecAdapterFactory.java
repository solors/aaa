package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.SynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class DefaultMediaCodecAdapterFactory implements MediaCodecAdapter.Factory {

    /* renamed from: a */
    private int f33804a = 0;

    /* renamed from: b */
    private boolean f33805b;

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
    public MediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws IOException {
        int i;
        int i2 = Util.SDK_INT;
        if (i2 >= 23 && ((i = this.f33804a) == 1 || (i == 0 && i2 >= 31))) {
            int trackType = MimeTypes.getTrackType(configuration.format.sampleMimeType);
            Log.m72604i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + Util.getTrackTypeString(trackType));
            return new AsynchronousMediaCodecAdapter.Factory(trackType, this.f33805b).createAdapter(configuration);
        }
        return new SynchronousMediaCodecAdapter.Factory().createAdapter(configuration);
    }

    public void experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean z) {
        this.f33805b = z;
    }

    @CanIgnoreReturnValue
    public DefaultMediaCodecAdapterFactory forceDisableAsynchronous() {
        this.f33804a = 2;
        return this;
    }

    @CanIgnoreReturnValue
    public DefaultMediaCodecAdapterFactory forceEnableAsynchronous() {
        this.f33804a = 1;
        return this;
    }
}
