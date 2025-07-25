package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzdre;
import com.google.android.gms.internal.ads.zzfra;
import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfrf;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzb {
    private final Context zza;
    private final zzd zzb;
    private final long zzc;
    private final ScheduledExecutorService zzd;
    @Nullable
    private final PackageInfo zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(Context context, long j, @Nullable PackageInfo packageInfo, zzd zzdVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzc = j;
        this.zze = packageInfo;
        this.zzb = zzdVar;
        this.zzd = scheduledExecutorService;
    }

    public static String zzb(@Nullable String str) {
        if (str == null) {
            return "";
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i % 555));
        }
        return new String(charArray);
    }

    private final boolean zze() {
        if (this.zzb.zzf().size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhv)).intValue()) {
            return true;
        }
        return false;
    }

    private static final void zzf(Bundle bundle, zzdre zzdreVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhw)).booleanValue()) {
            return;
        }
        bundle.putLong(zzdreVar.zza(), com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
    }

    private static final void zzg(Bundle bundle, int i) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    @Nullable
    public final zzbk zza(zzbyy zzbyyVar, final zzau zzauVar, Bundle bundle) {
        long j;
        zzf(bundle, zzdre.SIGNAL_ON_DISK_VALIDATION_START);
        if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN()) {
            this.zzb.zzg();
            zzg(bundle, 7);
        } else if (this.zze == null) {
            this.zzb.zzg();
            zzg(bundle, 10);
        } else {
            zzd zzdVar = this.zzb;
            Context context = this.zza;
            String zze = zzdVar.zze();
            int zzb = zzdVar.zzb();
            String zzd = zzdVar.zzd();
            int zza = zzdVar.zza();
            if (TextUtils.equals(context.getApplicationInfo().packageName, zze) && zzb == this.zze.versionCode && TextUtils.equals(Build.MODEL, zzd) && zza == Build.VERSION.SDK_INT) {
                for (Map.Entry entry : this.zzb.zzf().entrySet()) {
                    try {
                        j = new JSONObject((String) entry.getValue()).getLong("ts_ms");
                    } catch (IOException | JSONException unused) {
                    }
                    if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - j <= ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhu)).longValue()) {
                        zzfra zzh = zzfre.zzj(this.zza).zzh(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdp)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                        zzfra zzh2 = zzfrf.zzi(this.zza).zzh(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdq)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                        if (zzh.zza() != -1) {
                            if (zzh.zza() > j) {
                            }
                        }
                        if (zzh2.zza() != -1 && zzh2.zza() > j) {
                        }
                    }
                    this.zzb.zzc((String) entry.getKey());
                }
            } else {
                this.zzb.zzg();
                this.zzb.zzi(this.zza.getApplicationInfo().packageName, this.zze.versionCode, Build.MODEL, Build.VERSION.SDK_INT);
            }
            zzf(bundle, zzdre.SIGNAL_ON_DISK_VALIDATION_END);
            if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zzc > ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhr)).longValue()) {
                zzg(bundle, 2);
                return null;
            }
            zzf(bundle, zzdre.SIGNAL_ON_DISK_CACHE_KEY_START);
            String str = zzbyyVar.zza;
            String str2 = zzbyyVar.zzb;
            String bundle2 = zzbyyVar.zzd.zzn.toString();
            String bundle3 = zzbyyVar.zzd.zzc.toString();
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzbyyVar.zzd;
            String str3 = zzmVar.zzi;
            String str4 = zzmVar.zzp;
            String valueOf = String.valueOf(zzmVar.zzo);
            final String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str + str2 + bundle2 + bundle3 + str3 + str4 + valueOf);
            if (TextUtils.isEmpty(zzg)) {
                zzg(bundle, 3);
                return null;
            }
            zzf(bundle, zzdre.SIGNAL_ON_DISK_CACHE_KEY_END);
            zzf(bundle, zzdre.SIGNAL_ON_DISK_READ_AND_REMOVE_START);
            String zzc = this.zzb.zzc(zzg);
            zzf(bundle, zzdre.SIGNAL_ON_DISK_READ_AND_REMOVE_END);
            if (!zze()) {
                final zzbyy zzbyyVar2 = new zzbyy(zzbyyVar.zza, zzbyyVar.zzb, zzbyyVar.zzc, zzbyyVar.zzd, 2, zzg);
                this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzb.this.zzc(zzg, zzauVar, zzbyyVar2);
                    }
                }, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzht)).longValue(), TimeUnit.MILLISECONDS);
            }
            if (TextUtils.isEmpty(zzc)) {
                zzg(bundle, 4);
                return null;
            }
            zzf(bundle, zzdre.SIGNAL_ON_DISK_DECODE_START);
            try {
                JSONObject jSONObject = new JSONObject(zzc);
                String string = jSONObject.getString("sr");
                if (TextUtils.isEmpty(string)) {
                    zzg(bundle, 8);
                    return null;
                }
                String string2 = jSONObject.getString("rs");
                if (TextUtils.isEmpty(string2)) {
                    zzg(bundle, 9);
                    return null;
                }
                String zzb2 = zzb(new String(Base64.decode(string2, 10), StandardCharsets.UTF_8));
                zzf(bundle, zzdre.SIGNAL_ON_DISK_DECODE_END);
                try {
                    zzbk zzbkVar = new zzbk(new JsonReader(new StringReader(string)), null);
                    zzbkVar.zzc = zzb2;
                    zzbkVar.zze = bundle;
                    bundle.putBoolean("sod_h", true);
                    return zzbkVar;
                } catch (IOException e) {
                    zzg(bundle, 6);
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "DiskCachingManager.getSignalResponse");
                    return null;
                }
            } catch (JSONException e2) {
                zzg(bundle, 5);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "DiskCachingManager.getSignalResponse");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(String str, zzau zzauVar, zzbyy zzbyyVar) {
        if (!this.zzb.zzj(str) && !zze()) {
            zzauVar.zzf(ObjectWrapper.wrap(this.zza), zzbyyVar, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(@androidx.annotation.Nullable java.lang.String r6, @androidx.annotation.Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbk r7) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L79
            boolean r0 = r5.zze()
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L60
            r1.<init>()     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = "params"
            java.lang.String r3 = r7.zza     // Catch: org.json.JSONException -> L60
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = "signal_dictionary"
            com.google.android.gms.ads.internal.util.client.zzf r3 = com.google.android.gms.ads.internal.client.zzbc.zzb()     // Catch: org.json.JSONException -> L60
            android.os.Bundle r4 = r7.zzf     // Catch: org.json.JSONException -> L60
            org.json.JSONObject r3 = r3.zzi(r4)     // Catch: org.json.JSONException -> L60
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = "sr"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L60
            java.lang.String r7 = r7.zzc     // Catch: org.json.JSONException -> L60
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L60
            if (r1 == 0) goto L3d
            java.lang.String r7 = ""
            goto L6e
        L3d:
            java.lang.String r7 = zzb(r7)     // Catch: org.json.JSONException -> L60
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: org.json.JSONException -> L60
            byte[] r7 = r7.getBytes(r1)     // Catch: org.json.JSONException -> L60
            r1 = 10
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r1)     // Catch: org.json.JSONException -> L60
            java.lang.String r1 = "rs"
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L60
            java.lang.String r7 = "ts_ms"
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch: org.json.JSONException -> L60
            long r1 = r1.currentTimeMillis()     // Catch: org.json.JSONException -> L60
            r0.put(r7, r1)     // Catch: org.json.JSONException -> L60
            goto L6a
        L60:
            r7 = move-exception
            java.lang.String r1 = "DiskCachingManager.createStringToWrite"
            com.google.android.gms.internal.ads.zzbzm r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r7, r1)
        L6a:
            java.lang.String r7 = r0.toString()
        L6e:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L79
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r0 = r5.zzb
            r0.zzh(r6, r7)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzb.zzd(java.lang.String, com.google.android.gms.ads.nonagon.signalgeneration.zzbk):void");
    }
}
