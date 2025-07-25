package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeib implements zzecy {
    private final zzejf zza;
    private final zzdpm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeib(zzejf zzejfVar, zzdpm zzdpmVar) {
        this.zza = zzejfVar;
        this.zzb = zzdpmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecy
    @Nullable
    public final zzecz zza(String str, JSONObject jSONObject) throws zzfcq {
        zzbrd zzbrdVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbM)).booleanValue()) {
            try {
                zzbrdVar = this.zzb.zzb(str);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Coundn't create RTB adapter: ", e);
                zzbrdVar = null;
            }
        } else {
            zzbrdVar = this.zza.zza(str);
        }
        if (zzbrdVar == null) {
            return null;
        }
        return new zzecz(zzbrdVar, new zzees(), str);
    }
}
