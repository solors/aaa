package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgbp extends zzgbr {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbp(zzfxi zzfxiVar, boolean z) {
        super(zzfxiVar, z);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgbr
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        Object obj;
        ArrayList zza = zzfyd.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgbq zzgbqVar = (zzgbq) it.next();
            if (zzgbqVar != null) {
                obj = zzgbqVar.zza;
            } else {
                obj = null;
            }
            zza.add(obj);
        }
        return Collections.unmodifiableList(zza);
    }
}
