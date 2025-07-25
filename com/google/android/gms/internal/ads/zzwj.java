package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzwj {
    public static final zzwj zza = new zzwj(new zzbr[0]);
    public final int zzb;
    private final zzfxn zzc;
    private int zzd;

    static {
        Integer.toString(0, 36);
    }

    public zzwj(zzbr... zzbrVarArr) {
        this.zzc = zzfxn.zzm(zzbrVarArr);
        this.zzb = zzbrVarArr.length;
        int i = 0;
        while (i < this.zzc.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zzc.size(); i3++) {
                if (((zzbr) this.zzc.get(i)).equals(this.zzc.get(i3))) {
                    zzdo.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwj.class == obj.getClass()) {
            zzwj zzwjVar = (zzwj) obj;
            if (this.zzb == zzwjVar.zzb && this.zzc.equals(zzwjVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            int hashCode = this.zzc.hashCode();
            this.zzd = hashCode;
            return hashCode;
        }
        return i;
    }

    public final int zza(zzbr zzbrVar) {
        int indexOf = this.zzc.indexOf(zzbrVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzbr zzb(int i) {
        return (zzbr) this.zzc.get(i);
    }

    public final zzfxn zzc() {
        return zzfxn.zzl(zzfyd.zzb(this.zzc, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzwi
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                zzwj zzwjVar = zzwj.zza;
                return Integer.valueOf(((zzbr) obj).zzc);
            }
        }));
    }
}
