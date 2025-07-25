package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzedb {
    private final String zzc;
    @Nullable
    private zzfbr zzd = null;
    @Nullable
    private zzfbo zze = null;
    @Nullable
    private com.google.android.gms.ads.internal.client.zzw zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzedb(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfbo zzfboVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            return zzfboVar.zzap;
        }
        return zzfboVar.zzw;
    }

    private final synchronized void zzk(zzfbo zzfboVar, int i) {
        Map map = this.zzb;
        String zzj = zzj(zzfboVar);
        if (map.containsKey(zzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzfboVar.zzv.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzfboVar.zzv.getString(next));
            } catch (JSONException unused) {
            }
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = new com.google.android.gms.ads.internal.client.zzw(zzfboVar.zzE, 0L, null, bundle, zzfboVar.zzF, zzfboVar.zzG, zzfboVar.zzH, zzfboVar.zzI);
        try {
            this.zza.add(i, zzwVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzj, zzwVar);
    }

    private final void zzl(zzfbo zzfboVar, long j, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar, boolean z) {
        Map map = this.zzb;
        String zzj = zzj(zzfboVar);
        if (map.containsKey(zzj)) {
            if (this.zze == null) {
                this.zze = zzfboVar;
            }
            com.google.android.gms.ads.internal.client.zzw zzwVar = (com.google.android.gms.ads.internal.client.zzw) this.zzb.get(zzj);
            zzwVar.zzb = j;
            zzwVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgD)).booleanValue() && z) {
                this.zzf = zzwVar;
            }
        }
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzw zza() {
        return this.zzf;
    }

    public final zzcvm zzb() {
        return new zzcvm(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfbo zzfboVar) {
        zzk(zzfboVar, this.zza.size());
    }

    public final void zze(zzfbo zzfboVar) {
        int indexOf = this.zza.indexOf(this.zzb.get(zzj(zzfboVar)));
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            indexOf = this.zza.indexOf(this.zzf);
        }
        if (indexOf >= 0 && indexOf < this.zzb.size()) {
            this.zzf = (com.google.android.gms.ads.internal.client.zzw) this.zza.get(indexOf);
            while (true) {
                indexOf++;
                if (indexOf < this.zza.size()) {
                    com.google.android.gms.ads.internal.client.zzw zzwVar = (com.google.android.gms.ads.internal.client.zzw) this.zza.get(indexOf);
                    zzwVar.zzb = 0L;
                    zzwVar.zzc = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzf(zzfbo zzfboVar, long j, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfboVar, j, zzeVar, false);
    }

    public final void zzg(zzfbo zzfboVar, long j, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfboVar, j, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int indexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzw) this.zzb.get(str));
            try {
                this.zza.remove(indexOf);
            } catch (IndexOutOfBoundsException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfbo) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzi(zzfbr zzfbrVar) {
        this.zzd = zzfbrVar;
    }
}
