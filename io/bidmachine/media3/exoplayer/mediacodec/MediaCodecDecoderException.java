package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.DecoderException;

@UnstableApi
/* loaded from: classes9.dex */
public class MediaCodecDecoderException extends DecoderException {
    @Nullable
    public final MediaCodecInfo codecInfo;
    @Nullable
    public final String diagnosticInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaCodecDecoderException(java.lang.Throwable r4, @androidx.annotation.Nullable io.bidmachine.media3.exoplayer.mediacodec.MediaCodecInfo r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            java.lang.String r2 = r5.name
        L11:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.codecInfo = r5
            int r5 = io.bidmachine.media3.common.util.Util.SDK_INT
            r0 = 21
            if (r5 < r0) goto L27
            java.lang.String r1 = getDiagnosticInfoV21(r4)
        L27:
            r3.diagnosticInfo = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.mediacodec.MediaCodecDecoderException.<init>(java.lang.Throwable, io.bidmachine.media3.exoplayer.mediacodec.MediaCodecInfo):void");
    }

    @Nullable
    @RequiresApi(21)
    private static String getDiagnosticInfoV21(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
