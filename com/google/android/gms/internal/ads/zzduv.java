package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C19577ad;
import com.ironsource.C19897f5;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzduv implements zzdvw, zzdug {
    private final zzdvg zza;
    private final zzdvx zzb;
    private final zzduh zzc;
    private final zzduq zzd;
    private final zzduf zze;
    private final zzdvs zzf;
    private final zzdvc zzg;
    private final zzdvc zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = JsonUtils.EMPTY_JSON;
    private long zzq = Long.MAX_VALUE;
    private zzdur zzr = zzdur.NONE;
    private zzduu zzv = zzduu.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduv(zzdvg zzdvgVar, zzdvx zzdvxVar, zzduh zzduhVar, Context context, VersionInfoParcel versionInfoParcel, zzduq zzduqVar, zzdvs zzdvsVar, zzdvc zzdvcVar, zzdvc zzdvcVar2, String str) {
        this.zza = zzdvgVar;
        this.zzb = zzdvxVar;
        this.zzc = zzduhVar;
        this.zze = new zzduf(context);
        this.zzi = versionInfoParcel.afmaVersion;
        this.zzk = str;
        this.zzd = zzduqVar;
        this.zzf = zzdvsVar;
        this.zzg = zzdvcVar;
        this.zzh = zzdvcVar2;
        this.zzj = context;
        com.google.android.gms.ads.internal.zzv.zzt().zzg(this);
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzx(jSONObject.optBoolean("isTestMode", false), false);
            zzw((zzdur) Enum.valueOf(zzdur.class, jSONObject.optString("gesture", InterfaceC32663coo2iico.cco22)), false);
            this.zzo = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject zzt() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.zzl.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (zzduj zzdujVar : (List) entry.getValue()) {
                if (zzdujVar.zzg()) {
                    jSONArray.put(zzdujVar.zzd());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void zzu() {
        this.zzu = true;
        this.zzd.zzc();
        this.zza.zzh(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        zzbcc zzbccVar = zzbcl.zzjq;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar))) {
            this.zzg.zzb(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).split(",")));
        }
        zzbcc zzbccVar2 = zzbcl.zzjr;
        if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar2))) {
            this.zzh.zzb(this.zzj.getSharedPreferences("admob", 0), Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar2)).split(",")));
        }
        zzA(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzk());
        this.zzx = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzl();
    }

    private final void zzv() {
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzB(zzd());
    }

    private final synchronized void zzw(zzdur zzdurVar, boolean z) {
        if (this.zzr != zzdurVar) {
            if (zzq()) {
                zzy();
            }
            this.zzr = zzdurVar;
            if (zzq()) {
                zzz();
            }
            if (z) {
                zzv();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:12:0x0026, B:17:0x0035, B:13:0x002a, B:15:0x0030), top: B:25:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void zzx(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzs     // Catch: java.lang.Throwable -> L3c
            if (r0 != r2) goto L6
            goto L3a
        L6:
            r1.zzs = r2     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L2a
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzjc     // Catch: java.lang.Throwable -> L3c
            com.google.android.gms.internal.ads.zzbcj r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r0.zza(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L26
            com.google.android.gms.ads.internal.util.zzay r2 = com.google.android.gms.ads.internal.zzv.zzt()     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r2.zzl()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L2a
        L26:
            r1.zzz()     // Catch: java.lang.Throwable -> L3c
            goto L33
        L2a:
            boolean r2 = r1.zzq()     // Catch: java.lang.Throwable -> L3c
            if (r2 != 0) goto L33
            r1.zzy()     // Catch: java.lang.Throwable -> L3c
        L33:
            if (r3 == 0) goto L3a
            r1.zzv()     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r1)
            return
        L3a:
            monitor-exit(r1)
            return
        L3c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzduv.zzx(boolean, boolean):void");
    }

    private final synchronized void zzy() {
        int ordinal = this.zzr.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzb();
            return;
        }
        this.zzb.zzb();
    }

    private final synchronized void zzz() {
        int ordinal = this.zzr.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzc();
            return;
        }
        this.zzb.zzc();
    }

    public final zzdur zza() {
        return this.zzr;
    }

    public final synchronized ListenableFuture zzb(String str) {
        zzcab zzcabVar;
        zzcabVar = new zzcab();
        if (this.zzm.containsKey(str)) {
            zzcabVar.zzc((zzduj) this.zzm.get(str));
        } else {
            if (!this.zzn.containsKey(str)) {
                this.zzn.put(str, new ArrayList());
            }
            ((List) this.zzn.get(str)).add(zzcabVar);
        }
        return zzcabVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzq()) {
            if (this.zzq < com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000) {
                this.zzo = JsonUtils.EMPTY_JSON;
                this.zzq = Long.MAX_VALUE;
                return "";
            } else if (!this.zzo.equals(JsonUtils.EMPTY_JSON)) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            if (this.zzq > com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            if (!TextUtils.isEmpty(this.zzk)) {
                String str = this.zzk;
                jSONObject.put("sdkVersion", "afma-sdk-a-v" + str);
            }
            jSONObject.put("internalSdkVersion", this.zzi);
            jSONObject.put("osVersion", Build.VERSION.RELEASE);
            jSONObject.put("adapters", this.zzd.zza());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjn)).booleanValue()) {
                String zzn = com.google.android.gms.ads.internal.zzv.zzp().zzn();
                if (!TextUtils.isEmpty(zzn)) {
                    jSONObject.put(C19577ad.f49048E, zzn);
                }
            }
            if (this.zzq < com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000) {
                this.zzo = JsonUtils.EMPTY_JSON;
            }
            jSONObject.put("networkExtras", this.zzo);
            jSONObject.put("adSlots", zzt());
            jSONObject.put("appInfo", this.zze.zza());
            String zzc = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc();
            if (!TextUtils.isEmpty(zzc)) {
                jSONObject.put("cld", new JSONObject(zzc));
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjd)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                String obj = jSONObject2.toString();
                com.google.android.gms.ads.internal.util.client.zzo.zze("Server data: " + obj);
                jSONObject.put(C19897f5.f50016r, this.zzp);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
                jSONObject.put("openAction", this.zzv);
                jSONObject.put("gesture", this.zzr);
            }
            jSONObject.put("isGamRegisteredTestDevice", com.google.android.gms.ads.internal.zzv.zzt().zzl());
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            jSONObject.put("isSimulator", com.google.android.gms.ads.internal.util.client.zzf.zzr());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjp)).booleanValue()) {
                jSONObject.put("uiStorage", new JSONObject(this.zzx));
            }
            if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjr))) {
                jSONObject.put("gmaDisk", this.zzh.zza());
            }
            if (!TextUtils.isEmpty((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjq))) {
                jSONObject.put("userDisk", this.zzg.zza());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "Inspector.toJson");
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Ad inspector encountered an error", e);
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzduj zzdujVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzq()) {
            if (this.zzt >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziP)).intValue()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzl.containsKey(str)) {
                this.zzl.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) this.zzl.get(str)).add(zzdujVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
                String zzc = zzdujVar.zzc();
                this.zzm.put(zzc, zzdujVar);
                if (this.zzn.containsKey(zzc)) {
                    List<zzcab> list = (List) this.zzn.get(zzc);
                    for (zzcab zzcabVar : list) {
                        zzcabVar.zzc(zzdujVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().zzi().zzM()) {
                zzu();
                return;
            }
            String zzk = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzk();
            if (!TextUtils.isEmpty(zzk)) {
                try {
                    if (new JSONObject(zzk).optBoolean("isTestMode", false)) {
                        zzu();
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzdl zzdlVar, zzduu zzduuVar) {
        if (!zzq()) {
            try {
                zzdlVar.zze(zzfdk.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue()) {
            try {
                zzdlVar.zze(zzfdk.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector had an internal error.");
                return;
            }
        }
        this.zzv = zzduuVar;
        this.zza.zzj(zzdlVar, new zzbkj(this), new zzbkc(this.zzf), new zzbjq(this));
        return;
    }

    public final synchronized void zzi(String str, long j) {
        this.zzo = str;
        this.zzq = j;
        zzv();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzC(this.zzx);
    }

    public final synchronized void zzk(long j) {
        this.zzw += j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r2 != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzl(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.zzu
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.zzu()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.zzs
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.zzz()
            return
        L15:
            boolean r2 = r1.zzq()
            if (r2 != 0) goto L1e
            r1.zzy()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzduv.zzl(boolean):void");
    }

    public final void zzm(zzdur zzdurVar) {
        zzw(zzdurVar, true);
    }

    public final synchronized void zzn(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final void zzo(boolean z) {
        if (!this.zzu && z) {
            zzu();
        }
        zzx(z, true);
    }

    public final boolean zzp() {
        if (this.zzp != null) {
            return true;
        }
        return false;
    }

    public final synchronized boolean zzq() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
            if (!this.zzs && !com.google.android.gms.ads.internal.zzv.zzt().zzl()) {
                return false;
            }
            return true;
        }
        return this.zzs;
    }

    public final synchronized boolean zzr() {
        return this.zzs;
    }

    public final boolean zzs() {
        if (this.zzw < ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzji)).longValue()) {
            return true;
        }
        return false;
    }
}
