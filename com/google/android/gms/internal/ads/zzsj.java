package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzsj extends Exception {
    @Nullable
    public final String zza;
    public final boolean zzb;
    @Nullable
    public final zzsg zzc;
    @Nullable
    public final String zzd;

    public zzsj(zzab zzabVar, @Nullable Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + zzabVar.toString(), th, zzabVar.zzo, false, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i), null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzsj zza(zzsj zzsjVar, zzsj zzsjVar2) {
        return new zzsj(zzsjVar.getMessage(), zzsjVar.getCause(), zzsjVar.zza, false, zzsjVar.zzc, zzsjVar.zzd, zzsjVar2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzsj(com.google.android.gms.internal.ads.zzab r11, @androidx.annotation.Nullable java.lang.Throwable r12, boolean r13, com.google.android.gms.internal.ads.zzsg r14) {
        /*
            r10 = this;
            java.lang.String r13 = r14.zza
            java.lang.String r0 = r11.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Decoder init failed: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = ", "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r11.zzo
            boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L2d
            r11 = r12
            android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
            java.lang.String r11 = r11.getDiagnosticInfo()
            goto L2e
        L2d:
            r11 = 0
        L2e:
            r8 = r11
            r6 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsj.<init>(com.google.android.gms.internal.ads.zzab, java.lang.Throwable, boolean, com.google.android.gms.internal.ads.zzsg):void");
    }

    private zzsj(@Nullable String str, @Nullable Throwable th, @Nullable String str2, boolean z, @Nullable zzsg zzsgVar, @Nullable String str3, @Nullable zzsj zzsjVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzsgVar;
        this.zzd = str3;
    }
}
