package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzbg extends zzay {
    /* JADX INFO: Access modifiers changed from: protected */
    public zzbg() {
        this.zza.add(zzbv.AND);
        this.zza.add(zzbv.NOT);
        this.zza.add(zzbv.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        int i = zzbj.zza[zzg.zza(str).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.zza(str);
                }
                zzg.zza(zzbv.OR, 2, list);
                zzaq zza = zzhVar.zza(list.get(0));
                if (zza.zzd().booleanValue()) {
                    return zza;
                }
                return zzhVar.zza(list.get(1));
            }
            zzg.zza(zzbv.NOT, 1, list);
            return new zzag(Boolean.valueOf(!zzhVar.zza(list.get(0)).zzd().booleanValue()));
        }
        zzg.zza(zzbv.AND, 2, list);
        zzaq zza2 = zzhVar.zza(list.get(0));
        if (!zza2.zzd().booleanValue()) {
            return zza2;
        }
        return zzhVar.zza(list.get(1));
    }
}
