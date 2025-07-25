package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.C21114v8;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzape {
    private final String zza;
    private final String zzb;

    public zzape(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzape.class == obj.getClass()) {
            zzape zzapeVar = (zzape) obj;
            if (TextUtils.equals(this.zza, zzapeVar.zza) && TextUtils.equals(this.zzb, zzapeVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.zza + ",value=" + this.zzb + C21114v8.C21123i.f54139e;
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
