package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbye implements zzayk {
    private final Context zza;
    private final Object zzb;
    private final String zzc;
    private boolean zzd;

    public zzbye(Context context, String str) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = str;
        this.zzd = false;
        this.zzb = new Object();
    }

    public final String zza() {
        return this.zzc;
    }

    public final void zzb(boolean z) {
        if (!com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zza)) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd == z) {
                return;
            }
            this.zzd = z;
            if (TextUtils.isEmpty(this.zzc)) {
                return;
            }
            if (this.zzd) {
                com.google.android.gms.ads.internal.zzv.zzo().zzf(this.zza, this.zzc);
            } else {
                com.google.android.gms.ads.internal.zzv.zzo().zzg(this.zza, this.zzc);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayjVar) {
        zzb(zzayjVar.zzj);
    }
}
