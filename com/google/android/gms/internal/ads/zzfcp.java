package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfcp {
    public static com.google.android.gms.ads.internal.client.zzs zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfbp zzfbpVar = (zzfbp) it.next();
            if (zzfbpVar.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfbpVar.zza, zzfbpVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzs(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfbp zzb(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        if (zzsVar.zzi) {
            return new zzfbp(-3, 0, true);
        }
        return new zzfbp(zzsVar.zze, zzsVar.zzb, false);
    }
}
