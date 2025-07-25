package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcll implements zzclb {
    private final zzduv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcll(zzduv zzduvVar) {
        this.zza = zzduvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zza(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjd)).booleanValue()) {
                this.zza.zzn(jSONObject);
            }
        }
    }
}
