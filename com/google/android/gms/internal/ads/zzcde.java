package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzcde implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcde(zzcbs zzcbsVar) {
        Context context = zzcbsVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzv.zzq().zzc(context, zzcbsVar.zzn().afmaVersion);
        this.zzc = new WeakReference(zzcbsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zze(zzcde zzcdeVar, String str, Map map) {
        zzcbs zzcbsVar = (zzcbs) zzcdeVar.zzc.get();
        if (zzcbsVar != null) {
            zzcbsVar.zzd("onPrecacheEvent", map);
        }
    }

    public abstract void zzf();

    public final void zzg(String str, @Nullable String str2, String str3, @Nullable String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdd(this, str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh(String str, String str2, int i) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdb(this, str, str2, i));
    }

    public final void zzj(String str, String str2, long j) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcdc(this, str, str2, j));
    }

    public final void zzn(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcda(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void zzo(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzccz(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzccw zzccwVar) {
        return zzt(str);
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzp(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzq(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzr(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzs(int i) {
    }
}
