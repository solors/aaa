package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.ironsource.C19577ad;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbco {
    private final String zza = (String) zzbef.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbco(Context context, String str) {
        String packageName;
        Object obj;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzv.zzq();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.zzs());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        com.google.android.gms.ads.internal.zzv.zzq();
        if (true != com.google.android.gms.ads.internal.util.zzs.zzF(context)) {
            obj = "0";
        } else {
            obj = "1";
        }
        linkedHashMap.put("is_lite_sdk", obj);
        Future zzb = com.google.android.gms.ads.internal.zzv.zzn().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbvo) zzb.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbvo) zzb.get()).zzk));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzli)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzv.zzq();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzs.zzC(context) ? "1" : "0");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjn)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzct)).booleanValue() && !zzfve.zzd(com.google.android.gms.ads.internal.zzv.zzp().zzn())) {
                this.zzb.put(C19577ad.f49048E, com.google.android.gms.ads.internal.zzv.zzp().zzn());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzc() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzd() {
        return this.zzb;
    }
}
