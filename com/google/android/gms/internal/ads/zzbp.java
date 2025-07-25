package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbp {
    public static final Object zza = new Object();
    private static final zzar zzp;
    @Nullable
    @Deprecated
    public Object zzc;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    @Nullable
    public zzal zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;
    public Object zzb = zza;
    public zzar zzd = zzp;

    static {
        zzaf zzafVar = new zzaf();
        zzafVar.zza("androidx.media3.common.Timeline");
        zzafVar.zzb(Uri.EMPTY);
        zzp = zzafVar.zzc();
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbp.class.equals(obj.getClass())) {
            zzbp zzbpVar = (zzbp) obj;
            if (Objects.equals(this.zzb, zzbpVar.zzb) && Objects.equals(this.zzd, zzbpVar.zzd) && Objects.equals(this.zzj, zzbpVar.zzj) && this.zze == zzbpVar.zze && this.zzf == zzbpVar.zzf && this.zzg == zzbpVar.zzg && this.zzh == zzbpVar.zzh && this.zzi == zzbpVar.zzi && this.zzk == zzbpVar.zzk && this.zzm == zzbpVar.zzm && this.zzn == zzbpVar.zzn && this.zzo == zzbpVar.zzo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.zzb.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzal zzalVar = this.zzj;
        if (zzalVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzalVar.hashCode();
        }
        long j = this.zze;
        long j2 = this.zzf;
        long j3 = this.zzg;
        int i = (((((((((((((hashCode2 * 961) + hashCode) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
        long j4 = this.zzm;
        return ((((((i * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.zzn) * 31) + this.zzo) * 31;
    }

    public final zzbp zza(Object obj, @Nullable zzar zzarVar, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable zzal zzalVar, long j4, long j5, int i, int i2, long j6) {
        zzar zzarVar2;
        this.zzb = obj;
        if (zzarVar == null) {
            zzarVar2 = zzp;
        } else {
            zzarVar2 = zzarVar;
        }
        this.zzd = zzarVar2;
        this.zzc = null;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z;
        this.zzi = z2;
        this.zzj = zzalVar;
        this.zzl = 0L;
        this.zzm = j5;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        if (this.zzj != null) {
            return true;
        }
        return false;
    }
}
