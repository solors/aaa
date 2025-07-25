package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdpj {
    private final Map zza = new HashMap();

    public final synchronized zzdpi zza(String str) {
        return (zzdpi) this.zza.get(str);
    }

    public final String zzb(String str) {
        zzbrs zzbrsVar;
        zzdpi zza = zza(str);
        if (zza != null && (zzbrsVar = zza.zzb) != null) {
            return zzbrsVar.toString();
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzc(java.lang.String r6, com.google.android.gms.internal.ads.zzfdh r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.Map r0 = r5.zza     // Catch: java.lang.Throwable -> L43
            boolean r0 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto Lb
            monitor-exit(r5)
            return
        Lb:
            com.google.android.gms.internal.ads.zzdpi r0 = new com.google.android.gms.internal.ads.zzdpi     // Catch: java.lang.Throwable -> L43
            r1 = 0
            if (r7 != 0) goto L12
        L10:
            r2 = r1
            goto L16
        L12:
            com.google.android.gms.internal.ads.zzbrs r2 = r7.zze()     // Catch: com.google.android.gms.internal.ads.zzfcq -> L10 java.lang.Throwable -> L43
        L16:
            if (r7 != 0) goto L19
            goto L1d
        L19:
            com.google.android.gms.internal.ads.zzbrs r1 = r7.zzf()     // Catch: com.google.android.gms.internal.ads.zzfcq -> L1d java.lang.Throwable -> L43
        L1d:
            com.google.android.gms.internal.ads.zzbcc r3 = com.google.android.gms.internal.ads.zzbcl.zzjk     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r3 = r4.zza(r3)     // Catch: java.lang.Throwable -> L43
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L43
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L43
            r4 = 1
            if (r3 != 0) goto L31
            goto L39
        L31:
            r3 = 0
            if (r7 != 0) goto L36
        L34:
            r4 = r3
            goto L39
        L36:
            r7.zzC()     // Catch: com.google.android.gms.internal.ads.zzfcq -> L34 java.lang.Throwable -> L43
        L39:
            r0.<init>(r6, r2, r1, r4)     // Catch: java.lang.Throwable -> L43
            java.util.Map r7 = r5.zza     // Catch: java.lang.Throwable -> L43
            r7.put(r6, r0)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r5)
            return
        L43:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpj.zzc(java.lang.String, com.google.android.gms.internal.ads.zzfdh):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzd(String str, zzbrd zzbrdVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdpi(str, zzbrdVar.zzf(), zzbrdVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
