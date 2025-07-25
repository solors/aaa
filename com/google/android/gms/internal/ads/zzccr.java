package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzccr extends zzaqv {
    static final zzccr zzb = new zzccr();

    zzccr() {
    }

    @Override // com.google.android.gms.internal.ads.zzaqv
    public final zzaqz zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzarb();
        }
        if ("mvhd".equals(str)) {
            return new zzarc();
        }
        return new zzard(str);
    }
}
