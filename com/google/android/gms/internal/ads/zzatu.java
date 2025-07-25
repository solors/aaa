package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzatu implements PackageManager.OnChecksumsReadyListener {
    final zzgdb zza = zzgdb.zze();

    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
    public final void onChecksumsReady(List list) {
        int type;
        byte[] value;
        if (list == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                type = apkChecksum.getType();
                if (type == 8) {
                    zzgdb zzgdbVar = this.zza;
                    zzgaa zzf = zzgaa.zzi().zzf();
                    value = apkChecksum.getValue();
                    zzgdbVar.zzc(zzf.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zzc("");
    }
}
