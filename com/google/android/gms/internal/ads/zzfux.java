package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfux extends zzfva {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfux(zzfuy zzfuyVar, zzfvc zzfvcVar, CharSequence charSequence, int i) {
        super(zzfvcVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final int zzd(int i) {
        int i2 = i + 4000;
        if (i2 < ((zzfva) this).zzb.length()) {
            return i2;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final int zzc(int i) {
        return i;
    }
}
