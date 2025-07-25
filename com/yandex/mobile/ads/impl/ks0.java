package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes8.dex */
public class ks0 extends C30342fx {
    @Nullable

    /* renamed from: b */
    public final String f81547b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ks0(java.lang.IllegalStateException r3, @androidx.annotation.Nullable com.yandex.mobile.ads.impl.ls0 r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decoder failed: "
            r0.<init>(r1)
            r1 = 0
            if (r4 != 0) goto Lc
            r4 = r1
            goto Le
        Lc:
            java.lang.String r4 = r4.f81919a
        Le:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r4, r3)
            int r4 = com.yandex.mobile.ads.impl.y32.f88010a
            r0 = 21
            if (r4 < r0) goto L22
            java.lang.String r1 = m32446a(r3)
        L22:
            r2.f81547b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ks0.<init>(java.lang.IllegalStateException, com.yandex.mobile.ads.impl.ls0):void");
    }

    @Nullable
    @RequiresApi(21)
    /* renamed from: a */
    private static String m32446a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}
