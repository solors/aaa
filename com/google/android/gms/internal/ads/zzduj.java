package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzduj implements zzcvw, zzcyq, zzcxl {
    private final zzduv zza;
    private final String zzb;
    private final String zzc;
    private zzcvm zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdui zze = zzdui.AD_REQUESTED;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduj(zzduv zzduvVar, zzfcj zzfcjVar, String str) {
        this.zza = zzduvVar;
        this.zzc = str;
        this.zzb = zzfcjVar.zzf;
    }

    private static JSONObject zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject zzh;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        if (zzeVar2 == null) {
            zzh = null;
        } else {
            zzh = zzh(zzeVar2);
        }
        jSONObject.put("underlyingError", zzh);
        return jSONObject;
    }

    private final JSONObject zzi(zzcvm zzcvmVar) throws JSONException {
        JSONObject zzh;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcvmVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzcvmVar.zzc());
        jSONObject.put("responseId", zzcvmVar.zzi());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzje)).booleanValue()) {
            String zzd = zzcvmVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjh)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzw zzwVar : zzcvmVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzwVar.zza);
            jSONObject2.put("latencyMillis", zzwVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjf)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(zzwVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzwVar.zzc;
            if (zzeVar == null) {
                zzh = null;
            } else {
                zzh = zzh(zzeVar);
            }
            jSONObject2.put("error", zzh);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zza(zzcqz zzcqzVar) {
        if (this.zza.zzq()) {
            this.zzf = zzcqzVar.zzm();
            this.zze = zzdui.AD_LOADED;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.zze);
        jSONObject2.put("format", zzfbo.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject2.put("shown", this.zzn);
            }
        }
        zzcvm zzcvmVar = this.zzf;
        if (zzcvmVar != null) {
            jSONObject = zzi(zzcvmVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            JSONObject jSONObject3 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzcvm zzcvmVar2 = (zzcvm) iBinder;
                jSONObject3 = zzi(zzcvmVar2);
                if (zzcvmVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjl)).booleanValue() && this.zza.zzq()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfcaVar) {
        if (this.zza.zzq()) {
            int i = 0;
            if (!zzfcaVar.zzb.zza.isEmpty()) {
                this.zzd = ((zzfbo) zzfcaVar.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(zzfcaVar.zzb.zzb.zzl)) {
                this.zzh = zzfcaVar.zzb.zzb.zzl;
            }
            if (!TextUtils.isEmpty(zzfcaVar.zzb.zzb.zzm)) {
                this.zzi = zzfcaVar.zzb.zzb.zzm;
            }
            if (zzfcaVar.zzb.zzb.zzp.length() > 0) {
                this.zzl = zzfcaVar.zzb.zzb.zzp;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjh)).booleanValue()) {
                if (!this.zza.zzs()) {
                    this.zzo = true;
                    return;
                }
                if (!TextUtils.isEmpty(zzfcaVar.zzb.zzb.zzn)) {
                    this.zzj = zzfcaVar.zzb.zzb.zzn;
                }
                if (zzfcaVar.zzb.zzb.zzo.length() > 0) {
                    this.zzk = zzfcaVar.zzb.zzb.zzo;
                }
                zzduv zzduvVar = this.zza;
                JSONObject jSONObject = this.zzk;
                if (jSONObject != null) {
                    i = jSONObject.toString().length();
                }
                if (!TextUtils.isEmpty(this.zzj)) {
                    i += this.zzj.length();
                }
                zzduvVar.zzk(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza.zzq()) {
            this.zze = zzdui.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        if (this.zze != zzdui.AD_REQUESTED) {
            return true;
        }
        return false;
    }
}
