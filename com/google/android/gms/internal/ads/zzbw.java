package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public class zzbw {
    public final zzfxq zzB;
    public final zzfxs zzC;
    public final int zzi;
    public final int zzj;
    public final boolean zzk;
    public final zzfxn zzl;
    public final zzfxn zzm;
    public final zzfxn zzo;
    public final zzfxn zzs;
    public final zzbu zzt;
    public final zzfxn zzu;
    public final int zzv;
    public final int zza = Integer.MAX_VALUE;
    public final int zzb = Integer.MAX_VALUE;
    public final int zzc = Integer.MAX_VALUE;
    public final int zzd = Integer.MAX_VALUE;
    public final int zze = 0;
    public final int zzf = 0;
    public final int zzg = 0;
    public final int zzh = 0;
    public final int zzn = 0;
    public final int zzp = 0;
    public final int zzq = Integer.MAX_VALUE;
    public final int zzr = Integer.MAX_VALUE;
    public final int zzw = 0;
    public final boolean zzx = false;
    public final boolean zzy = false;
    public final boolean zzz = false;
    public final boolean zzA = false;

    static {
        new zzbw(new zzbv());
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
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
    }

    public zzbw(zzbv zzbvVar) {
        int i;
        int i2;
        boolean z;
        zzfxn zzfxnVar;
        zzfxn zzfxnVar2;
        zzfxn zzfxnVar3;
        zzfxn zzfxnVar4;
        zzbu zzbuVar;
        zzfxn zzfxnVar5;
        int i3;
        HashMap hashMap;
        HashSet hashSet;
        i = zzbvVar.zze;
        this.zzi = i;
        i2 = zzbvVar.zzf;
        this.zzj = i2;
        z = zzbvVar.zzg;
        this.zzk = z;
        zzfxnVar = zzbvVar.zzh;
        this.zzl = zzfxnVar;
        zzfxnVar2 = zzbvVar.zzi;
        this.zzm = zzfxnVar2;
        this.zzn = 0;
        zzfxnVar3 = zzbvVar.zzj;
        this.zzo = zzfxnVar3;
        this.zzp = 0;
        this.zzq = Integer.MAX_VALUE;
        this.zzr = Integer.MAX_VALUE;
        zzfxnVar4 = zzbvVar.zzm;
        this.zzs = zzfxnVar4;
        zzbuVar = zzbvVar.zzn;
        this.zzt = zzbuVar;
        zzfxnVar5 = zzbvVar.zzo;
        this.zzu = zzfxnVar5;
        i3 = zzbvVar.zzp;
        this.zzv = i3;
        this.zzw = 0;
        this.zzx = false;
        this.zzy = false;
        this.zzz = false;
        this.zzA = false;
        hashMap = zzbvVar.zzq;
        this.zzB = zzfxq.zzc(hashMap);
        hashSet = zzbvVar.zzr;
        this.zzC = zzfxs.zzl(hashSet);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzbw zzbwVar = (zzbw) obj;
            if (this.zzk == zzbwVar.zzk && this.zzi == zzbwVar.zzi && this.zzj == zzbwVar.zzj && this.zzl.equals(zzbwVar.zzl) && this.zzm.equals(zzbwVar.zzm) && this.zzo.equals(zzbwVar.zzo) && this.zzs.equals(zzbwVar.zzs) && this.zzt.equals(zzbwVar.zzt) && this.zzu.equals(zzbwVar.zzu) && this.zzv == zzbwVar.zzv && this.zzB.equals(zzbwVar.zzB) && this.zzC.equals(zzbwVar.zzC)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.zzk ? 1 : 0) - 1048002209) * 31) + this.zzi) * 31) + this.zzj) * 31) + this.zzl.hashCode()) * 31) + this.zzm.hashCode()) * 961) + this.zzo.hashCode()) * 961) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31) + this.zzs.hashCode()) * 31) + 29791) * 31) + this.zzu.hashCode()) * 31) + this.zzv) * 887503681) + this.zzB.hashCode()) * 31) + this.zzC.hashCode();
    }
}
