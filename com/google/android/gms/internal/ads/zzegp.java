package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzegp {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    @Nullable
    final Integer zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegp(String str, String str2, int i, long j, @Nullable Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = j;
        this.zze = num;
    }

    public final String toString() {
        String str = this.zza + "." + this.zzc + "." + this.zzd;
        if (!TextUtils.isEmpty(this.zzb)) {
            str = str + "." + this.zzb;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbK)).booleanValue() && this.zze != null && !TextUtils.isEmpty(this.zzb)) {
            return str + "." + this.zze;
        }
        return str;
    }
}
