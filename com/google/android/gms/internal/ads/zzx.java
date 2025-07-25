package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzx {
    private final SparseBooleanArray zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzx)) {
            return false;
        }
        zzx zzxVar = (zzx) obj;
        if (zzei.zza < 24) {
            if (this.zza.size() != zzxVar.zza.size()) {
                return false;
            }
            for (int i = 0; i < this.zza.size(); i++) {
                if (zza(i) != zzxVar.zza(i)) {
                    return false;
                }
            }
            return true;
        }
        return this.zza.equals(zzxVar.zza);
    }

    public final int hashCode() {
        if (zzei.zza < 24) {
            int size = this.zza.size();
            for (int i = 0; i < this.zza.size(); i++) {
                size = (size * 31) + zza(i);
            }
            return size;
        }
        return this.zza.hashCode();
    }

    public final int zza(int i) {
        zzcw.zza(i, 0, this.zza.size());
        return this.zza.keyAt(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i) {
        return this.zza.get(i);
    }
}
