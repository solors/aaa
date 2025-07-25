package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdiq {
    public static final zzdiq zza = new zzdiq(new zzdio());
    @Nullable
    private final zzbgx zzb;
    @Nullable
    private final zzbgu zzc;
    @Nullable
    private final zzbhk zzd;
    @Nullable
    private final zzbhh zze;
    @Nullable
    private final zzbmi zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    @Nullable
    public final zzbgu zza() {
        return this.zzc;
    }

    @Nullable
    public final zzbgx zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzbha zzc(String str) {
        return (zzbha) this.zzh.get(str);
    }

    @Nullable
    public final zzbhd zzd(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return (zzbhd) this.zzg.get(str);
    }

    @Nullable
    public final zzbhh zze() {
        return this.zze;
    }

    @Nullable
    public final zzbhk zzf() {
        return this.zzd;
    }

    @Nullable
    public final zzbmi zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add((String) this.zzg.keyAt(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    private zzdiq(zzdio zzdioVar) {
        this.zzb = zzdioVar.zza;
        this.zzc = zzdioVar.zzb;
        this.zzd = zzdioVar.zzc;
        this.zzg = new SimpleArrayMap(zzdioVar.zzf);
        this.zzh = new SimpleArrayMap(zzdioVar.zzg);
        this.zze = zzdioVar.zzd;
        this.zzf = zzdioVar.zze;
    }
}
