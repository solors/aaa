package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdpm {
    private final zzfdf zza;
    private final zzdpj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpm(zzfdf zzfdfVar, zzdpj zzdpjVar) {
        this.zza = zzfdfVar;
        this.zzb = zzdpjVar;
    }

    @VisibleForTesting
    final zzbpe zza() throws RemoteException {
        zzbpe zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbrd zzb(String str) throws RemoteException {
        zzbrd zzc = zza().zzc(str);
        this.zzb.zzd(str, zzc);
        return zzc;
    }

    public final zzfdh zzc(String str, JSONObject jSONObject) throws zzfcq {
        zzbph zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbqf(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbqf(new zzbrw());
            } else {
                zzbpe zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zza.zze(string)) {
                            zzb = zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (zza.zzd(string)) {
                            zzb = zza.zzb(string);
                        } else {
                            zzb = zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Invalid custom event.", e);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfdh zzfdhVar = new zzfdh(zzb);
            this.zzb.zzc(str, zzfdhVar);
            return zzfdhVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjk)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzfcq(th);
        }
    }

    public final boolean zzd() {
        if (this.zza.zzb() != null) {
            return true;
        }
        return false;
    }
}
