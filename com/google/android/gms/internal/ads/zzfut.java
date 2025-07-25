package com.google.android.gms.internal.ads;

import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
final class zzfut extends zzfva {
    final /* synthetic */ zzfty zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfut(zzfuu zzfuuVar, zzfvc zzfvcVar, CharSequence charSequence, zzfty zzftyVar) {
        super(zzfvcVar, charSequence);
        this.zza = zzftyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    final int zzd(int i) {
        CharSequence charSequence = ((zzfva) this).zzb;
        int length = charSequence.length();
        zzfun.zzb(i, length, FirebaseAnalytics.Param.INDEX);
        while (i < length) {
            if (!this.zza.zzb(charSequence.charAt(i))) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}
