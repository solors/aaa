package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzst {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzst(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzst.class) {
            zzst zzstVar = (zzst) obj;
            if (TextUtils.equals(this.zza, zzstVar.zza) && this.zzb == zzstVar.zzb && this.zzc == zzstVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.zza.hashCode() + 31;
        int i2 = 1237;
        if (true != this.zzb) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = ((hashCode * 31) + i) * 31;
        if (true == this.zzc) {
            i2 = 1231;
        }
        return i3 + i2;
    }
}
