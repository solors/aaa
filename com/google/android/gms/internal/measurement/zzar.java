package com.google.android.gms.internal.measurement;

import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzar extends zzal {
    @VisibleForTesting
    private final List<String> zzk;
    @VisibleForTesting
    private final List<zzaq> zzl;
    @VisibleForTesting
    private zzh zzm;

    private zzar(zzar zzarVar) {
        super(zzarVar.zza);
        ArrayList arrayList = new ArrayList(zzarVar.zzk.size());
        this.zzk = arrayList;
        arrayList.addAll(zzarVar.zzk);
        ArrayList arrayList2 = new ArrayList(zzarVar.zzl.size());
        this.zzl = arrayList2;
        arrayList2.addAll(zzarVar.zzl);
        this.zzm = zzarVar.zzm;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        zzh zza = this.zzm.zza();
        for (int i = 0; i < this.zzk.size(); i++) {
            if (i < list.size()) {
                zza.zza(this.zzk.get(i), zzhVar.zza(list.get(i)));
            } else {
                zza.zza(this.zzk.get(i), zzaq.zzc);
            }
        }
        for (zzaq zzaqVar : this.zzl) {
            zzaq zza2 = zza.zza(zzaqVar);
            if (zza2 instanceof zzat) {
                zza2 = zza.zza(zzaqVar);
            }
            if (zza2 instanceof zzaj) {
                return ((zzaj) zza2).zza();
            }
        }
        return zzaq.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzal, com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzar(this);
    }

    public zzar(String str, List<zzaq> list, List<zzaq> list2, zzh zzhVar) {
        super(str);
        this.zzk = new ArrayList();
        this.zzm = zzhVar;
        if (!list.isEmpty()) {
            for (zzaq zzaqVar : list) {
                this.zzk.add(zzaqVar.zzf());
            }
        }
        this.zzl = new ArrayList(list2);
    }
}
