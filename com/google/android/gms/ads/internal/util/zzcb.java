package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import com.google.android.gms.internal.ads.zzbcl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzcb {
    @GuardedBy("this")
    private final Map zza = new HashMap();
    @GuardedBy("this")
    private final List zzb = new ArrayList();
    private final Context zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcb(Context context) {
        this.zzc = context;
    }

    final synchronized void zzb(String str) {
        SharedPreferences sharedPreferences;
        if (this.zza.containsKey(str)) {
            return;
        }
        if (Objects.equals(str, "__default__")) {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
        } else {
            sharedPreferences = this.zzc.getSharedPreferences(str, 0);
        }
        zzca zzcaVar = new zzca(this, str);
        this.zza.put(str, zzcaVar);
        sharedPreferences.registerOnSharedPreferenceChangeListener(zzcaVar);
    }

    public final void zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkm)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        Map zzw = zzs.zzw((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkr));
        for (String str : zzw.keySet()) {
            zzb(str);
        }
        zzd(new zzbz(zzw));
    }

    final synchronized void zzd(zzbz zzbzVar) {
        this.zzb.add(zzbzVar);
    }
}
