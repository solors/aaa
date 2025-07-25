package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbcm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbdv.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbei.zza);
        zzc(arrayList, zzbei.zzb);
        zzc(arrayList, zzbei.zzc);
        zzc(arrayList, zzbei.zzd);
        zzc(arrayList, zzbei.zze);
        zzc(arrayList, zzbei.zzu);
        zzc(arrayList, zzbei.zzf);
        zzc(arrayList, zzbei.zzm);
        zzc(arrayList, zzbei.zzn);
        zzc(arrayList, zzbei.zzo);
        zzc(arrayList, zzbei.zzp);
        zzc(arrayList, zzbei.zzq);
        zzc(arrayList, zzbei.zzr);
        zzc(arrayList, zzbei.zzs);
        zzc(arrayList, zzbei.zzt);
        zzc(arrayList, zzbei.zzg);
        zzc(arrayList, zzbei.zzh);
        zzc(arrayList, zzbei.zzi);
        zzc(arrayList, zzbei.zzj);
        zzc(arrayList, zzbei.zzk);
        zzc(arrayList, zzbei.zzl);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbew.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbdv zzbdvVar) {
        String str = (String) zzbdvVar.zze();
        if (!TextUtils.isEmpty(str)) {
            list.add(str);
        }
    }
}
