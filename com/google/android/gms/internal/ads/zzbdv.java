package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public class zzbdv {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbdv(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbdv zza(String str, double d) {
        return new zzbdv(str, Double.valueOf(d), 3);
    }

    public static zzbdv zzb(String str, long j) {
        return new zzbdv(str, Long.valueOf(j), 2);
    }

    public static zzbdv zzc(String str, String str2) {
        return new zzbdv("gad:dynamite_module:experiment_id", "", 4);
    }

    public static zzbdv zzd(String str, boolean z) {
        return new zzbdv(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbfa zza = zzbfc.zza();
        if (zza == null) {
            if (zzbfc.zzb() != null) {
                zzbfc.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return zza.zzd(this.zza, (String) this.zzb);
                }
                return zza.zzb(this.zza, ((Double) this.zzb).doubleValue());
            }
            return zza.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
    }
}
