package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzawl implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzawm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawl(zzawm zzawmVar) {
        this.zza = zzawmVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        long j;
        long j2;
        long j3;
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzawm zzawmVar = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        j = zzawmVar.zzc;
        if (j > 0) {
            zzawm zzawmVar2 = this.zza;
            j2 = zzawmVar2.zzc;
            if (currentTimeMillis >= j2) {
                j3 = zzawmVar2.zzc;
                zzawmVar2.zzd = currentTimeMillis - j3;
            }
        }
        this.zza.zze = false;
    }
}
