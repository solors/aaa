package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzduq {
    private final zzdua zza;
    private final zzdpj zzb;
    private final Object zzc = new Object();
    @GuardedBy("lock")
    private final List zzd = new ArrayList();
    @GuardedBy("lock")
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduq(zzdua zzduaVar, zzdpj zzdpjVar) {
        this.zza = zzduaVar;
        this.zzb = zzdpjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z;
        zzdpi zza;
        zzbrs zzbrsVar;
        synchronized (this.zzc) {
            if (this.zze) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbln zzblnVar = (zzbln) it.next();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjj)).booleanValue()) {
                    zzdpi zza2 = this.zzb.zza(zzblnVar.zza);
                    if (zza2 != null && (zzbrsVar = zza2.zzc) != null) {
                        str = zzbrsVar.toString();
                    }
                    str = "";
                } else {
                    str = "";
                }
                String str2 = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjk)).booleanValue() && (zza = this.zzb.zza(zzblnVar.zza)) != null && zza.zzd) {
                    z = true;
                    List list2 = this.zzd;
                    String str3 = zzblnVar.zza;
                    list2.add(new zzdup(str3, str2, this.zzb.zzb(str3), zzblnVar.zzb ? 1 : 0, zzblnVar.zzd, zzblnVar.zzc, z));
                }
                z = false;
                List list22 = this.zzd;
                String str32 = zzblnVar.zza;
                list22.add(new zzdup(str32, str2, this.zzb.zzb(str32), zzblnVar.zzb ? 1 : 0, zzblnVar.zzd, zzblnVar.zzc, z));
            }
            this.zze = true;
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                } else {
                    zzc();
                }
            }
            for (zzdup zzdupVar : this.zzd) {
                jSONArray.put(zzdupVar.zza());
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzduo(this));
    }
}
