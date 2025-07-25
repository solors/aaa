package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfmz extends zzfmv {
    public zzfmz(zzfmo zzfmoVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfmoVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzflk zza = zzflk.zza();
        if (zza != null) {
            for (zzfkt zzfktVar : zza.zzc()) {
                if (((zzfmv) this).zza.contains(zzfktVar.zzh())) {
                    zzfktVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfmw, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
