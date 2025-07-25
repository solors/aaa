package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzevk implements zzetr {
    private final JSONObject zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzevk(Context context) {
        this.zza = zzbvg.zzc(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlO)).booleanValue()) {
            return zzgch.zzh(new zzetq() { // from class: com.google.android.gms.internal.ads.zzevi
                @Override // com.google.android.gms.internal.ads.zzetq
                public final void zzb(Object obj) {
                    JSONObject jSONObject = (JSONObject) obj;
                }

                @Override // com.google.android.gms.internal.ads.zzetq
                public final /* synthetic */ void zza(Object obj) {
                }
            });
        }
        return zzgch.zzh(new zzetq() { // from class: com.google.android.gms.internal.ads.zzevj
            {
                zzevk.this = this;
            }

            @Override // com.google.android.gms.internal.ads.zzetq
            public final void zzb(Object obj) {
                zzevk.this.zzc((JSONObject) obj);
            }

            @Override // com.google.android.gms.internal.ads.zzetq
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
