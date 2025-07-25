package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzblt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzev extends zzblt {
    final /* synthetic */ zzex zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzev(zzex zzexVar, zzew zzewVar) {
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzb(List list) throws RemoteException {
        Object obj;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        InitializationStatus zzA;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = false;
            this.zza.zzg = true;
            arrayList2 = this.zza.zze;
            arrayList = new ArrayList(arrayList2);
            arrayList3 = this.zza.zze;
            arrayList3.clear();
        }
        zzA = zzex.zzA(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzA);
        }
    }
}
