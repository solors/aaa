package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdsh {
    private final String zze;
    private final zzdsb zzf;
    @GuardedBy("this")
    private final List zzb = new ArrayList();
    @GuardedBy("this")
    private boolean zzc = false;
    @GuardedBy("this")
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzv.zzp().zzi();

    public zzdsh(String str, zzdsb zzdsbVar) {
        this.zze = str;
        this.zzf = zzdsbVar;
    }

    private final Map zzg() {
        String str;
        Map zza = this.zzf.zza();
        zza.put("tms", Long.toString(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime(), 10));
        if (this.zza.zzN()) {
            str = "";
        } else {
            str = this.zze;
        }
        zza.put(ScarConstants.TOKEN_ID_KEY, str);
        return zza;
    }

    public final synchronized void zza(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzch)).booleanValue()) {
            return;
        }
        Map zzg = zzg();
        zzg.put("action", "aaia");
        zzg.put("aair", "MalformedJson");
        this.zzb.add(zzg);
    }

    public final synchronized void zzb(String str, String str2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzch)).booleanValue()) {
            return;
        }
        Map zzg = zzg();
        zzg.put("action", "adapter_init_finished");
        zzg.put("ancn", str);
        zzg.put("rqe", str2);
        this.zzb.add(zzg);
    }

    public final synchronized void zzc(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzch)).booleanValue()) {
            return;
        }
        Map zzg = zzg();
        zzg.put("action", "adapter_init_started");
        zzg.put("ancn", str);
        this.zzb.add(zzg);
    }

    public final synchronized void zzd(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzch)).booleanValue()) {
            return;
        }
        Map zzg = zzg();
        zzg.put("action", "adapter_init_finished");
        zzg.put("ancn", str);
        this.zzb.add(zzg);
    }

    public final synchronized void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzch)).booleanValue() && !this.zzd) {
            Map zzg = zzg();
            zzg.put("action", "init_finished");
            this.zzb.add(zzg);
            for (Map map : this.zzb) {
                this.zzf.zzg(map);
            }
            this.zzd = true;
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzch)).booleanValue() && !this.zzc) {
            Map zzg = zzg();
            zzg.put("action", "init_started");
            this.zzb.add(zzg);
            this.zzc = true;
        }
    }
}
