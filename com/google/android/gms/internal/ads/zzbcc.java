package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzbcc {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbcc(int i, String str, Object obj, Object obj2, zzbcb zzbcbVar) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzbe.zza().zzd(this);
    }

    public static zzbcc zzf(int i, String str, float f, float f2) {
        return new zzbbz(1, str, Float.valueOf(f), Float.valueOf(f2));
    }

    public static zzbcc zzg(int i, String str, int i2, int i3) {
        return new zzbbx(1, str, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static zzbcc zzh(int i, String str, long j, long j2) {
        return new zzbby(1, str, Long.valueOf(j), Long.valueOf(j2));
    }

    public static zzbcc zzi(int i, String str) {
        zzbca zzbcaVar = new zzbca(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzbe.zza().zzc(zzbcaVar);
        return zzbcaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zzc(SharedPreferences sharedPreferences);

    public abstract void zzd(SharedPreferences.Editor editor, Object obj);

    public final int zze() {
        return this.zza;
    }

    public final Object zzj() {
        return com.google.android.gms.ads.internal.client.zzbe.zzc().zza(this);
    }

    public final Object zzk() {
        if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzf()) {
            return this.zzd;
        }
        return this.zzc;
    }

    public final String zzl() {
        return this.zzb;
    }
}
