package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzduu;
import com.google.android.gms.internal.ads.zzduv;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzay {
    private zzduv zzg;
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    @VisibleForTesting
    protected String zza = "";

    @Nullable
    @VisibleForTesting
    protected static final String zzo(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str2));
        ListenableFuture zzb = new zzbo(context).zzb(0, str, hashMap, null);
        try {
            return (String) zzb.get(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeO)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            zzb.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e2);
            zzb.cancel(true);
            return null;
        } catch (Exception e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzv.zzq();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    this.zzc = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzv.zzq();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.zzc;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final zzduv zza() {
        return this.zzg;
    }

    public final String zzb() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzc(Context context) {
        zzduv zzduvVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue() && (zzduvVar = this.zzg) != null) {
            zzduvVar.zzh(new zzav(this, context), zzduu.DEBUG_MENU);
        }
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzU(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeK), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeN), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzM(context, str, buildUpon.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized (this.zzb) {
            this.zzf = z;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzi().zzx(z);
                zzduv zzduvVar = this.zzg;
                if (zzduvVar != null) {
                    zzduvVar.zzl(z);
                }
            }
        }
    }

    public final void zzg(zzduv zzduvVar) {
        this.zzg = zzduvVar;
    }

    public final void zzh(boolean z) {
        synchronized (this.zzb) {
            this.zze = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public final void zzi(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
        } else {
            zzs.zza.post(new zzax(this, context, str, z, z2));
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String zzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeM), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzo.trim()).optString("debug_mode"));
            zzf(equals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
                zzg zzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
                if (true != equals) {
                    str = "";
                }
                zzi.zzw(str);
            }
            return equals;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    @androidx.annotation.VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzeL
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.zzp(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = zzo(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L25
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.ads.internal.util.client.zzo.zze(r4)
            return r0
        L25:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: org.json.JSONException -> L83
            r6.<init>(r4)     // Catch: org.json.JSONException -> L83
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch: org.json.JSONException -> L83
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch: org.json.JSONException -> L83
            r3.zza = r6     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbcc r6 = com.google.android.gms.internal.ads.zzbcl.zzjc     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: org.json.JSONException -> L83
            java.lang.Object r6 = r1.zza(r6)     // Catch: org.json.JSONException -> L83
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.booleanValue()     // Catch: org.json.JSONException -> L83
            r1 = 1
            if (r6 == 0) goto L79
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.zza     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto L66
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.zza     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.equals(r2)     // Catch: org.json.JSONException -> L83
            if (r6 == 0) goto L64
            goto L66
        L64:
            r6 = r0
            goto L67
        L66:
            r6 = r1
        L67:
            r3.zzf(r6)     // Catch: org.json.JSONException -> L83
            com.google.android.gms.internal.ads.zzbzm r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: org.json.JSONException -> L83
            com.google.android.gms.ads.internal.util.zzg r2 = r2.zzi()     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto L76
            java.lang.String r5 = ""
        L76:
            r2.zzw(r5)     // Catch: org.json.JSONException -> L83
        L79:
            java.lang.Object r5 = r3.zzb
            monitor-enter(r5)
            r3.zzd = r4     // Catch: java.lang.Throwable -> L80
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            return r1
        L80:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L80
            throw r4
        L83:
            r4 = move-exception
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzay.zzk(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzf;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zze;
        }
        return z;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && zzm()) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Sending troubleshooting signals to the server.");
            zze(context, str, str2, str3);
            return true;
        }
        return false;
    }
}
