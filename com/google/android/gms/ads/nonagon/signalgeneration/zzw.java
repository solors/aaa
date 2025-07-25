package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzdee;
import com.google.android.gms.internal.ads.zzdrq;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzw implements zzdee {
    private final zzdrq zza;
    private final zzv zzb;
    private final String zzc;
    private final int zzd;

    @VisibleForTesting
    public zzw(zzdrq zzdrqVar, zzv zzvVar, String str, int i) {
        this.zza = zzdrqVar;
        this.zzb = zzvVar;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable zzbk zzbkVar) {
        String str;
        if (zzbkVar != null && this.zzd != 2) {
            if (!TextUtils.isEmpty(zzbkVar.zzc)) {
                try {
                    str = new JSONObject(zzbkVar.zzc).optString("request_id");
                } catch (JSONException e) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "RenderSignals.getRequestId");
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    this.zzb.zzd(str, zzbkVar.zzc, this.zza);
                    return;
                }
                return;
            }
            this.zzb.zzd(this.zzc, zzbkVar.zzb, this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String str) {
    }
}
